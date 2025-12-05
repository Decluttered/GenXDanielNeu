package Logs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;
import java.util.Scanner;


import Application.GenX;

public class Read {
	
	public static LocalDateTime LDT = LocalDateTime.now();
	public static DateTimeFormatter LDT_Format = DateTimeFormatter.ofPattern("  dd.MM.yyyy HH:mm:ss  ");
	public static Properties p = new Properties();
	public static String lastUsedDate = LDT.format(LDT_Format);
	public static GenX x = new GenX();
	public static Write w = new Write();
	
	
	public static int ReadLogs() throws IOException
	{

		BufferedReader reader = new BufferedReader(new FileReader("C:/Users/WACKED01/Desktop/GEN_X/Logdaten/LogDaten.txt"));
		int lines = 0;
		while (reader.readLine() != null) lines++;
		
		
		return lines;
	}
	
	
	public static int[] ReadNumbers() throws IOException
	{
		int AnzahlAnEinträgen = 0;

		int[] SendungsAnzahl = new int[6];
		int[] AnzahlUngültig = new int[1];
		int[] AnzahlSemigültig = new int[1];
		int[] AnzahlGültig = new int[1];
		int[] AnzahlGefahrgut = new int[1];
		int[] AnzahlAmbient = new int[1];
		int[] AnzahlKTL = new int[1];
		
		int AA = 0;
		int anzAU = 1;
		int anzU = 2;
		int anzS = 3;
		int anzG = 4;
		int anzGG = 5;
		int anzA = 6;
		int anzK = 7;
		
		int summeUngültigGesamt = 0;
		int summeSemigültigGesamt = 0;
		int summeGültigGesamt = 0;
		int summeGefahrgutGesamt = 0;
		int summeAmbientGesamt = 0;
		int summeKTLGesamt = 0;
		
		
		AnzahlAnEinträgen = (ReadLogs()/7);
	
		System.out.println(AnzahlAnEinträgen);
		

		int anfang[] = new int[AnzahlAnEinträgen];
		int ungültig[] = new int[AnzahlAnEinträgen];
		int semigültig[] = new int[AnzahlAnEinträgen];
		int gültig[] = new int[AnzahlAnEinträgen];
		int gefahr[] = new int[AnzahlAnEinträgen];
		int ambient[] = new int[AnzahlAnEinträgen];
		int ktl[] = new int[AnzahlAnEinträgen];
		
		anfang[0] =  anzAU;
		ungültig[0] =  anzU;
  		semigültig[0] =  anzS;
  		gültig[0] =  anzG;
  		gefahr[0] =  anzGG;
  		ambient[0] =  anzA;
  		ktl[0] =  anzK;
		
  		

		for(int i = 1; i<AnzahlAnEinträgen;i++)
		{		
			
			anzAU = anzAU + 7;
			anzU = anzU + 7;
			anzS = anzS + 7;
			anzG = anzG + 7;
			anzGG = anzGG + 7;
			anzA = anzA + 7;
			anzK = anzK + 7;
			
			anfang[i] =  anzAU;
			ungültig[i] =  anzU;
	  		semigültig[i] =  anzS;
	  		gültig[i] =  anzG;
	  		gefahr[i] =  anzGG;
	  		ambient[i] =  anzA;
	  		ktl[i] =  anzK;
	  	
	  		String line00 = Files.readAllLines(Paths.get("C:/Users/WACKED01/Desktop/GEN_X/Logdaten/LogDaten.txt")).get(anfang[i]);
			String line01 = Files.readAllLines(Paths.get("C:/Users/WACKED01/Desktop/GEN_X/Logdaten/LogDaten.txt")).get(ungültig[i]);
			String line02 = Files.readAllLines(Paths.get("C:/Users/WACKED01/Desktop/GEN_X/Logdaten/LogDaten.txt")).get(semigültig[i]);
			String line03 = Files.readAllLines(Paths.get("C:/Users/WACKED01/Desktop/GEN_X/Logdaten/LogDaten.txt")).get(gültig[i]);
			String line04 = Files.readAllLines(Paths.get("C:/Users/WACKED01/Desktop/GEN_X/Logdaten/LogDaten.txt")).get(gefahr[i]);
			String line05 = Files.readAllLines(Paths.get("C:/Users/WACKED01/Desktop/GEN_X/Logdaten/LogDaten.txt")).get(ambient[i]);
			
			System.out.println();
			System.out.println(line00);
			System.out.println(line01);
			System.out.println(line02);
			System.out.println(line03);
			System.out.println(line04);
			System.out.println(line05);
			
			char Anf = line00.charAt(50-2);
			char Ung = line01.charAt(51-1);
			char Sem = line02.charAt(47-1);
			char Gül = line03.charAt(56-1);
			char Gef = line04.charAt(48-1);
			char Amb = line05.charAt(49-1);
	
			System.out.println();
			System.out.println(Anf);
			System.out.println(Ung);
			System.out.println(Sem);
			System.out.println(Gül);
			System.out.println(Gef);
			System.out.println(Amb);
			
			int anzahlKTLSendungen = Anf - '0';
			int anzahlUngültigerSendungen = Ung - '0';
			int anzahlSemigültigerSendungen = Sem - '0';
			int anzahlGültigerSendungen = Gül - '0';
			int anzahlGefahrgutSendungen = Gef - '0';
			int anzahlAmbientSendungen = Amb - '0';
			
			System.out.println();
			System.out.println(anzahlKTLSendungen);
			System.out.println(anzahlUngültigerSendungen);
			System.out.println(anzahlSemigültigerSendungen);
			System.out.println(anzahlGültigerSendungen);
			System.out.println(anzahlGefahrgutSendungen);
			System.out.println(anzahlAmbientSendungen);

			
			
			
			summeUngültigGesamt += anzahlKTLSendungen;
			summeSemigültigGesamt += anzahlUngültigerSendungen;
			summeGültigGesamt += anzahlSemigültigerSendungen;
			summeGefahrgutGesamt += anzahlGültigerSendungen;
			summeAmbientGesamt += anzahlGefahrgutSendungen;
			summeKTLGesamt += anzahlAmbientSendungen;
			
			System.out.println();
			System.out.println(summeUngültigGesamt);
			System.out.println(summeSemigültigGesamt);
			System.out.println(summeGültigGesamt);
			System.out.println(summeGefahrgutGesamt);
			System.out.println(summeAmbientGesamt);
			System.out.println(summeKTLGesamt);
			
			SendungsAnzahl[0] = summeUngültigGesamt;
			SendungsAnzahl[1] = summeSemigültigGesamt;
			SendungsAnzahl[2] = summeGültigGesamt;
			SendungsAnzahl[3] = summeGefahrgutGesamt;
			SendungsAnzahl[4] = summeAmbientGesamt;
			SendungsAnzahl[5] = summeKTLGesamt;
			
			System.out.println(Arrays.toString(SendungsAnzahl));

	
			AnzahlUngültig[0] += summeUngültigGesamt;
			AnzahlSemigültig[0] += summeSemigültigGesamt;
			AnzahlGültig[0] += summeGültigGesamt;
			AnzahlGefahrgut[0] += summeGefahrgutGesamt;
			AnzahlAmbient[0] += summeAmbientGesamt;
			AnzahlKTL[0] += summeKTLGesamt;
			
			System.out.println();
			System.out.println(Arrays.toString(AnzahlUngültig));
			System.out.println(Arrays.toString(AnzahlSemigültig));
			System.out.println(Arrays.toString(AnzahlGültig));
			System.out.println(Arrays.toString(AnzahlGefahrgut));
			System.out.println(Arrays.toString(AnzahlAmbient));
			System.out.println(Arrays.toString(AnzahlKTL));
			
			
		}
		
		return SendungsAnzahl;
	}
	
	
	public static void main(String[] args) throws IOException {
		
		
		ReadNumbers();
//		int[] arr = ReadNumbers();
//		System.out.println(Arrays.toString(ReadNumbers()));
		
		
		
		
	}

}
