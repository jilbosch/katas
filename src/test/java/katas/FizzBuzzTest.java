package katas;


import org.junit.jupiter.api.Test;

import java.util.Enumeration;

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
}