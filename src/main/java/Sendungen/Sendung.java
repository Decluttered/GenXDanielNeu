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
import Sendungsarten.Dienst;
import Testcases.*;
import Logs.*;





public class Sendung {
	
		
		private static aviso aviso = new aviso("");
		private static GenXAutoTests genXAuto = new GenXAutoTests();
		private static ReadTestcases readTestcases = new ReadTestcases();
		private static Barcodes barcodes = new Barcodes();
		private static LocalDate LD = LocalDate.now();
		private static DateTimeFormatter LD_Format = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		private static final File AvisoVerzeichnis = new File("Z:\\");
		
		
		private static int min = 0;
		private static int max = 111111;
		private static int minB = 999999;
		private static int maxName1 = 5;
		private static int maxName2 = 8;
		private static int maxHausnummer = 10;
		private static int maxStraßen = 13;
		private static int minPLZ = 11111;
		private static int maxPLZ = 99999;
		
		
		private static int u = (int) ((Math.random() * (max - minB)) + minB);
		private static int b = (int) ((Math.random() * (maxName1 - min)) + min);
		private static int c = (int) ((Math.random() * (maxName2 - min)) + min);

		
		private static int z = (int) ((Math.random() * (maxPLZ - minPLZ)) + minPLZ);
		private static int ä = (int) ((Math.random() * (maxHausnummer - (min+1))) + (min+1));
		private static int ö = (int) ((Math.random() * ((maxName1-1) - (min+1))) + (min+1));
		private static int ö2 = (int) ((Math.random() * ((maxName1) - (min+1))) + (min+1));
		private static int ü = (int) ((Math.random() * ((maxStraßen) - (min))) + (min));
		
		
		public static int x = (int) ((Math.random() * (max - minB)) + minB);
		public static int y = (int) ((Math.random() * (max - minB)) + minB);
		public static int Hausnummer = 1;
	
		
		public static String rückgabeWertString;
		
		public static String s = Integer.toString(x);
		public static String Date = LD.format(LD_Format);
		public static String Stadt;
		public static String Empfänger;
		public static String Firma;
		
		public static String plz = Integer.toString(z);
		public static String hausnummer = Integer.toString(Hausnummer);

		public static String Sendungsreferenz = "77";
		public static String BCV;
		public static String BCVNormal = "34453";
		public static String BCVKTL = "07883";		
		
		private static String SendungsindexNORMAL = "0";
		private static String SendungsindexAMBIENT = "1";
		private static String FULL = "1000000000";
		private static String FULLC = "1100000000";

		public static String barcodeColli1;
		public static String barcodeColli2;

		@BeforeAll
		void checkBarcodes()
		{
			
		}
		
		private static String ermittleStadt(String e)
		{
			
			String stadt = Adressen.Stadt[6];
			
			if(stadt.equals("Weinheim")) e = Adressen.Straßen_Weinheim[ü];
			if(stadt.equals("Viernheim")) e = Adressen.Straßen_Viernheim[ü];  
			if(stadt.equals("Worms")) e = Adressen.Straßen_Worms[ü];
			if(stadt.equals("Mannheim")) e = Adressen.Straßen_Mannheim[ü];
			if(stadt.equals("Heidelberg")) e = Adressen.Straßen_Heidelberg[ü];
			if(stadt.equals("Hamm")) e = Adressen.Straßen_Hamm[ü];
			if(stadt.equals("Freising")) e = Adressen.Straßen_Freising[ü];
		
			return e;
		}
		
		private static String ermittleEmpfänger(String e, String b)
		{
			
			String stadt = Adressen.Stadt[6];
			String empfänger = Adressen.nameWeinheim1[ö];
			String empfänger2 = Adressen.nameViernheim1[ö];
			String empfänger3 = Adressen.nameWorms1[ö];
			String empfänger4 = Adressen.nameMannheim1[ö];
			String empfänger5 = Adressen.nameHeidelberg1[ö];
			String empfänger6 = Adressen.nameHamm1[ö];
			String empfänger7 = Adressen.nameFreising1[ö];
			
		
			
			if(stadt.equals("Weinheim"))
				e = Adressen.nameWeinheim2[ö];
			if(stadt.equals("Viernheim"))
				e = Adressen.nameWeinheim2[ö];
			if(stadt.equals("Worms"))
				e = Adressen.nameWeinheim2[ö];
			if(stadt.equals("Heidelberg"))
				e = Adressen.nameHeidelberg2[ö];
			if(stadt.equals("Mannheim"))
				e = Adressen.nameMannheim2[ö];
			if(stadt.equals("Hamm"))
				e = Adressen.nameHamm2[ö];
			if(stadt.equals("Freising"))
				e = Adressen.nameFreising2[ö];
		
			return e;
		}
		
		private static String ermittleFirma(String e, String b)
		{
			
			String stadt = Adressen.Stadt[6];
			String empfänger = Adressen.nameWeinheim1[ö];
			String empfänger2 = Adressen.nameViernheim1[ö];
			String empfänger3 = Adressen.nameWorms1[ö];
			String empfänger4 = Adressen.nameMannheim1[ö];
			String empfänger5 = Adressen.nameHeidelberg1[ö];
			String empfänger6 = Adressen.nameHamm1[ö];
			String empfänger7 = Adressen.nameFreising1[ö];
			
		
			
			if(stadt.equals("Weinheim"))
				e = Adressen.nameWeinheim1[ö];
			if(stadt.equals("Viernheim"))
				e = Adressen.nameViernheim1[ö];
			if(stadt.equals("Worms"))
				e = Adressen.nameWorms1[ö];
			if(stadt.equals("Heidelberg"))
				e = Adressen.nameHeidelberg1[ö];
			if(stadt.equals("Mannheim"))
				e = Adressen.nameMannheim1[ö];
			if(stadt.equals("Hamm"))
				e = Adressen.nameHamm1[ö];
			if(stadt.equals("Freising"))
				e = Adressen.nameFreising1[ö];
		
			return e;
		}
		
		public static void write() throws IOException, JAXBException
		{
			
			int rückgabeWert = ReadAnzahlDurchläufe.ReadNumbers();
			
			aviso.getVersion();
			aviso.setVersion("2.8");
			aviso.getOriginfile();
			aviso.setOriginfile(new origin_file("TOF434453000",Date,"XML"));
			
			aviso.getShipments();
			aviso.setShipments(new shipments());
			aviso.getShipments().getShipment();
			aviso.getShipments().setShipment(new shipment("434453000",Date,"0","2","50,00","NORMAL"));
			aviso.getShipments().getShipment().setReferences(new references());			
			
			aviso.getShipments().getShipment().setPackages(new packages());
			aviso.getShipments().getShipment().getPackages();
			aviso.getShipments().getShipment().getPackages().getPackage1();
			
			
			
	        for(int i=1;i<6;i++)
			{
	        	
				JAXBContext context = JAXBContext.newInstance(aviso.class);
		        Marshaller marshaller = context.createMarshaller();
		        marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-16");

				barcodeColli1 = "34453" + barcodes.BarcodeCollis0(i) + "49" + Adressen.PLZ[6];
				barcodeColli2 = "34453" + barcodes.BarcodeCollis1(i) + "49" + Adressen.PLZ[6];

				JUnitCore junit = new JUnitCore();
				junit.addListener(new TextListener(System.out));
				junit.run(BarcodeTest.class);
				
				if(i%5==0)
				Hausnummer = Hausnummer+1;
				
				String nummer = Integer.toString(Hausnummer);
				aviso.getShipments().getShipment().getReferences().setReference(new reference("SHIPMENT",s+i));
				
				aviso.getShipments().getShipment().getPackages().setPackage1(new Package("C","25,0"));
				aviso.getShipments().getShipment().getPackages().getPackage1().setBarcodes(new barcodes());
				aviso.getShipments().getShipment().getPackages().getPackage1().getBarcodes().getBarcode1();
				aviso.getShipments().getShipment().getPackages().getPackage1().
				getBarcodes().setBarcode1(new barcode("PACKAGE",barcodeColli1));
				
				aviso.getShipments().getShipment().getPackages().setPackage6(new Package("C","25,0"));
				aviso.getShipments().getShipment().getPackages().getPackage6().setBarcodes(new barcodes());
				aviso.getShipments().getShipment().getPackages().getPackage6().getBarcodes().getBarcode1();
				aviso.getShipments().getShipment().getPackages().getPackage6()
				.getBarcodes().setBarcode1(new barcode("PACKAGE",barcodeColli2));
				

				aviso.getShipments().getShipment().setAddresses(new addresses());
				aviso.getShipments().getShipment().getAddresses();
				

				aviso.getShipments().getShipment().getAddresses().setAddress(new address
						("RECIPIENT", ermittleFirma(Stadt, Firma),ermittleEmpfänger(Stadt, Empfänger),
								ermittleStadt(Stadt), nummer,"DE",Adressen.PLZ[6],Adressen.Stadt[6]));

				
				aviso.getShipments().getShipment().getAddresses().getAddress().setServices(new services());
				aviso.getShipments().getShipment().getAddresses().getAddress().getServices().getService();
				aviso.getShipments().getShipment().getAddresses().getAddress().getServices().getTimeservice();
				
				
				
				if(i%5==0){
					
				aviso.getShipments().getShipment().getAddresses().getAddress().
				getServices().setService(Dienst.AMBIENT.toString());
				
				aviso.getShipments().getShipment().getAddresses().getAddress().
				getServices().setTimeservice(new timeservice(Dienst.NORMAL.toString()));

				//marshaller.marshal(aviso, 
			//	new File(AvisoVerzeichnis + "/SendungTestAmbient" + rückgabeWert + ".xml"));
				
				marshaller.marshal(aviso, 
						new File(OrdnerErstellenTestcase.DateiOrdner + "/SendungAmbientTest" + rückgabeWert  + ".xml"));
				}
				
				else
				{
					aviso.getShipments().getShipment().getAddresses().getAddress().
					getServices().setService(Dienst.NORMAL.toString());
					
					aviso.getShipments().getShipment().getAddresses().getAddress().
					getServices().setTimeservice(new timeservice(Dienst.NORMAL.toString()));
				
					//marshaller.marshal(aviso, 
					//		new File(AvisoVerzeichnis + "/SendungTest" + rückgabeWert + ".xml"));
					marshaller.marshal(aviso, 
							new File(OrdnerErstellenTestcase.DateiOrdner + "/SendungTest" + rückgabeWert + ".xml"));
				}	
				
				rückgabeWert = readTestcases.ReadNumbers() + i;
				System.out.println("Rückgabewert: "+rückgabeWert);
					
			}			
	        		
	        genXAuto.anzahlDurchläufe =  rückgabeWert;
	        System.out.println("Rückgabewert: "+rückgabeWert);
	        System.out.println("anzahlDurchläufe: "+ genXAuto.anzahlDurchläufe);
				
		}			
				
		public static void main(String[]args) throws IOException, JAXBException
		{			
				write();	
		}		
					
	}					
				
					




