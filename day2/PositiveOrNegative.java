package day2;

import java.util.Scanner;

public class PositiveOrNegative {
    /*
    2.	Check number is positive or negative
-	If user not input number , show log “You must input numeric type” and user will have to re-type number

     */
    public static boolean checkNumOrNot(String input) {
        try {
            Float.parseFloat(input);
        }catch (NumberFormatException ex){
            return false;
        }
        return true;
    }

    public static void checkNavigatePositive(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the number:");
        String num= sc.nextLine();
        if(checkNumOrNot(num)==false){
            System.out.println("You must input numeric type!");
            checkNavigatePositive();
        }else{
            if(Float.parseFloat(num)>=0){
                System.out.println("The number is Positive");
            }else{
                System.out.println("The number is navigate");
            }
        }
    }
    public static void main (String[] Agrs)
    {
        checkNavigatePositive();
    }
}
