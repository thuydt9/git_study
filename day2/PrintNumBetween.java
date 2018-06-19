package day2;

import java.util.Scanner;

public class PrintNumBetween {
    /*
    4.	Using while / for to print numbers between first number to second number
-	User can input 2 numbers , system will check if first number smaller than second number , then system will show all numbers between first to second number
o	Eg : User input first number 1 , second number 10 , then system will show :
o	1
o	2
o	3
o	4
o	5
o	6
o	7
o	8
o	9
o	10
-	If first number is bigger than second number, then system will show the opposite way.
     */
    public static boolean checkNumOrNot(String input) {
        try {
            Integer.parseInt(input);
        }catch (NumberFormatException ex){
            return false;
        }
        return true;
    }

    public static void printBetween(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the first Num: ");
        String num1 = sc.next();
        System.out.println("Enter the second Num: ");
        String num2 = sc.next();
        if (checkNumOrNot(num1)==false || checkNumOrNot(num2)==false) {
            System.out.println("Please only enter Number!");
            printBetween();
        }else if (Integer.parseInt(num1)<Integer.parseInt(num2)) {
             for (int i=Integer.parseInt(num1); i<= (Integer.parseInt(num2)); i++){
                    System.out.println(i);
              }
        } else {
            for (int i=Integer.parseInt(num1); i>= (Integer.parseInt(num2)); i--){
                System.out.println(i);
            }
        }

    }
    public static void main (String[] Args){
        printBetween();
    }
}
