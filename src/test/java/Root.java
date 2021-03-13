import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class Root
{
 private Main calculator;

    @Before
    public void setUp() {
        calculator = new Main();
    }
    @Test
    public void sqrt()
    {
        assertTrue("testcase 1", 4.0== calculator.calcsqroot(16));
        ;
    }
    @Test(expected = IllegalArgumentException.class)
    public void sqrtNegative() {
        long f = -1;
        calculator.calcsqroot(-1);
    }
}