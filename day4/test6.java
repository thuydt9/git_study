package day4;

import weekend1.Array;

import java.util.Scanner;

public class test6 {
    /*
    6.	Write a Java Application to check if the string is Palindrome or not, A palindrome is a word which reads the same backward or forward.
     */
    public static void checkPalinfrome(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word= sc.nextLine();
       char[] wordArr=word.toCharArray();
     if(istPalindrom(wordArr) ==false){
         System.out.println("The String is no palindrom");
     }else {
         System.out.println("The String is Palindrom");
     }
    }
    public static boolean istPalindrom(char[] wordArr){
        int i1 = 0;
        int i2 = wordArr.length - 1;
        while (i2 > i1) {
            if (wordArr[i1] != wordArr[i2]) {
                return false;
            }
            ++i1;
            --i2;
        }
        return true;
    }
    public static void main (String agrs[]){
        checkPalinfrome();
    }
}
