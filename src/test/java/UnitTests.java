import calculator.MathematicalLogic;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class UnitTests {
    private final MathematicalLogic mathematicalLogic = new MathematicalLogic();

    @Test
    public void checkSummation() throws Exception {
       assertEquals(13.0, mathematicalLogic.calculation(8.0, 5.0, '+'), 0);
    }

    @Test
    public void checkSubtraction() throws Exception {
        assertEquals(24.0, mathematicalLogic.calculation(29.0, 5.0, '-'), 0);
    }

    @Test
    public void checkMultiplication() throws Exception {
        assertEquals(48.0, mathematicalLogic.calculation(6.0, 8.0, '*'), 0);
    }

    @Test
    public void checkDivision() throws Exception {
        assertEquals(12.0, mathematicalLogic.calculation(108.0, 9.0, '/'), 0);
    }
}
