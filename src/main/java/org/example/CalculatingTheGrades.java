package org.example;

import java.util.Scanner;

public class CalculatingTheGrades {
    public static void main(String[] args) {
        int sub1,sub2,sub3,sub4,sub5;
        System.out.println("enter the marks subjet wise :");
        Scanner sc=new Scanner(System.in);
        sub1=sc.nextInt();
        sub2=sc.nextInt();
        sub3=sc.nextInt();
        sub4=sc.nextInt();
        sub5=sc.nextInt();
        double total=sub1+sub2+sub3+sub4+sub5;
        double average=total/5;
        if(average>=90)
        {
            System.out.println("A grade");
        }
        else if(average<90 && average>=80)
        {
            System.out.println("B grade");
        }
        else if(average<80 && average>=70)
        {
            System.out.println("C grade");
        }
        else if(average<70 && average>=60)
        {
            System.out.println("D grade");
        }
        else if(average<60 && average>=40)
        {
            System.out.println("E grade");
        }
        else
        {
            System.out.println("Fail..");
        }
    }
}
