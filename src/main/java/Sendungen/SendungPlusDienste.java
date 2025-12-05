package Sendungen;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Properties;

import javax.xml.bind.*;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import Hauptklassen.*;
import Logs.Read;
import Logs.Write;
import Nebenklassen.*;
import Nebenklassen.Package;
import Adressen.*;
import Application.GenXAuto;
import Barcodes.Barcodes;
import Ordner.OrdnerErstellen;
import Sendungsarten.Dienst;





public class SendungPlusDienste{
	
		
		public static Random r = new Random();
		public static aviso aviso = new aviso("");
		public static Adressen ad = new Adressen();
		public static Write write = new Write();
		public static Read rr = new Read();
		public static Barcodes barcodes = new Barcodes();
		public static Dienst dienst;
		public static LocalDate LD = LocalDate.now();
		public static DateTimeFormatter LD_Format = DateTimeFormatter.ofPattern("dd.MM.yyyy");
			
		public static int min = 0;
		public static int max = 111111;
		public static int minB = 999999;
		public static int maxR = 11111111;
		public static int minR = 99999999;
		public static int maxName1 = 5;
		public static int maxName2 = 8;
		public static int maxHausnummer = 10;
		public static int maxStraßen = 13;
		public static int minPLZ = 11111;
		public static int maxPLZ = 99999;
		
		public static int u = (int) ((Math.random() * (max - minB)) + minB);
		public static int b = (int) ((Math.random() * (maxName1 - min)) + min);
		public static int c = (int) ((Math.random() * (maxName2 - min)) + min);

		public static int z = (int) ((Math.random() * (maxPLZ - minPLZ)) + minPLZ);
		public static int ä = (int) ((Math.random() * (maxHausnummer - (min+1))) + (min+1));
		public static int ö = (int) ((Math.random() * ((maxName1-1) - (min+1))) + (min+1));
		public static int ö2 = (int) ((Math.random() * ((maxName1) - (min+1))) + (min+1));
		public static int ü = (int) ((Math.random() * ((maxStraßen) - (min))) + (min));
		
		public static int x = (int) ((Math.random() * (max - minB)) + minB);
		public static int y = (int) ((Math.random() * (max - minB)) + minB);
		public static int Hausnummer = 1;
		
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
		
		public static String SendungsindexNORMAL = "0";
		public static String SendungsindexAMBIENT = "1";
		public static String FULL = "1000000000";
		public static String FULLC = "1100000000";


		public static String BarcodePaletten(int i) throws IOException
		{
			int[] arr = rr.ReadNumbers();
			int[] AnzahlSendungen = new int[1];
			AnzahlSendungen[0] = arr[1];
			String xx = FULL;
			


			if(AnzahlSendungen[0]>9 || i>9) 
				xx =  FULL.substring(0, 10);
			
			if(AnzahlSendungen[0]>99 || i>99) 
				xx = FULL.substring(0, 9);
				
			if(AnzahlSendungen[0]>999 || i>999) 
				xx =  FULL.substring(0, 8);
				
			if(AnzahlSendungen[0]>9999 || i>9999) 
				xx = FULL.substring(0, 7);
				
			if(AnzahlSendungen[0]>99999 || i>99999) 
				xx = FULL.substring(0, 6);
				
			if(AnzahlSendungen[0]>999999 || i>999999) 
				xx = FULL.substring(0, 5);
				
			if(AnzahlSendungen[0]>9999999 || i> 9999999) 
				xx = FULL.substring(0, 4);
				
			if(AnzahlSendungen[0]>99999999 || i>99999999) 
				xx = FULL.substring(0, 3);
				
			if(AnzahlSendungen[0]>999999999 || i>999999999) 
				xx = FULL.substring(0, 2);
				
			String s = Integer.toString(i);
			String a = xx+s;
			
			return a;
		}
		
		public static String BarcodeCollis(int i) throws IOException
		{
			int[] arr = rr.ReadNumbers();
			int[] AnzahlSendungen = new int[1];
			AnzahlSendungen[0] = arr[2];
			String xxc = FULLC;


			
			if(AnzahlSendungen[0]>9 || i>9) 
				xxc =  FULLC.substring(0, 10);			
			if(AnzahlSendungen[0]>99 || i>99) 
				xxc = FULLC.substring(0, 9);				
			if(AnzahlSendungen[0]>999 || i>999) 
				xxc =  FULLC.substring(0, 8);				
			if(AnzahlSendungen[0]>9999 || i>9999) 
				xxc = FULLC.substring(0, 7);				
			if(AnzahlSendungen[0]>99999 || i>99999) 
				xxc = FULLC.substring(0, 6);				
			if(AnzahlSendungen[0]>999999 || i>999999) 
				xxc = FULLC.substring(0, 5);				
			if(AnzahlSendungen[0]>9999999 || i> 9999999) 
				xxc = FULLC.substring(0, 4);				
			if(AnzahlSendungen[0]>99999999 || i>99999999) 
				xxc = FULLC.substring(0, 3);				
			if(AnzahlSendungen[0]>999999999 || i>999999999) 
				xxc = FULLC.substring(0, 2);
			
			String s = Integer.toString(i);
			String a = xxc+s;
			
			return a;
		}
		
		public static String vergleiche(String e)
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
		
		public static String ermittleEmpfänger(String e, String b)
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
		
		public static String ermittleFirma(String e, String b)
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
			
	        for(int i=0;i<1;i++)
			{
	        	
				JAXBContext context = JAXBContext.newInstance(aviso.class);
		        Marshaller mar= context.createMarshaller();
		        mar.setProperty(Marshaller.JAXB_ENCODING, "UTF-16");

				String barcodeColli1 = "34453"+ barcodes.BarcodeCollis0(i)+ "49" + Adressen.PLZ[6];
				String barcodeColli2 = "34453"+ barcodes.BarcodeCollis1(i)+ "49" + Adressen.PLZ[6];
				System.out.println("f: " + barcodeColli1);
				System.out.println("f length: " + barcodeColli1.length());
				System.out.println("f: " + barcodeColli2);
				System.out.println("f length: " + barcodeColli2.length());
				
				if(i==4 || i==9)
				Hausnummer = Hausnummer+1;
				
				String nummer = Integer.toString(Hausnummer);
				aviso.getShipments().getShipment().getReferences().setReference(new reference("SHIPMENT",s+i));
//				a.getS().getSh().getR().setRf(new reference("SHIPMENT",Sendungsreferenz));
				
				aviso.getShipments().getShipment().getPackages().setPackage1(new Package("C","25,0"));
				aviso.getShipments().getShipment().getPackages().getPackage1().setBarcodes(new barcodes());
				aviso.getShipments().getShipment().getPackages().getPackage1().getBarcodes().getBarcode();
				aviso.getShipments().getShipment().getPackages().getPackage1().
				getBarcodes().setBarcode(new barcode("PACKAGE",barcodeColli1));
				
				aviso.getShipments().getShipment().getPackages().setPackage6(new Package("C","25,0"));
				aviso.getShipments().getShipment().getPackages().getPackage6().setBarcodes(new barcodes());
				aviso.getShipments().getShipment().getPackages().getPackage1().getBarcodes().getBarcode();
				aviso.getShipments().getShipment().getPackages().getPackage6()
				.getBarcodes().setBarcode(new barcode("PACKAGE",barcodeColli2));
				

				aviso.getShipments().getShipment().setAddresses(new addresses());
				aviso.getShipments().getShipment().getAddresses();
				

				aviso.getShipments().getShipment().getAddresses().setAddress(new address
						("RECIPIENT", ermittleFirma(Stadt, Firma),ermittleEmpfänger(Stadt, Empfänger),
						vergleiche(Stadt), nummer,"DE",Adressen.PLZ[6],Adressen.Stadt[6]));

				
				aviso.getShipments().getShipment().getAddresses().getAddress().setServices(new services());
				aviso.getShipments().getShipment().getAddresses().getAddress().getServices().getService();
				
				aviso.getShipments().getShipment().getAddresses().getAddress().getServices().getTimeservice();
				
				if(i==4 || i==9 || i==14){
					
				aviso.getShipments().getShipment().getAddresses().getAddress().
				getServices().setService(Dienst.AMBIENT.toString());
//				a.getS().getSh().getA().getAd().getS().setTs(new timeservice("PLUS8"));
//				a.getS().getSh().getA().getAd().getS().setTs(new timeservice("PLUS9"));
//				a.getS().getSh().getA().getAd().getS().setTs(new timeservice("PLUS10"));
//				a.getS().getSh().getA().getAd().getS().setTs(new timeservice("PLUS12"));
//				a.getS().getSh().getA().getAd().getS().setTs(new timeservice("SATURDAY"));
//				a.getS().getSh().getA().getAd().getS().setTs(new timeservice("DIRECT"));
//				a.getS().getSh().getA().getAd().getS().setTs(new timeservice("EVENING"));
				aviso.getShipments().getShipment().getAddresses().getAddress().
				getServices().setTimeservice(new timeservice("NIGHT"));

				
				write.Write();
					
//					mar.marshal(a, new File(OrdnerErstellen24H.DateiOrdner+"/SendungAmbient24H"+GenXAuto24H.zahl+i+".xml"));
					mar.marshal(aviso, new File("C:\\Users\\WACKED01\\Documents\\Sendungsdateien\\SendungenMitDiensten/SendungAmbient7.xml"));
//					mar.marshal(a, new File(GenXAuto24H.avisoVerzeichnis+"/SendungAmbient1H"+GenXAuto24H.zahl+i+".xml"));
	
				}
				else
				{
					aviso.getShipments().getShipment().getAddresses().getAddress().
					getServices().setService(Dienst.NORMAL.toString());
//					a.getS().getSh().getA().getAd().getS().setTs(new timeservice("PLUS8"));
//					a.getS().getSh().getA().getAd().getS().setTs(new timeservice("PLUS9"));
//					a.getS().getSh().getA().getAd().getS().setTs(new timeservice("PLUS10"));
//					a.getS().getSh().getA().getAd().getS().setTs(new timeservice("PLUS12"));
//					a.getS().getSh().getA().getAd().getS().setTs(new timeservice("SATURDAY"));
//					a.getS().getSh().getA().getAd().getS().setTs(new timeservice("DIRECT"));
//					a.getS().getSh().getA().getAd().getS().setTs(new timeservice("EVENING"));
					aviso.getShipments().getShipment().getAddresses().getAddress().
					getServices().setTimeservice(new timeservice("NIGHT"));
//					mar.marshal(a, new File(OrdnerErstellen24H.DateiOrdner+"/Sendung24H"+GenXAuto24H.zahl+i+".xml"));
					mar.marshal(aviso, new File("C:\\Users\\WACKED01\\Documents\\Sendungsdateien\\SendungenMitDiensten/Sendung7.xml"));
//					mar.marshal(a, new File(GenXAuto24H.avisoVerzeichnis+"/Sendung1H"+GenXAuto24H.zahl+i+".xml"));
				}	
					
					
			}			
	        		
					
				
		}			
				
		public static void main(String[]args) throws IOException, JAXBException
		{			
				write();	
		}		
					
	}					
				
					




