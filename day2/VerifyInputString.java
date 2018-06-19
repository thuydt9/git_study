package day2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class VerifyInputString {
    /*
    5.	Write a program, let user input a string, then verify the string is matches these condition (using regular expression) :
o	First letter is uppercase
o	The string do not contains any number or any special characters
	If string do not match these condition, program will print to console “Wrong format, please type again”, and program will let user input string again.
     */
    private static final String INPUT = "\\b[A-Z].*?[^0-9]\\b";
    private Pattern pattern;
    public VerifyInputString() {
        pattern = Pattern.compile(INPUT);
    }

    public boolean validate(final String input) {
        return pattern.matcher(input).matches();
    }
    public static void check(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the String:");
        String input = sc.nextLine();

        VerifyInputString validator = new VerifyInputString();
        System.out.println(validator.validate(input));
        if (validator.validate(input)==false){
            System.out.println("Wrong format, please type again");
            check();

        }
    }
    public static void main(String[] args) {
        check();

    }
}
