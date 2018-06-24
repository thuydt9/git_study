package Day5;

import java.util.Scanner;

public class test9 {
    /*
    9.	Create 2 Object called Employee / Department , each object will have 3 attributes :
-	Id
-	Name
-	Description
     */

    public static void main(String[] args) {
        Employee e= new Employee();
        e.set();
        e.show();
        Department d= new Department();
        d.set();
        d.show();
    }

    static class Employee {
        String id;
        String name;
        String description;
        public void set() {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter Employee ID: ");
            id = input.nextLine();

            System.out.print("Enter Employee Name: ");
            name = input.nextLine();

            System.out.print("Enter Employee Description: ");
            description = input.nextLine();
        }

        public void show() {
            System.out.println("Employee ID: " + id);
            System.out.println("Employee Name: " + name);
            System.out.println("Employee Description: " + description);
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }

    static class Department {
        String id;
        String name;
        String description;
        public void set() {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter Department ID: ");
            id = input.nextLine();

            System.out.print("Enter Department Name: ");
            name = input.nextLine();

            System.out.print("Enter Department Description: ");
            description = input.nextLine();
        }

        public void show() {
            System.out.println("Department ID: " + id);
            System.out.println("Department Name: " + name);
            System.out.println("Department Description: " + description);
        }
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}