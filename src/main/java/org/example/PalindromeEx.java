package org.example;

public class PalindromeEx {
    public static void main(String[] args) {
        int n=131;
        int m=n;
        int last_digit;
        int rev=0;
        while(n>0)
        {
            last_digit=n%10;
            rev=rev*10+last_digit;
            n=n/10;
        }
        if(m==rev)
        {
            System.out.println("palindrome..");
        }
        else
        {
            System.out.println("not palindrome..");
        }
    }
}
