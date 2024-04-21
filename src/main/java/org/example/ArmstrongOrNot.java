package org.example;

public class ArmstrongOrNot {
    public static void main(String[] args) {
        int n=153;
        int m=n;
        int sum=0;
        while(n>0) {
            int r = n % 10;
            sum = sum + r * r * r;
            n = n / 10;
        }
        if(m==sum)
        {
            System.out.println("Armstrong");
        }
        else
        {
            System.out.println("Not Armstrong..");
        }

    }
}
