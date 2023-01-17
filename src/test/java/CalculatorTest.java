import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();

    }

    @Test
    public void add(){
        assertEquals(calculator.add(2,4),6);
    }

    @Test
    public void subtract(){
        assertEquals(calculator.subtract(4,2),2);
    }

    @Test
    public void multiply(){
        assertEquals(calculator.multiply(7,3),21);
    }

    @Test
    public void divide(){
        assertEquals(calculator.divide(15,5), 3, 0.0);
    }
}
