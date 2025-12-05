package Application;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Properties;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import javax.xml.bind.JAXBException;

import Expecco.ExpeccoStepLogger;
import Logs.ReadAnzahlDurchläufe;
import Logs.WriteAuto;
import Ordner.OrdnerErstellen;
import Sendungen.Sendung;
	

public class GenXAuto {
	
	
	public static WriteAuto writeAuto =  new WriteAuto();
	public static ReadAnzahlDurchläufe readAnzahlDurchläufe = new ReadAnzahlDurchläufe();
	public static OrdnerErstellen o = new OrdnerErstellen();

	public static LocalDateTime LDT = LocalDateTime.now();
	public static DateTimeFormatter LDT_Format = DateTimeFormatter.ofPattern("  dd.MM.yyyy HH:mm:ss  ");
	public static Properties p = new Properties();
	public static String lastUsedDate = LDT.format(LDT_Format);
	public static String anzahl_Durchläufe;
	public static String aktuellesDatum;
	
	
	
	public static Scanner sc = new Scanner(System.in);
	public static Scanner sc2 = new Scanner(System.in);
	public static Scanner sc3 = new Scanner(System.in);
	
	
	public static int i = 0;
	public static int x = 0;
	public static int zahl;
	public static int anzahlDurchläufe;
	public static int anzahlSendungenValide;
	public static int anzahlSendungenAmbient;


	
	
	public static final String speicherOrt = "C:\\Users\\WACKED01\\Documents\\Sendungsdateien\\SendungenAuto\\10 Sekunden";
	public static final String speicherOrt2 = "C:\\Users\\WACKED01\\Documents\\Sendungsdateien\\SendungenAuto\\1 Minute";
	public static final String speicherOrt3 = "C:\\Users\\WACKED01\\Documents\\Sendungsdateien\\SendungenAuto\\1 Stunde";
	public static final String speicherOrt4 = "C:\\Users\\WACKED01\\Documents\\Sendungsdateien\\SendungenAuto\\24 Stunden";

			
			
	public static void main(String[] args) throws IOException, JAXBException {
			
		anzahlDurchläufe = readAnzahlDurchläufe.ReadNumbers();
		System.out.println("Anzahl Durchläufe: "+anzahlDurchläufe);
		
		TimerTask task = new TimerTask() {
            public void run() 
                {
            		
                    i++;  
                    zahl = i;       
                    LocalDate LD = LocalDate.now();
                    LocalDateTime LDT = LocalDateTime.now();
                    int z = (int) (LD.toEpochDay());
                    
                    DateTimeFormatter LDT_Format = DateTimeFormatter.ofPattern("dd.MM.yyyy HH.mm.ss"); 
                    aktuellesDatum = LDT.format(LDT_Format);
                    
                    try {
                        OrdnerErstellen.OrdnerErstellen();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    
                    System.out.println(LDT.format(LDT_Format));
                    System.out.println(z);    
                    System.out.println("Stand: " + i );
                    System.out.println(zahl);
                    
                }
            };
            		
        TimerTask task2 = new TimerTask() {
            public void run() 
                {                           
                    try {
                    	
                        Sendung.write(); 
                        anzahlDurchläufe++;
                        anzahlSendungenValide=4;
                        anzahlSendungenAmbient=1;
                        writeAuto.Write();
						readAnzahlDurchläufe.ReadNumbers();
                        
                    } catch (IOException |JAXBException e) {                            
                        e.printStackTrace();
                    }          
                }
            };
        Timer timer = new Timer();
		Timer timer2 = new Timer();
		Timer timer3 = new Timer();
		Timer timer4 = new Timer();
        
		
        
		Calendar date = Calendar.getInstance();
		date.set(Calendar.YEAR,2025);
		date.set(Calendar.MONTH,Calendar.NOVEMBER);
		date.set(Calendar.DAY_OF_MONTH,28);
		date.set(Calendar.HOUR_OF_DAY,16);
		date.set(Calendar.MINUTE,0);
		date.set(Calendar.SECOND,0);
		
		long tag = 86400000L;
		long stunde = 3600000L;
		int ZehnMinuten = 600000;
		int minute = 60000;
		int NeunSekunden = 9000;
		int ZehnSekunden = 10000;
		
		timer.scheduleAtFixedRate(task, 3000, ZehnSekunden);
		timer.scheduleAtFixedRate(task2, 3000, ZehnSekunden);
		ExpeccoStepLogger.logStep("GenX Auto gestartet: Alle " + (ZehnSekunden/1000) + " Sekunden wird ein Durchlauf gestartet.");
	
		
		
	}
		
			
		
		
		
}
