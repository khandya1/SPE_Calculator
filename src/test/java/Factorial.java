import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class Factorial {

    private Main calculator;

    @Before
    public void setUp() {
        calculator = new Main();
    }

    @Test
    public void factOne() {
        assertTrue("testcase 1", 120== Main.calcfact(5));
        ;
    }

    @Test
    public void factTwo() {
        assertFalse("testcase 2", 120 == calculator.calcfact(6));
        ;
    }

    @Test(expected = IllegalArgumentException.class)
    public void factNegative() {
        long f = -1;
        calculator.calcfact(-1);
    }

}
