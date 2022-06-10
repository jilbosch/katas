package katas;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    private String result;
    private int num = 3;
    public String getResult() { return this.result(); }

    private String result() {
    return result ;}


    public void returnFizzBuzz(double num){
        if (num%5 == 0.0 && num % 3 == 0) {
            this.result = "FizzBuzz";

        } else if (num % 5 == 0) {
            this.result = "Buzz";
        } else if (num % 3 == 0) {
            this.result = "Fizz";
        } else {
            this.result = String.valueOf(num);
        }
    }

    public Array arrayDivNum(int num, Array array){
        List newArray = new ArrayList<>();
        for (int item: array)

    }
}
