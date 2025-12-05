package Logs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Application.GenXAuto;


public class WriteAuto {
	

	
	public static void Write()
	{

		GenXAuto x = new GenXAuto();

		try {
			 			

			 File ff = new File("C:/Users/WACKED01/Desktop/GEN_X/LogDatenAuto.txt");	
			 PrintWriter printWriter = new PrintWriter(new FileWriter(ff, true));
			 

			 
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

	public static void main(String[] args) {

		Write();

	}

}
