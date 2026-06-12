import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleCalculatorTest {
    @Test
    public void TwoPlusTwoEqualFour(){
        Calculator calc = new Calculator();
        assertEquals(4, calc.add(2, 2));
    }
    @Test
    public void ThreeIsPositive(){
        Calculator calc = new Calculator();
        assertTrue(calc.isPositive(3));
    }
    @Test
    public void NegativeTwoIsNegativeNumber(){
        Calculator calc = new Calculator();
        assertFalse(calc.isNegative(-2));
    }
    @Test
    public void NoStudentExist(){
        Student s = null;
        assertNull(s);
    }
    @Test
    public void ValidStudent(){
        Student st = new Student("Garnet", 1);
        assertNotNull(st);
    }


}
