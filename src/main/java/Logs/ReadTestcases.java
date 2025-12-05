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

import Zeitversionen.ZeitVersionAuswahl;


public class ReadTestcases {
	
	
	private static int ReadLogs() throws IOException
	{
		
		BufferedReader reader = new BufferedReader(new FileReader(ZeitVersionAuswahl.Logdatei()));
		int lines = 0;
		while (reader.readLine() != null) lines++;
		
		return lines;
	}
	
	
	public static int ReadNumbers() throws IOException
	{
		
		int AnzahlAnEinträgen =  (ReadLogs()/4);
		int durchläufeIndex = 1;
		int anzahlDurchläufe[] = new int[AnzahlAnEinträgen];
		anzahlDurchläufe[0] =  0;
		int anzahlAnDurchläufen = 0;
  		

		for(int i = 0; i<AnzahlAnEinträgen;i++)
		{				
			anzahlDurchläufe[i] =  durchläufeIndex;
			durchläufeIndex = durchläufeIndex + 4;
	  		String line01 = Files.readAllLines(Paths.
	  		get(ZeitVersionAuswahl.Logdateipfad())).get(anzahlDurchläufe[i]);
			String dur = line01.substring(25, line01.length());
			anzahlAnDurchläufen = Integer.parseInt(dur.trim());
		}
		
		System.out.println(anzahlAnDurchläufen);
		return anzahlAnDurchläufen;
		
	}
	
}
