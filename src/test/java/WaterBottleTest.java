import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void maxVolume(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void drink(){
        assertEquals(waterBottle.drink(), 90);
    }

    @Test
    public void emptyBottle(){
        assertEquals(waterBottle.emptyBottle(),0);
    }

    @Test
    public void fullBottle(){
        assertEquals(waterBottle.fullBottle(), 100);
    }
}
