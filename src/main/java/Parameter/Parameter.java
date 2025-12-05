package Parameter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parameter {

        //Tools
        private static LocalDate LD = LocalDate.now();
		private static final DateTimeFormatter LD_Format = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    	//Ints
		private static int min = 0;
		private static int max = 111111;
		private static int minB = 999999;
		private static int maxName1 = 5;
		private static int maxStraßen = 13;
		private static int minPLZ = 11111;
		private static int maxPLZ = 99999;
		public static int rückgabeWert;
		
		
		//Random Ranges
		public static int z = (int) ((Math.random() * (maxPLZ - minPLZ)) + minPLZ);
		public static int ö = (int) ((Math.random() * ((maxName1-1) - (min+1))) + (min+1));
		public static int ü = (int) ((Math.random() * ((maxStraßen) - (min))) + (min));
		public static int x = (int) ((Math.random() * (max - minB)) + minB);
		public static int y = (int) ((Math.random() * (max - minB)) + minB);
		public static int Hausnummer = 1;
	

		//Variable Strings
		public static String rückgabeWertString;
		public static String Referenznummer = Integer.toString(x);
		public static String Date = LD.format(LD_Format);
		public static String Stadt;
		public static String Empfänger;
		public static String Firma;
		public static String hausnummer = Integer.toString(Hausnummer);
		public static String Sendungsreferenz = "77";
		public static String BCV;
		public static String barcodeColli1;
		public static String barcodeColli2;


		//Feste Strings
		public static final String BCVNormal = "34453";
		public static final String BCVKTL = "07883";	
		public static final String SendungsArtNormal     ="SendungOhneDienst";
		public static final String SendungsArtAmbient    ="SendungAmbient";
		public static final String SendungsArtGefahrgut  ="SendungGefahrgut";
		public static final String SendungsArtKTL  		 ="SendungKTL";
		public static final String SendungsArtThermomed  ="SendungThermomed";	
}
