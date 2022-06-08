package katas;

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

    public double sumArray (String [] args){
        int arr[]  = new int []{12,34,45,21,33,4};
        int sum =0;

        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }

            return total;

        }

    }
