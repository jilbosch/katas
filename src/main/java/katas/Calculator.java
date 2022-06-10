package katas;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private double total = 0.0;

    public double getTotal() {
        return (float) this.total;
    }

    public void sum(double num) {
        total += num;
    }

    public void rest(double num) {
        total -= num;
    }

    public void mul(double num) {
        total *= num;
    }

    public void div(double num) {
        if (num == 0) {
            return;
        }
        total /= num;

    }

    public void residu(double num) {
        total %= num;
    }

    public boolean par(double num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public double Maj(double num, double num2) {
        if (num > num2) {
            return num;
        } else {
            return num2;
        }

    }

    public void sumArray(double[] arr) {
        double result = 0.0;
        for (double num : arr) {
            result += num;
        }
        this.total = result;
    }

    public List<Integer> returnEqOrGreatThan5(List<Integer> list) {
        List<Integer> resList = new ArrayList<>();

        for (int num : list) {
            if (num >= 5.0) {
                resList.add(num);
            }
        }
        return resList;
    }
}