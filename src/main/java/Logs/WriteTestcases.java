package Logs;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import Application.GenXAutoTests;
import Zeitversionen.ZeitVersionAuswahl;


public class WriteTestcases {

	public static void Write()
	{
				
		GenXAutoTests x = new GenXAutoTests();

			try {
			 			

			 File file = ZeitVersionAuswahl.Logdatei();	
			 PrintWriter printWriter = new PrintWriter(new FileWriter(file, true));
			 
			 printWriter.write(x.aktuellesDatum+" \n ");
			 printWriter.write("Anzahl an Durchläufen : "+ x.anzahlDurchläufe +" \n ");
			 printWriter.write("Anzahl erzeugter Sendungen die Valide sind : "+ x.anzahlSendungenValide +"\n ");
			 printWriter.write("Anzahl erzeugter Sendungen die Ambient sind : "+ x.anzahlSendungenAmbient +"\n ");
			 printWriter.close();
			 
		}
		catch(IOException e){
			 System.out.println("An error occurred.");
		     e.printStackTrace();
		}
		
	}

}
