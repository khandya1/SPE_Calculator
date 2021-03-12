import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class Factorial {

    private Front calculator;

    @Before
    public void setUp() {
        calculator = new Front();
    }

    @Test
    public void factOne() {
        assertTrue("testcase 1", 120==Front.calcfact(5));
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
