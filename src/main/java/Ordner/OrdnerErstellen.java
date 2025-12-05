package Ordner;
	
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import Application.GenXAuto;
	
public class OrdnerErstellen {
	

	
	public static File DateiOrdner;	
	public static LocalDateTime LDT = LocalDateTime.now();
	public static DateTimeFormatter LDT_Format = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
	public static String aktuellesDatum = LDT.format(LDT_Format);
	
	
	
	public static String OrdnerErstellen() throws IOException 
	{
		DateiOrdner = new File(GenXAuto.speicherOrt+ "\\" + GenXAuto.aktuellesDatum);
		Files.createDirectories(Paths.get(DateiOrdner.toString()));
		return DateiOrdner.toString();
	}
	
	public static void main(String[] args) throws IOException 
	{
		OrdnerErstellen();		
	}
	
}
	