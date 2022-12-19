import org.example.Calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {

    Calculator tester = new Calculator();

    @Test
    public void testAddFromCalculator(){

        int result = tester.add(3,4);

        assertEquals(result, 7);
    }
    @Test
    public void testMinusFromCalculator(){

        int result = tester.minus(3,4);

        assertEquals(result, -1);
    }
    @Test
    public void testMultipliedCalculator(){

        int result = tester.multiplied(3,4);

        assertEquals(result, 12);
    }
    @Test
    public void testDividedCalculator(){

        float result = tester.divided(4,2);

        assertEquals(2, result);
    }

    @Test
    public void testDividedByZeroCalculator(){
        Exception error = Assertions.assertThrows(ArithmeticException.class,()->tester.divided(4,0));
        assertEquals("Impossible de diviser par 0 mon Coco", error.getMessage());

    }


}
