package Sendungen;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


import javax.xml.bind.*;
import org.junit.internal.TextListener;
import org.junit.jupiter.api.BeforeAll;
import org.junit.runner.JUnitCore;


import Adressen.*;
import Application.GenXAutoTests;
import Barcodes.Barcodes;
import Hauptklassen.*;
import Nebenklassen.*;
import Nebenklassen.Package;
import Ordner.*;
import Testcases.*;
import Zeitversionen.ZeitVersionAuswahl;
import Logs.*;
import Parameter.*;
import Sendungsarten.*;





public class SendungRefactored {
	
		//Objekete und Referenzen zu anderen Klassen
		private static aviso aviso = new aviso("");
		private static GenXAutoTests genXAuto = new GenXAutoTests();
		private static ReadTestcases readTestcases = new ReadTestcases();
		private static Barcodes barcodes = new Barcodes();		
		private static Parameter parameter = new Parameter();
		private static final File AvisoVerzeichnis = new File("Z:\\");

		@BeforeAll
		void checkBarcodes() throws IOException
		{
			BarcodeTest.BarcodeÜberprüfen();
			BarcodeTest.BarcodeÜberprüfen2();
			BarcodeTest.BarcodelängeÜberprüfen();
		}
		
		/* Empfänger Variablen setzen wie Name,Stadt,etc. */

		//Stadt des Empfängers setzen
		private static String ermittleStadt(String e)
		{
			
			String stadt = Adressen.Stadt[6];
			
			if(stadt.equals("Weinheim")) e = Adressen.Straßen_Weinheim[parameter.ü];
			if(stadt.equals("Viernheim")) e = Adressen.Straßen_Viernheim[parameter.ü];  
			if(stadt.equals("Worms")) e = Adressen.Straßen_Worms[parameter.ü];
			if(stadt.equals("Mannheim")) e = Adressen.Straßen_Mannheim[parameter.ü];
			if(stadt.equals("Heidelberg")) e = Adressen.Straßen_Heidelberg[parameter.ü];
			if(stadt.equals("Hamm")) e = Adressen.Straßen_Hamm[parameter.ü];
			if(stadt.equals("Freising")) e = Adressen.Straßen_Freising[parameter.ü];
		
			return e;
		}
		//Name des Empfängers setzen
		private static String ermittleEmpfänger(String e, String b)
		{
			
			String stadt = Adressen.Stadt[6];
			String empfänger = Adressen.nameWeinheim1[parameter.ö];
			String empfänger2 = Adressen.nameViernheim1[parameter.ö];
			String empfänger3 = Adressen.nameWorms1[parameter.ö];
			String empfänger4 = Adressen.nameMannheim1[parameter.ö];
			String empfänger5 = Adressen.nameHeidelberg1[parameter.ö];
			String empfänger6 = Adressen.nameHamm1[parameter.ö];
			String empfänger7 = Adressen.nameFreising1[parameter.ö];
			
		
			
			if(stadt.equals("Weinheim"))
				e = Adressen.nameWeinheim2[parameter.ö];
			if(stadt.equals("Viernheim"))
				e = Adressen.nameWeinheim2[parameter.ö];
			if(stadt.equals("Worms"))
				e = Adressen.nameWeinheim2[parameter.ö];
			if(stadt.equals("Heidelberg"))
				e = Adressen.nameHeidelberg2[parameter.ö];
			if(stadt.equals("Mannheim"))
				e = Adressen.nameMannheim2[parameter.ö];
			if(stadt.equals("Hamm"))
				e = Adressen.nameHamm2[parameter.ö];
			if(stadt.equals("Freising"))
				e = Adressen.nameFreising2[parameter.ö];
		
			return e;
		}
		//Firmenname des Empfängers setzen
		private static String ermittleFirma(String e, String b)
		{
			
			String stadt = Adressen.Stadt[6];
			String empfänger = Adressen.nameWeinheim1[parameter.ö];
			String empfänger2 = Adressen.nameViernheim1[parameter.ö];
			String empfänger3 = Adressen.nameWorms1[parameter.ö];
			String empfänger4 = Adressen.nameMannheim1[parameter.ö];
			String empfänger5 = Adressen.nameHeidelberg1[parameter.ö];
			String empfänger6 = Adressen.nameHamm1[parameter.ö];
			String empfänger7 = Adressen.nameFreising1[parameter.ö];
			
		
			
			if(stadt.equals("Weinheim"))
				e = Adressen.nameWeinheim1[parameter.ö];
			if(stadt.equals("Viernheim"))
				e = Adressen.nameViernheim1[parameter.ö];
			if(stadt.equals("Worms"))
				e = Adressen.nameWorms1[parameter.ö];
			if(stadt.equals("Heidelberg"))
				e = Adressen.nameHeidelberg1[parameter.ö];
			if(stadt.equals("Mannheim"))
				e = Adressen.nameMannheim1[parameter.ö];
			if(stadt.equals("Hamm"))
				e = Adressen.nameHamm1[parameter.ö];
			if(stadt.equals("Freising"))
				e = Adressen.nameFreising1[parameter.ö];
		
			return e;
		}
		
		/* Barcodes setzen  */


		private static int RückgabewertFürLogdatei() throws IOException
		{
			//parameter.rückgabeWert = ReadAnzahlDurchläufe.ReadNumbers();
			return ReadAnzahlDurchläufe.ReadNumbers();
		}

		private static String Barcodes() throws IOException
		{
			for(int i=1;i<ZeitVersionAuswahl.sendungsAnzahl();i++)
			{
				parameter.barcodeColli1 = "34453" + barcodes.BarcodeCollis0(i) + "49" + Adressen.PLZ[6];
				parameter.barcodeColli2 = "34453" + barcodes.BarcodeCollis1(i) + "49" + Adressen.PLZ[6];
			}	
			return "1";
		}


		/* Parameter für die Sendung setzen wie Art der Sendung(Normal,Ambient,etc.), 
		Dienste und Zeitdienste  */


		private static String Sendungsart(int index)
		{
			String Sendungsart = "";
			index = ZeitVersionAuswahl.sendungsArt();

			switch (index) {
				case 1: Sendungsart = Sendungsarten.SendungNormal.toString();
						return Sendungsart;					
					
				case 2: Sendungsart = Sendungsarten.SendungAmbient.toString();					
						return Sendungsart;
					
				case 3: Sendungsart = Sendungsarten.SendungGefahrgut.toString();
						return Sendungsart;
					
				case 4: Sendungsart = Sendungsarten.SendungKTL.toString();
				return Sendungsart;
					
				case 5: Sendungsart = Sendungsarten.SendungThermomed.toString();					
				return Sendungsart;
					

					
			}

			return Sendungsart;
		}

		private static String Dienst(int index)
		{
			String Sendungsart;
			index = ZeitVersionAuswahl.sendungsArt();

			switch (index) {
				case 1: Sendungsart = Sendungsarten.SendungNormal.toString();					
					break;
				case 2: Sendungsart = Sendungsarten.SendungAmbient.toString();					
					break;
				case 3: Sendungsart = Sendungsarten.SendungGefahrgut.toString();
					break;
				case 4: Sendungsart = Sendungsarten.SendungKTL.toString();
					break;
				case 5: Sendungsart = Sendungsarten.SendungThermomed.toString();					
					break;

					return Sendungsart;
			}

			return Sendungsart;
		}

		private static String Zeitdienst(int index)
		{
			String Sendungsart;
			index = ZeitVersionAuswahl.sendungsArt();

			switch (index) {
				case 1: Sendungsart = Sendungsarten.SendungNormal.toString();					
					break;
				case 2: Sendungsart = Sendungsarten.SendungAmbient.toString();					
					break;
				case 3: Sendungsart = Sendungsarten.SendungGefahrgut.toString();
					break;
				case 4: Sendungsart = Sendungsarten.SendungKTL.toString();
					break;
				case 5: Sendungsart = Sendungsarten.SendungThermomed.toString();					
					break;

					return Sendungsart;
			}

			return Sendungsart;
		}



		public static aviso setContentForSendungsdatei() throws IOException, JAXBException
		{
			RückgabewertFürLogdatei();
			
			aviso.getVersion();
			aviso.setVersion("2.8");
			aviso.getOriginfile();
			aviso.setOriginfile(new origin_file("TOF434453000",parameter.Date,"XML"));
			
			aviso.getShipments();
			aviso.setShipments(new shipments());
			aviso.getShipments().getShipment();
			aviso.getShipments().setShipment(new shipment("434453000",parameter.Date,
						"0","2","50,00","NORMAL"));
			aviso.getShipments().getShipment().setReferences(new references());			
			aviso.getShipments().getShipment().getReferences().setReference(
				new reference("SHIPMENT",parameter.Referenznummer + ZeitVersionAuswahl.sendungsAnzahl()));

			aviso.getShipments().getShipment().setPackages(new packages());
			aviso.getShipments().getShipment().getPackages();
			aviso.getShipments().getShipment().getPackages().getPackage1();


			aviso.getShipments().getShipment().getAddresses();
			aviso.getShipments().getShipment().setAddresses(new addresses());

			aviso.getShipments().getShipment().getAddresses().setAddress(new address
				("RECIPIENT", ermittleFirma(parameter.Stadt, parameter.Firma),ermittleEmpfänger(parameter.Stadt, parameter.Empfänger),
						ermittleStadt(parameter.Stadt), "3","DE",Adressen.PLZ[6],Adressen.Stadt[6]));

			Barcodes();

			aviso.getShipments().getShipment().getPackages().setPackage1(new Package("C","25,0"));
			aviso.getShipments().getShipment().getPackages().getPackage1().setBarcodes(new barcodes());
			aviso.getShipments().getShipment().getPackages().getPackage1().getBarcodes().getBarcode1();
			aviso.getShipments().getShipment().getPackages().getPackage1().
			getBarcodes().setBarcode1(new barcode("PACKAGE",parameter.barcodeColli1));
			
			aviso.getShipments().getShipment().getPackages().setPackage6(new Package("C","25,0"));
			aviso.getShipments().getShipment().getPackages().getPackage6().setBarcodes(new barcodes());
			aviso.getShipments().getShipment().getPackages().getPackage6().getBarcodes().getBarcode1();
			aviso.getShipments().getShipment().getPackages().getPackage6()
			.getBarcodes().setBarcode1(new barcode("PACKAGE",parameter.barcodeColli2));
			
			aviso.getShipments().getShipment().getAddresses().getAddress().setServices(new services());
			aviso.getShipments().getShipment().getAddresses().getAddress().getServices().getService();
			aviso.getShipments().getShipment().getAddresses().getAddress().getServices().getTimeservice();
			
			aviso.getShipments().getShipment().getAddresses().getAddress().
			getServices().setService(Dienst(ZeitVersionAuswahl.sendungsArt()));
			
			aviso.getShipments().getShipment().getAddresses().getAddress().
			getServices().setTimeservice(new timeservice(Dienst(ZeitVersionAuswahl.sendungsArt())));
			
	  

				
			
					
			return aviso;
		}		

		private static int logdateiNummer()
		{
			int indexNummer = parameter.rückgabeWert;
			return indexNummer;
		}
		
		public static void writeXMLData(int anzahlSendungen) throws IOException, JAXBException
		{
			setContentForSendungsdatei();	
			anzahlSendungen = ZeitVersionAuswahl.sendungsAnzahl();

			for(int i = 1; i<ZeitVersionAuswahl.sendungsAnzahl(); i++)
			{
				JAXBContext context = JAXBContext.newInstance(aviso.class);
				Marshaller marshaller = context.createMarshaller();
				marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-16");

				marshaller.marshal(aviso, 
					new File(OrdnerErstellenTestcase.DateiOrdner + "/" + Sendungsart(ZeitVersionAuswahl.sendungsArt())
					 + logdateiNummer() + ".xml"));

					 parameter.rückgabeWert = readTestcases.ReadNumbers() + ZeitVersionAuswahl.sendungsAnzahl();
			}

			parameter.Hausnummer = parameter.Hausnummer+1;		
			String nummer = Integer.toString(parameter.Hausnummer);
		
			
			System.out.println("Rückgabewert: "+parameter.rückgabeWert);
			genXAuto.anzahlDurchläufe =  parameter.rückgabeWert;
			System.out.println("Rückgabewert: "+parameter.rückgabeWert);
			System.out.println("anzahlDurchläufe: "+ genXAuto.anzahlDurchläufe);
			
		}
				
		public static void main(String[]args) throws IOException, JAXBException
		{			
				setContentForSendungsdatei();	
				writeXMLData(ZeitVersionAuswahl.sendungsAnzahl());
		}		
					
	}					
				
					




