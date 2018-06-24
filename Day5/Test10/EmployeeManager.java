package Day5.Test10;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManager extends DepartmentManager {
    /*
    10.	(10.	From exercise 8 & 9, create a Java Application to manage Employees in one company, application
    will let user add / read / delete employee & department by selecting options on menu console.
    Department will have additional function to to show all employees inside it,
    and each employee will stick to one department only
     */
    static List<Employee> employeeList = new ArrayList<>();
    Employee[] emp = new Employee[100];

public static void add() {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter Employee ID: ");
            String idE = input.nextLine();

            System.out.print("Enter Employee Name: ");
            String nameE = input.nextLine();

            System.out.print("Enter Employee Description: ");
            String descriptionE = input.nextLine();

            System.out.print("Enter Department ID: ");
            String idD = input.nextLine();
            Employee employee = new Employee(idE, nameE, descriptionE, idD);
            employeeList.add(employee);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

public static void show() {
        System.out.println("Display employee list: ");
        for (Employee nv:employeeList) {
            System.out.println("ID: " +nv.getIdE() + "\tName: " +nv.getNameE() + "\tDescription: " +nv.getDescriptionE() +"\tDepartmentId: "+nv.getIdD());
        }
    }
public static void showByDepart(String idD){
    Employee employee = null;
    int size = employeeList.size();
    System.out.println("DepartmentId: "+idD+ " Has :");
    for (int i = 0; i < size; i++) {
        if ((employeeList.get(i).getIdD()).equals(idD)) {
            employee = employeeList.get(i);
            System.out.println( "ID: " +employee.getIdE() + "\tName: " +employee.getNameE() + "\tDescription: " +employee.getDescriptionE());
            break;
        }
    }
    if (employee == null) {
        System.out.println("ID not exist!");
    }
}

public static void delete(String idE) {
        Employee employee = null;
        int size = employeeList.size();
        for (int i = 0; i < size; i++) {
            if ((employeeList.get(i).getIdE()).equals(idE)) {
                employee = employeeList.get(i);
                break;
            }
        }
        if (employee != null) {
            employeeList.remove(employee);
        } else {
            System.out.println("ID not exist!");
        }
    }

    public static void showMenu() {
        System.out.println("Enter choosen: ");
        System.out.println("1. Add employee");
        System.out.println("2. View employee List");
        System.out.println("3. Delete employee");
        System.out.println("4. Add department");
        System.out.println("5. View department List");
        System.out.println("6. Delete department");
        System.out.println("7. Show employee in 1 department");
    }

    public static void main(String[] Args) {
      //  Employee em = new Employee();
       // Department dp= new Department();
        String choose = null;
        boolean exit = false;
        showMenu();
        while (true) {
            Scanner sc = new Scanner(System.in);
            choose = sc.nextLine();
            switch (choose) {
                case "1":
                    System.out.println("Enter the num of employee you want to add");
                    int num = sc.nextInt();
                    for (int i =1; i <= num; i++) {
                        add();
                    }
                    System.out.println("=====List after add:==== ");
                    show();
                    break;
                case "2":
                    show();
                    break;
                case "3":
                    System.out.println("Enter the ID employee you want to delete");
                    String idE = sc.next();
                    delete(idE);
                    break;
                case "4":
                    System.out.println("Enter the num of department you want to add");
                    int numD = sc.nextInt();
                    for (int i =1; i <= numD; i++) {
                        addD();
                    }
                    System.out.println("=====List after add:==== ");
                    showD();
                    break;
                case "5":
                    showD();
                    break;
                case "6":
                    System.out.println("Enter the ID department you want to delete");
                    String idD = sc.next();
                    deleteD(idD);
                    break;
                case "7":
                    System.out.println("Enter the ID department you want to view");
                    idD = sc.next();
                    showByDepart(idD);
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
