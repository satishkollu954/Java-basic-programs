package org.example;

public class PowerCalculation {
    public static void main(String[] args) {
        int base=2;
        int exponent=2;
        int product=1;
        for(int i=1;i<=exponent;i++)
        {
           product=product*base;
        }
        System.out.println(product);
    }
}
