package Logs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Application.GenX;


public class Write {
	

	
	public static void Write()
	{

		GenX x = new GenX();

		try {
			 
			
//			 File ff = new File("C:\\\\Users\\\\WACKED01\\\\git\\\\repository\\\\AP\\\\src\\\\main/LogDaten.txt");	
//			 File ff2 = new File("src/main/java/LogDaten.txt");	
			 File ff2 = new File("C:/Users/WACKED01/Desktop/GEN_X/Logdaten/LogDaten.txt");	
//			 PrintWriter printWriter = new PrintWriter(new FileWriter(ff, true));
			 PrintWriter printWriter = new PrintWriter(new FileWriter(ff2, true));
			 

			 
			 printWriter.write(x.lastUsedDate+" \n ");
			 printWriter.write("Anzahl erzeugter Sendungen die Ungultig sind : "+ x.anzahlSendungen_Ungültig +" \n ");
			 printWriter.write("Anzahl erzeugter Sendungen die Semigultig sind : "+ x.anzahlSendungen_Semigültig +"\n ");
//			 printWriter.write("Anzahl erzeugter Sendungen die Gultig sind : "+ x.anzahlSendungen_Gültig +"\n ");
			 printWriter.write("Anzahl erzeugter Sendungen die Gultig sind : 1 \n ");
			 printWriter.write("Anzahl erzeugter Sendungen die Gefahrgut enthalten  : "+ x.anzahlSendungen_Gefahrgut +"\n ");
			 printWriter.write("Anzahl erzeugter Sendungen die Ambient sind : "+ x.anzahlSendungen_Ambient +"\n ");
			 printWriter.write("Anzahl erzeugter Sendungen die KTL enthalten : "+ x.anzahlSendungen_KTL +"\n ");
			 printWriter.close();
			 
			
			
		}
		catch(IOException e){
			 System.out.println("An error occurred.");
		     e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {

		Write();

	}

}
