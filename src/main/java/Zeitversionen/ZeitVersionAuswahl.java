package Zeitversionen;

import java.io.File;

import Sendungsarten.Sendungsarten;

public class ZeitVersionAuswahl {
    

    private static final File logdatei = new File("C:\\Users\\WACKED01\\Desktop\\GEN_X/Logdaten/LogDatenAutoTest.txt");
    private static final String LogdateiPfad = "C:\\Users\\WACKED01\\Desktop\\GEN_X/Logdaten/LogDatenAutoTest.txt";

    private static final String speicherOrt = "C:\\Users\\WACKED01\\Documents\\Sendungsdateien\\SendungenAuto\\10 Sekunden";
	private static final String speicherOrt2 = "C:\\Users\\WACKED01\\Documents\\Sendungsdateien\\SendungenAuto\\1 Minute";
	private static final String speicherOrt3 = "C:\\Users\\WACKED01\\Documents\\Sendungsdateien\\SendungenAuto\\1 Stunde";
	private static final String speicherOrt4 = "C:\\Users\\WACKED01\\Documents\\Sendungsdateien\\SendungenAuto\\24 Stunden";
    private static final String speicherOrt5 = "C:\\Users\\WACKED01\\Documents\\Sendungsdateien\\SendungenAuto\\Tests";

    private static final long EinTag = 86400000L;
	private static final long EineStunde = 3600000L;
	private static final int ZehnMinuten = 600000;
	private static final int EineMinute = 60000;
	private static final int NeunSekunden = 9000;
	private static final int ZehnSekunden = 10000;
    private static final int Sendungsart = 1;

    private static int SendungsAnzahl = 5;

    public static File Logdatei()
    {
        return logdatei;
    }

    public static String Logdateipfad()
    {
        return LogdateiPfad;
    }

    public static String Speicherpfad()
    {
        return speicherOrt5;
    }

    public static int Zeitintervall()
    {
        return ZehnSekunden;
    }

    public static int sendungsAnzahl()
    {
        return SendungsAnzahl;
    }

    public static int sendungsArt()
    {
        return Sendungsart;
    }


}
