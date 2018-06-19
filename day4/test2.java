package day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test2 {
/*
2.	Write a Java Application let user create an array of numbers in console, then program will show all numbers in array ( using interface List )
 */
    public static void begin(){
        Scanner sc = new Scanner(System.in);
        List numberList = new ArrayList();

        System.out.println("Enter total array num:");
        int num = sc.nextInt();
        for (int i=0; i<=num;  i++){
            System.out.println("Element: " +i);
            String inputNum = sc.next();
            numberList.add(inputNum);
        }
        System.out.println(numberList);
    }
    public static void main(String args[]){
                begin();
    }

}

