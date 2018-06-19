package OptionalTest10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DepartmentManager  {
    static List<Department> departmentArrayList = new ArrayList<>();
    Department[] emp = new Department[100];
    public static void addD() {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter Department ID: ");
            String idD = input.nextLine();

            System.out.print("Enter Department Name: ");
            String nameD = input.nextLine();

            System.out.print("Enter Department Description: ");
            String descriptionD = input.nextLine();

            Department depart = new Department(idD, nameD, descriptionD);
            departmentArrayList.add(depart);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void showD() {
        for (Department dp:departmentArrayList) {
            System.out.println("ID: " +dp.getIdD() + "\tName: " +dp.getNameD() + "\tDescription: " +dp.getDescriptionD());
        }

    }

    public static void deleteD(String idD) {
        Department department = null;
        int size = departmentArrayList.size();
        for (int i = 0; i < size; i++) {
            if ((departmentArrayList.get(i).getIdD()).equals(idD)) {
                department = departmentArrayList.get(i);
                break;
            }
        }
        if (department != null) {
            departmentArrayList.remove(department);
        } else {
            System.out.println("ID not exist!");
        }
    }

}

