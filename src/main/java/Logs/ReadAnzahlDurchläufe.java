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




public class ReadAnzahlDurchläufe {
	
	public static LocalDateTime LDT = LocalDateTime.now();
	public static DateTimeFormatter LDT_Format = DateTimeFormatter.ofPattern("  dd.MM.yyyy HH:mm:ss  ");
	public static Properties p = new Properties();
	public static String lastUsedDate = LDT.format(LDT_Format);

	
	public static int ReadLogs() throws IOException
	{
		
		BufferedReader reader = new BufferedReader(new FileReader("C:/Users/WACKED01/Desktop/GEN_X/LogDatenAuto.txt"));
		int lines = 0;
		while (reader.readLine() != null) lines++;
		
		
		return lines;
	}
	
	
	public static int ReadNumbers() throws IOException
	{
		
		int AnzahlAnEinträgen =  (ReadLogs()/4);
		int[] AnzahlEinträge = new int[1];
		int durchläufeIndex = 1;
		int summeDurchläufeGesamt2 = 0;
		int anzahlDurchläufe[] = new int[AnzahlAnEinträgen];
		anzahlDurchläufe[0] =  0;
		int anzahlAnDurchläufen2 = 0;

  		

		for(int i = 0; i<AnzahlAnEinträgen;i++)
		{				
			
			anzahlDurchläufe[i] =  durchläufeIndex;
			durchläufeIndex = durchläufeIndex + 4;
	  		String line01 = Files.readAllLines(Paths.
	  		get("C:/Users/WACKED01/Desktop/GEN_X/LogDatenAuto.txt")).get(anzahlDurchläufe[i]);
			String dur = line01.substring(25, line01.length());
			anzahlAnDurchläufen2 = Integer.parseInt(dur.trim());
			summeDurchläufeGesamt2 += anzahlAnDurchläufen2;
			AnzahlEinträge[0] = summeDurchläufeGesamt2;		
			
		}
		
		System.out.println(anzahlAnDurchläufen2);
		return anzahlAnDurchläufen2;
	}
	
	
	public static void main(String[] args) throws IOException 	
	{
		ReadNumbers();
	}
		

	

}
