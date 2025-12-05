package Barcodes;


import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class BarcodeReader {
	
	
	public static void UnoBarcode()
	{
	    List<String> barcodeValues = new ArrayList<>();
	       try {
	           // XML-Datei laden
	           File xmlFile = new File("C:\\\\Users\\\\WACKED01\\\\Desktop\\\\XML_Daten_GEN-XAUTO_20_Minuten/0_Sendung_Ambient2M.xml");
	           // DOM-Dokument erstellen
	           DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	           DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	           Document doc = dBuilder.parse(xmlFile);
	           doc.getDocumentElement().normalize();
	           // Alle <barcode> Elemente holen
	           NodeList barcodeList = doc.getElementsByTagName("barcode");
	           for (int i = 0; i < barcodeList.getLength(); i++) {
	               Node barcodeNode = barcodeList.item(i);
	               if (barcodeNode.getNodeType() == Node.ELEMENT_NODE) {
	                   Element barcodeElement = (Element) barcodeNode;
	                   // <value> innerhalb von <barcode> lesen
	                   NodeList valueList = barcodeElement.getElementsByTagName("value");
	                   if (valueList.getLength() > 0) {
	                       String value = valueList.item(0).getTextContent().trim();
	                       barcodeValues.add(value);
	                   }
	               }
	           }
	       } catch (Exception e) {
	           e.printStackTrace();
	       }
	       // Ausgabe der gesammelten Barcodes
	       System.out.println("Gefundene Barcodes:");
	       for (String barcode : barcodeValues) {
	           System.out.println(barcode);
	       }
	}
	
	public static List<String> AlleBarcodes()
	{
		List<String> SendungsreferenzValues = new ArrayList<>();
		try {
	       
			   File path = new File("C:\\Users\\WACKED01\\Documents\\Sendungsdateien\\SendungenAuto\\24 Stunden\\24.10.2025 16.33.42");
	
			   File [] files = path.listFiles();
			   for (int i = 0; i < files.length; i++){
			        if (files[i].isFile()){ 
			        	  
				           DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				           DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
				           Document doc = dBuilder.parse(files[i]);
				           doc.getDocumentElement().normalize();
				   
				           NodeList SendungsreferenzList = doc.getElementsByTagName("barcode");
				           for (int j = 0; j < SendungsreferenzList.getLength(); j++) {
				               Node SendungsreferenzNode = SendungsreferenzList.item(j);
				               if (SendungsreferenzNode.getNodeType() == Node.ELEMENT_NODE) {
				                   Element SendungsreferenzElement = (Element) SendungsreferenzNode;
				                  
				                   NodeList valueList = SendungsreferenzElement.getElementsByTagName("value");
				                   if (valueList.getLength() > 0) {
				                       String value = valueList.item(0).getTextContent().trim();
				                       SendungsreferenzValues.add(value);
				                   }
				               }
				           }
			        	}
			   }

	         
	       } catch (Exception e) {
	           e.printStackTrace();
	       }
		 for(String i : SendungsreferenzValues)
		 {
			 System.out.println(i);
			 System.out.println(i.length());
		 }
			   
		
		return SendungsreferenzValues;
	}
	
	
	public static String Referenznummer()
	{
	 	List<String> SendungsreferenzValues = AlleBarcodes();	 
	 	String Sendungsreferenz = SendungsreferenzValues.get(0);
	 	System.out.println(Sendungsreferenz);
		return Sendungsreferenz;
	}
	
	
   public static void main(String[] args) {
	   AlleBarcodes();
   }
}
