import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class NaturalLog
{
    private Front calculator;
    @Before
    public void setUp() {
        calculator = new Front();
    }
    @Test
    public void log()
    {
        assertTrue("testcase 4", 0.6931471805599453 == calculator.calcnatlog(2.0));
        ;
    }
    @Test(expected = IllegalArgumentException.class)
    public void logNegatve() {
        long f = -1;
        calculator.calcnatlog(-1.0);
    }
}



