package day1;

import java.util.Scanner;

public class Main {

    public static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose: (1/2/3/4)");
        String input = sc.nextLine();
        if ("1".equals(input)) {
            HelloWorld.helloWorld();
        } else if ("2".equals(input)) {
            Sum.getSum();
        } else if ("3".equals(input)) {
            Square.getSquare();
        } else if ("4".equals(input)) {
            QuadraticEquation.calQuadraticequation();
        } else {
            System.out.println("Please enter again with correct key");
        }
    }

    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==========MENU=========");
        System.out.println("1. Print line “Hello World” to program console");
        System.out.println("2. Show total of 2 numbers");
        System.out.println("3. Calculate square");
        System.out.println("4. Calculate quadratic equation");
        input();
    }
}
