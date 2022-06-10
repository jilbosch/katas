package katas;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

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
    @Test
    public  void calculatormSumArray() {
        //GIVEN
        Calculator calculator = new Calculator();
        //WHEN
        double []doubleArr = new double[] {5.0,12.0,4.0,7.0};
        calculator.sumArray(doubleArr);
        double result = calculator.getTotal();
        //THEN
        assertEquals(28.0, result);}

    @Test
    public void calculatorReturnsEqOrGreatThan5() {
        Calculator calculator = new Calculator();

        List<Integer> list = new ArrayList<Integer>();
        int [] listVals = {2,4,5,15,1,22,7};
        for (int val: listVals){
            list.add(val);
        }
        List<Integer> result = calculator.returnEqOrGreatThan5(list);

        List <Integer> resList = new ArrayList<Integer>();
        resList.add(5);
        resList.add(15);
        resList.add(22);
        resList.add(7);

        assertEquals(resList,result);
    }




}



