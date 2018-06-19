package day2;

import java.util.Scanner;

public class OddOrEven {
    /*
    1.	Check number is odd or even
-	If user not input number , show log "You must input numeric type" and user will have to re-type number

     */
    static boolean numberOrNot(String input)
    {
        try
        {
            Integer.parseInt(input);
        }
        catch(NumberFormatException ex)
        {
            return false;
        }
        return true;
    }
    public static void checkOddOrEven(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the integer numberic:");
        String num=sc.next();
        if (false == numberOrNot(num)){
            System.out.println("You must input integer numberic type!");
            checkOddOrEven();
        }else {

            if (Integer.parseInt(num)%2==0) {
                System.out.println("Number is even");
            } else {
                System.out.println("Number is odd");
            }
        }
    }
    public static void main (String[] args){
        checkOddOrEven();
    }

}
