package org.example;

public class ReverseNumber {
    public static void main(String[] args) {
        int n=1299;
        int rev = 0;
        int last_digit;
        while(n>0)
        {
            last_digit=n%10;
            rev=rev*10+last_digit;
            n=n/10;
        }
        System.out.println(rev);
    }
}
