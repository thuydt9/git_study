package day2;

public class Split {
    /*
    6.	Given a string "Saturday, 26 November 27$ | Marina Sand Bay, Singapore"
è	Write a program to split this string into some string using regular expression
o	String a = Saturday
o	String b = 26 November 27$
o	String c = Marina Sand Bay
o	String d = Singapore

     */
    public static void main(String a[]){

        String str = " Saturday, 26 November 27$ | Marina Sand Bay, Singapore";
        String[] parts = str.split(",|\\|");
        for(String p:parts){
            System.out.println(p);
        }
    }
}
