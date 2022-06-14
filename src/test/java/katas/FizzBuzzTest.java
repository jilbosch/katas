package katas;


import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {


    @Test
    public void fizzBuzz() {
        //GIVEN
        FizzBuzz fizzbuzz = new FizzBuzz();
        //WHEN
        fizzbuzz.returnFizzBuzz(3);
        //THEN]
        assertEquals("Fizz", fizzbuzz.getResult());
        fizzbuzz.returnFizzBuzz(5);
        assertEquals("Buzz", fizzbuzz.getResult());
        fizzbuzz.returnFizzBuzz(15);
        assertEquals("FizzBuzz", fizzbuzz.getResult());
        fizzbuzz.returnFizzBuzz(11);
        assertEquals("11.0", fizzbuzz.getResult());
    }
   @Test
   public void returnsArrayWidhNumsDividedParam() {
        //GIVEN
       FizzBuzz fizzBuzz = new FizzBuzz();
       //WHEN
       int [] numList = {1,2,3,4,5,6,7,8,9,10};
      int num = 2;
      //THEN
       List <Integer>divList = new ArrayList<Integer>();
       List <Integer> result = fizzBuzz.arrayDivNum(num, numList);
       divList.add(2);
       divList.add(4);
       divList.add(6);
       divList.add(8);
       divList.add(10);
       assertEquals(divList,result);

      }
   }
