package day1;

import java.util.Scanner;

/*
4. Calculate quadratic equation ax^2 + bx + c =0
 */
public class QuadraticEquation {
    public static void calQuadraticequation() {
        System.out.println("=========Exercise 4==========");
        System.out.println("4. Calculate quadratic equation");
        try {
            float x1, x2; //x1,x2: first and second root of the equation)
            //Input 3 num
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first Num:");
            float a = sc.nextFloat();
            System.out.println("Enter the second Num:");
            float b = sc.nextFloat();
            System.out.println("Enter the third Num:");
            float c = sc.nextFloat();
            float delta = b*b - 4*a*c;
            // Calculate quadratic equation
            if (a == 0) {
                x1 = (float) (-c / b);
                System.out.println("Equation has became the first degree equation with x1= " + x1);
            } else if (delta == 0) {
                x1 = -b / (2*a);
                System.out.println("Equation has x1 = x2 = " + x1);
            } else if (delta >0){
                x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
                x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
                System.out.println("Equation has x1 = " + x1);
                System.out.println("Equation has x2 = " + x2);
            } else {
                System.out.println("Equation has no solution");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
