package Sendungen;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class SendungsreferenzReader {



		
		
		public static List<String> Sendungen()
		{
			List<String> SendungsreferenzValues = new ArrayList<>();
			try {
		      
				
		           File xmlFile = new File("C:\\Users\\WACKED01\\Desktop\\XML_Daten_GEN-XAUTO_20_Minuten/0_Sendung_Ambient2M.xml");
		           
		           DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		           DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		           Document doc = dBuilder.parse(xmlFile);
		           doc.getDocumentElement().normalize();
		   
		           NodeList SendungsreferenzList = doc.getElementsByTagName("reference");
		           for (int i = 0; i < SendungsreferenzList.getLength(); i++) {
		               Node SendungsreferenzNode = SendungsreferenzList.item(i);
		               if (SendungsreferenzNode.getNodeType() == Node.ELEMENT_NODE) {
		                   Element SendungsreferenzElement = (Element) SendungsreferenzNode;
		                  
		                   NodeList valueList = SendungsreferenzElement.getElementsByTagName("value");
		                   if (valueList.getLength() > 0) {
		                       String value = valueList.item(0).getTextContent().trim();
		                       SendungsreferenzValues.add(value);
		                   }
		               }
		           }
		       } catch (Exception e) {
		           e.printStackTrace();
		       }
			
			for(String i : SendungsreferenzValues)
				   System.out.println(i);
			return SendungsreferenzValues;
		}
		
		
		public static List<String> Sendungen2()
		{
			List<String> SendungsreferenzValues = new ArrayList<>();
			try {
		       
				   File path = new File("C:\\Users\\WACKED01\\Documents\\Sendungsdateien\\SendungenAuto\\1 Stunde\\13.10.2025 16.36.57");
		
				   File [] files = path.listFiles();
				   for (int i = 0; i < files.length; i++){
				        if (files[i].isFile()){ 
				        	  
					           DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
					           DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
					           Document doc = dBuilder.parse(files[i]);
					           doc.getDocumentElement().normalize();
					   
					           NodeList SendungsreferenzList = doc.getElementsByTagName("reference");
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
				   System.out.println(i);
			
			return SendungsreferenzValues;
		}
		
		
		public static String Referenznummer()
		{
		 	List<String> SendungsreferenzValues = Sendungen();	 
		 	String Sendungsreferenz = SendungsreferenzValues.get(0);
		 	System.out.println(Sendungsreferenz);
			return Sendungsreferenz;
		}
		
	   public static void main(String[] args) {
		   
//		   Sendungen();
		   Sendungen2();
//		   Referenznummer();
		   
	   }
	   


}
