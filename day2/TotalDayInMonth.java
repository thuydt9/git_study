package day2;

import java.util.Scanner;

public class TotalDayInMonth {
    /*
    3.	Using switch case , print total days in a month inputted by user
-	User can input only number from 1 -> 12 , and system will show total days of inputted month
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
    public static void printTotalDayInMonth(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the month:");
        String month = sc.next();
        System.out.println("Please enter the year:");
        String year = sc.next();
         if (numberOrNot(month)==false || numberOrNot(year)==false){
              System.out.println("User can input only number. Please re-enter!");
              printTotalDayInMonth();
         } else{
              checkMonth(Integer.parseInt(month),Integer.parseInt(year));
               }
        }

    public static void checkMonth(int month, int year){
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("Month has 31 days");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("Month has 30 days");
                break;
            case 2:
                if(year % 400==0 || year%4==0& year%100==0){
                    System.out.println("Month has 28 days");
                }else {
                    System.out.println("Month has 29 days");
                }
                break;
             default:
                 System.out.println("User can input only number from 1 -> 12. Please re-enter!");
                 printTotalDayInMonth();
                 break;
        }

    }

    public static void main(String[] Agrs){
        printTotalDayInMonth();
    }
}
