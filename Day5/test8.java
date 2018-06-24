package Day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test8 {
    /*8.	Write a Java Application create a list of Student name, user will have several functions ( using List interface ) :
1.	Add student name to List
2.	Show all student name in List
3.	Delete student name in List ( provide student name for delete )
*/
   public static int Dem_PhanTu(List a, int n, String x) {
       int dem = 0;
       for (int i = 0; i < n; i++) {
          String b;
           b = (String)a.get(i);
           if (b.equals(x)){
               dem += 1;
           }
       }
       if (dem == 0) return 0;
       else return 1;
   }
  static   List student = new ArrayList();
   static Scanner sc = new Scanner(System.in);
    public static void addsStudent()
    {
        System.out.println("Enter the number of student you want to add: ");
        int num= sc.nextInt();

        //ADD
        for (int i=1; i<=num; i++){
            System.out.println("Please enter the Student name: " + i);
            String name = sc.next();
            student.add(name);
        }
        }
        public static void show(){
            // View
            System.out.println("All student in List are: ");
            System.out.println(student);
        }
        public  static void delete(){
            //Delete
            System.out.println("Enter the student name in List you want to delete: ");
            String nameDelete = sc.next();
            if (Dem_PhanTu(student,student.size(),nameDelete)==0){
                System.out.println("Student name not existed");
            }else {
                student.remove(nameDelete);
            }
            System.out.println("List after delete: ");
            System.out.println(student);
        }

    public static void showMenu() {
        System.out.println("Enter choosen: ");
        System.out.println("1. Add student");
        System.out.println("2. View student List");
        System.out.println("3. Delete student");
    }
    public static void main(String args[]){
        String choose = null;
        boolean exit = false;

        showMenu();
        while (true) {
            Scanner sc = new Scanner(System.in);
            choose = sc.nextLine();
            switch (choose) {
                case "1":
                    addsStudent();
                    System.out.println("=====List after add:==== ");
                    show();
                    break;
                case "2":
                    show();
                    break;
                case "3":
                    delete();
                    break;
                default:
                    System.out.println("invalid! please choose action in below menu:");
                    break;
            }
            if (exit) {
                break;
            }
            // show menu
            showMenu();
        }

    }
}
