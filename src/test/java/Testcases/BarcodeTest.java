package Testcases;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import Barcodes.Barcodes;
import Sendungen.Sendung;

public class BarcodeTest {
    
    private static Sendung sendung = new Sendung();
    private static Barcodes barcodes = new Barcodes();

    @org.junit.Test
    public void BarcodeÜberprüfen() throws IOException
    {
        assertEquals(12, barcodes.BarcodeCollis0(2).length());
    }

    @org.junit.Test
    public void BarcodelängeÜberprüfen() throws IOException
    {
        assertEquals(24, sendung.barcodeColli1.length());
    }



}
