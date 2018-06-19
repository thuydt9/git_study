package day1;

import java.util.Scanner;
/*
3. Calculate square root of inputted number
 */
public class Square {

    public static void getSquare(){
        System.out.println("=========Exercise 3==========");
        System.out.println("3. Calculate square");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        float num=sc.nextFloat();
        float squareNum= (float) Math.sqrt(num);
        System.out.println("Square root of inputted number is: " +squareNum);
    }
}
