import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;

public class SimpleCalculatorTest {
    Calculator calc;

    @BeforeEach
    void setUp(){
        calc = new Calculator();
    }
    @Test
    public void TwoPlusThreeEqualsFive(){
        //arrange
        int a = 2;
        int b = 3;
        int e = 5;
        //act
        int actual = calc.add(a, b);
        //assert
        assertEquals(e, actual);
    }
    @Test
    public void ThreePlusFiveEqualsEight(){
        //arrange
        int a = 3;
        int b = 5;
        int e = 8;
        //act
        int actual = calc.add(a, b);
        //assert
        assertEquals(e, actual);
    }
    @AfterEach
    public void memoryDeletion(){
        System.out.println("Memory Cleared");
    }

}
