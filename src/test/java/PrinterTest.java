import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(200, 120);
     }

     @Test
     public void getPaperCount(){
        assertEquals(200, printer.getPaperCount());
     }

     @Test
    public void printVolume(){
        assertEquals(printer.printVolume(3,10), 30);
     }

     @Test
    public void validPrintJob(){
        assertEquals(90, printer.validPrintJob(3,10));
     }
}
