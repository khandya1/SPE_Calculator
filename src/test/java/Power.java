import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class Power {
    private Front calculator;

    @Before
    public void setUp() {
        calculator = new Front();
    }
    @Test
    public void powerOne() {
        assertTrue("testcase power 1", 16.0 == calculator.calcpower(4, 2));
        ;
    }
    @Test

    public void powerTwo() {
        assertNotEquals("testcase power 2", 16.0, calculator.calcpower(3, 2), 0.0);
        ;
    }
}

