package katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CalculatorTest {
    @Test
    public void calculatorStartsZero() {
        //GIVEN
        Calculator calculator = new Calculator();
        //WHEN
        double result = calculator.getTotal();
        //THEN
        assertEquals(0.0, result);
    }

    @Test
    public void calculatorSumNumTotal() {
        //GIVEN
        Calculator calculator = new Calculator();
        //WHEN
        calculator.sum(5.0);
        //THEN
        double result = calculator.getTotal();
        assertEquals(5.0, result);
    }

    @Test
    public void calculatorRestNumTotal() {
        //GIVEN
        Calculator calculator = new Calculator();
        //WHEN
        calculator.rest(5.0);
        //THEN
        double result = calculator.getTotal();
        assertEquals(-5.0, result);
    }

    @Test
    public void calculatorMulNumTotal() {
        //GIVEN
        Calculator calculator = new Calculator();
        //WHEN
        calculator.mul(2.0);

        //THEN
        double result = calculator.getTotal();
        assertEquals(0.0, result);
    }

    @Test
    public void calculatorDivNumTotal() {
        //GIVEN
        Calculator calculator = new Calculator();
        //WHEN
        calculator.mul(2.0);

        //THEN
        double result = calculator.getTotal();
        assertEquals(0.0, result);
    }

    @Test
    public void calculatorResidu() {
        //GIVEN
        Calculator calculator = new Calculator();
        //WHEN
        calculator.sum(4.0);
        calculator.residu(3);

        //THEN
        double result = calculator.getTotal();
        assertEquals(1.0, result);
    }

    @Test
    public void calculatorPar() {
        //GIVEN
        Calculator calculator = new Calculator();
        //WHEN
        boolean result = calculator.par(4.0);
        //THEN
        assertEquals(true, result);
    }

    @Test
    public void calculatormMaj() {
        //GIVEN
        Calculator calculator = new Calculator();
        //WHEN
        double result = calculator.Maj(4.0, 8.0);

        //THEN
        assertEquals(8.0, result);
    }
//        @Test
//        public int calculatorSumArrayOfNums() {
//            //GIVEN
//            Calculator calculator = new Calculator();
//            //WHEN
//           int [] valors = {1,2,3,4};
//
//           int result = calculator. sumArray();
//
//            //THEN
//            assertEquals(10,result);
//        }
}




