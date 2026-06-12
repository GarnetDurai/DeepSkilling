import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SImpleCalculatorTest {
    @Test
    public void twoPlusTwoEqualFour() {
        Calculator calc = new Calculator();
        assertEquals(4, calc.add(2, 2));
    }
    @Test
    public void threePlusTwoEqualFive(){
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(3, 2));
    }
}
