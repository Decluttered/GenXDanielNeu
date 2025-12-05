package Ordner;
	
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import Application.GenXAutoTests;
import Zeitversionen.ZeitVersionAuswahl;
	
public class OrdnerErstellenTestcase {
	
	public static File DateiOrdner;	

	public static String OrdnerErstellen() throws IOException 
	{
		DateiOrdner = new File(ZeitVersionAuswahl.Speicherpfad()+ "\\" + GenXAutoTests.aktuellesDatum);
		Files.createDirectories(Paths.get(DateiOrdner.toString()));
		return DateiOrdner.toString();
	}
	
}
	