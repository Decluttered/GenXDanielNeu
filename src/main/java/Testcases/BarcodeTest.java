package Testcases;

import static org.junit.Assert.assertEquals;
import java.io.IOException;
import Barcodes.Barcodes;
import Sendungen.Sendung;

public class BarcodeTest {
    
    private static Sendung sendung = new Sendung();
    private static Barcodes barcodes = new Barcodes();

    @org.junit.Test
    public static void BarcodeÜberprüfen() throws IOException
    {
        assertEquals(12, barcodes.BarcodeCollis0(2).length());
    }

    @org.junit.Test
    public static void BarcodeÜberprüfen2() throws IOException
    {
        assertEquals(12, barcodes.BarcodeCollis1(2).length());
    }

    @org.junit.Test
    public static void BarcodelängeÜberprüfen() throws IOException
    {
        assertEquals(24, sendung.barcodeColli1.length());
    }



}
