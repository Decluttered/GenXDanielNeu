package Barcodes;

import java.io.IOException;
import java.util.Arrays;

import Logs.Read;
import Logs.ReadAnzahlDurchläufe;
import Logs.ReadTestcases;

public class Barcodes {
	
	private static final ReadTestcases readTestcases = new ReadTestcases();
	private static final String BCV = "34455";
	private static final String FULL = "10000000000";
	private static final String ColliBarcodeVersion1 = "02000000000";
	private static final String ColliBarcodeVersion2 = "12000000000";
	private static final String PLZ = "4985345";
	

	public static String BarcodeCollis0(int i) throws IOException
	{		
		int anzahlDurchläufe = readTestcases.ReadNumbers();
		anzahlDurchläufe = anzahlDurchläufe + i;
		int x = anzahlDurchläufe;
		String xx = ColliBarcodeVersion1;

		if(anzahlDurchläufe>9) 
			xx =  ColliBarcodeVersion1.substring(0, 10);		
		if(anzahlDurchläufe>99) 
			xx = ColliBarcodeVersion1.substring(0, 9);			
		if(anzahlDurchläufe>999) 
			xx =  ColliBarcodeVersion1.substring(0, 8);			
		if(anzahlDurchläufe>9999) 
			xx = ColliBarcodeVersion1.substring(0, 7);			
		if(anzahlDurchläufe>99999) 
			xx = ColliBarcodeVersion1.substring(0, 6);			
		if(anzahlDurchläufe>999999) 
			xx = ColliBarcodeVersion1.substring(0, 5);			
		if(anzahlDurchläufe>9999999) 
			xx = ColliBarcodeVersion1.substring(0, 4);			
		if(anzahlDurchläufe>99999999) 
			xx = ColliBarcodeVersion1.substring(0, 3);			
		if(anzahlDurchläufe>999999999) 
			xx = ColliBarcodeVersion1.substring(0, 2);
			
		String a = xx + Integer.toString(x);
		System.out.println("Barcode für Collis Version 1: "+a);
		return a;
	}
	
	public static String BarcodeCollis1(int i) throws IOException
	{
		
		int anzahlDurchläufe = readTestcases.ReadNumbers();
		anzahlDurchläufe = anzahlDurchläufe + i;
		int x = anzahlDurchläufe;
		String xx = ColliBarcodeVersion2;

		if(anzahlDurchläufe>9) 
			xx =  ColliBarcodeVersion2.substring(0, 10);		
		if(anzahlDurchläufe>99) 
			xx = ColliBarcodeVersion2.substring(0, 9);			
		if(anzahlDurchläufe>999) 
			xx =  ColliBarcodeVersion2.substring(0, 8);			
		if(anzahlDurchläufe>9999) 
			xx = ColliBarcodeVersion2.substring(0, 7);			
		if(anzahlDurchläufe>99999) 
			xx = ColliBarcodeVersion2.substring(0, 6);			
		if(anzahlDurchläufe>999999) 
			xx = ColliBarcodeVersion2.substring(0, 5);			
		if(anzahlDurchläufe>9999999) 
			xx = ColliBarcodeVersion2.substring(0, 4);			
		if(anzahlDurchläufe>99999999) 
			xx = ColliBarcodeVersion2.substring(0, 3);			
		if(anzahlDurchläufe>999999999) 
			xx = ColliBarcodeVersion2.substring(0, 2);
			
		String a = xx + Integer.toString(x);
		System.out.println("Barcode für Collis Version 2: "+a);
		return a;
	}
	

	

}

