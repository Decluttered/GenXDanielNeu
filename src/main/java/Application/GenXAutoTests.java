package Application;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;
import javax.xml.bind.JAXBException;

import Expecco.ExpeccoStepLogger;
import Logs.ReadTestcases;
import Logs.WriteTestcases;
import Ordner.OrdnerErstellenTestcase;
import Sendungen.Sendung;
import Zeitversionen.ZeitVersionAuswahl;
	

public class GenXAutoTests {
	
	
	private static final WriteTestcases writeTestcases =  new WriteTestcases();
	private static final ReadTestcases readTestcases = new ReadTestcases();

	private static final LocalDateTime LDT = LocalDateTime.now();
	private static final DateTimeFormatter LDT_Format = DateTimeFormatter.ofPattern("dd.MM.yyyy HH.mm.ss");
	public static String aktuellesDatum;
	

	public static int anzahlDurchläufe;
	public static final int anzahlSendungenValide=4;
	public static final int anzahlSendungenAmbient=1;

    private static int Anzahl() throws IOException
    {
        anzahlDurchläufe = readTestcases.ReadNumbers();
        return anzahlDurchläufe;
    }

    private static int Zähler(int anzahlDurchläufe) throws IOException
    {
        anzahlDurchläufe = anzahlDurchläufe+1;
        return anzahlDurchläufe;
    }
			
	public static void main(String[] args) throws IOException, JAXBException {

        Anzahl();	

		TimerTask task = new TimerTask() {
            public void run() 
                {                                    
                    aktuellesDatum = LDT.format(LDT_Format);                    
                    try { 
                        OrdnerErstellenTestcase.OrdnerErstellen();
                        anzahlDurchläufe = anzahlDurchläufe+1;
                        //Zähler(anzahlDurchläufe);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }                        
                }
            };
            		
        TimerTask task2 = new TimerTask() {
            public void run() 
                {                           
                    try {

                        writeTestcases.Write();
						readTestcases.ReadNumbers();
                        Sendung.write(); 
                        
                    } catch (IOException |JAXBException e) {                            
                        e.printStackTrace();
                    }          
                }
            };
        Timer timer = new Timer();
		//Ein delay von 1 Sekunde für die Sendungsgenerierung damit der Ordner zuerst erstellt werden kann bevor die Sendungen generiert wird,
		// sonst ist kein Ordner vorhanden in dem die Sendungen gespeichert werden können
		int delay = 1000;	
        

		
		timer.scheduleAtFixedRate(task, 3000, ZeitVersionAuswahl.Zeitintervall());
		timer.scheduleAtFixedRate(task2, 3000, ZeitVersionAuswahl.Zeitintervall()+delay);
		ExpeccoStepLogger.logStep("GenX Auto gestartet: Alle " + (ZeitVersionAuswahl.Zeitintervall()/1000) + " Sekunden wird ein Durchlauf gestartet.");
		
	}
		
			
		
		
		
}
