package day1;

import java.util.Scanner;
/*
   2. Sum 2 numbers
*/
public class Sum {

    public static void getSum(){
        System.out.println("=========Exercise 2==========");
        System.out.println("2. Show total of 2 numbers");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first number:");
        int num1=sc.nextInt();
        System.out.println("Input the first number:");
        int num2=sc.nextInt();
        int sum=num1+num2;
        System.out.println("Total of 2 numbers is: " + sum);
    }
}
