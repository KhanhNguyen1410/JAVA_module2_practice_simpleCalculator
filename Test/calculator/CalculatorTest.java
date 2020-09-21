package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("testing 0 + 0")
    public void testAdd0And0(){
        int firstOperand = 0;
        int secondOperand = 0;
        int expected = 0;

        int result =  Calculator.add(firstOperand, secondOperand);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("testing 1 + 0")
    public void testAdd0And1(){
        int firstOperand = 0;
        int secondOperand = 1;
        int expected = 1;

        int result =  Calculator.add(firstOperand, secondOperand);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("testing 1 + 0")
    public void testAdd1And0(){
        int firstOperand = 1;
        int secondOperand = 0;
        int expected = 1;

        int result =  Calculator.add(firstOperand, secondOperand);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("testing 0 + 0")
    public void testAdd5And3(){
        int firstOperand = 5;
        int secondOperand = 3;
        int expected = 8;

        int result =  Calculator.add(firstOperand, secondOperand);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("testing 0 - 0")
    public void testSub0And0(){
        int firstOperand = 0;
        int secondOperand = 0;
        int expected = 0;

        int result =  Calculator.sub(firstOperand, secondOperand);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("testing 1 - 0")
    public void testSub1And0(){
        int firstOperand = 1;
        int secondOperand = 0;
        int expected = 1;

        int result =  Calculator.sub(firstOperand, secondOperand);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("testing 0 - 1")
    public void testSub0And1(){
        int firstOperand = 0;
        int secondOperand = 1;
        int expected = -1;

        int result =  Calculator.sub(firstOperand, secondOperand);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("testing 5 - 3")
    public void testSub5And3(){
        int firstOperand = 5;
        int secondOperand = 3;
        int expected = 2;

        int result =  Calculator.sub(firstOperand, secondOperand);
        assertEquals(expected, result);
    }


}