package Application;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;
import java.util.Scanner;
import java.util.Timer;

import javax.xml.bind.JAXBException;


import Logs.*;
import Sendungen.Sendung;


public class GenX {


	public static Write l =  new Write();
	public static Read r = new Read();
	public static Sendung sd = new Sendung();
	public static LocalDateTime LDT = LocalDateTime.now();
	public static DateTimeFormatter LDT_Format = DateTimeFormatter.ofPattern("  dd.MM.yyyy HH:mm:ss ");
	public static Properties p = new Properties();
	public static String lastUsedDate = LDT.format(LDT_Format);
	public static String anzahl_Durchläufe;
	
	
	
	public static Scanner sc = new Scanner(System.in);
	public static Scanner sc2 = new Scanner(System.in);
	public static Scanner sc3 = new Scanner(System.in);
	
	
	public static int i = 0;
	public static int x = 0;
	public static int anzahlSendungen;
	public static int anzahlSendungen_Gültig;
	public static int anzahlSendungen_Semigültig;
	public static int anzahlSendungen_Ungültig;
	public static int anzahlSendungen_Ambient;
	public static int anzahlSendungen_Gefahrgut;
	public static int anzahlSendungen_KTL;
	public static int anzahlSendungen_Thermomed;
	public static int anzahlSendungen_Nachtdienst;
	public static int Sendungsart;
	public static int Gebiet;
	
	
	public static String speicherOrt;
	public static String dateiName;
	
	
	public static void main(String[] args) throws IOException, JAXBException {
		
	
		
		while(x<4)
		{		
			
			
			
			while(x==0)
			{
				
				
				System.out.println("Wie viele Sendungen möchtest du?");
				anzahlSendungen = sc.nextInt();
				
				x++;
		
					while(x==1)
					{
						
						System.out.println("Wie sollen diese Sendungen heißen?");
						dateiName =sc2.nextLine();
						boolean allNumbers = dateiName.chars().allMatch(Character::isLetterOrDigit);
						
						if(allNumbers) x++;
						else System.err.println("Ungültiger Name");
						
						
						while(x==2)
						{
							
							System.out.println("Wo sollen diese Sendungen gespeichert werden?");
							speicherOrt =sc3.nextLine();
							File f = new File(speicherOrt);
							
						
							if(f.exists()) 
							{
									Sendung.write();
									x++;
							}
							
							else System.err.println("Nicht existierender Dateipfad");
							
							
							while(x==3)
							{
								
								System.out.println(anzahlSendungen_Gültig+anzahlSendungen_Ungültig+
										anzahlSendungen_Semigültig+anzahlSendungen_Gefahrgut+anzahlSendungen_Ambient+
										anzahlSendungen_KTL +" Dateien wurden in: " + speicherOrt + " gespeichert");
								
								
								
								i++;
								System.out.println(i);
								System.out.println(speicherOrt);
								anzahl_Durchläufe = Integer.toString(i);
								l.Write();
//								l2.Write();
								r.ReadNumbers();
//								r5.ReadNumbers();
								//r2.ReadNumbers();
								
								
			
								x++;
								
							}
						
						
						
						
						}
						
						if(x==4) break;
		
						
					}
					
					
					
				}
			
			
			
			
			
		
			}
		
		
		
		

	}
}

