package oop.assignment2.ex34;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeList {
    static ArrayList employList = new ArrayList();

    //public static String receivedName;
    static Scanner inputs = new Scanner(System.in);

    EmployeeList(ArrayList givemployList){
        employList = givemployList;

    }


    public static String employeeManager()
    {
        setEmployList(employList);
        readEmployList(employList);
        System.out.println("Enter an employee name to remove:");
        String empRemove = inputs.nextLine();
        String resolveList = emptyEmployList(empRemove);
        return resolveList;

    }


    public static void setEmployList(ArrayList employList) {
        employList.add("John Smith");
        employList.add("Jackie Jackson");
        employList.add("Chris Jones");
        employList.add("Amanda Cullen");
        employList.add("Jeremy Goodwin");
        //EmployeeList.employList = employList;
    }

    public static void readEmployList(ArrayList employList) {
        System.out.println("There are " + employList.size() + " employees.");
        for(int i= 0 ; i <employList.size(); i++)
        {
            System.out.println(employList.get(i));

        }
        //System.out.println(employList);

    }

    public static String emptyEmployList(String receivedName) {

        for(int i= 0 ; i <employList.size(); i++)
        {
            System.out.println(employList.get(i));
            if(employList.get(i).equals(receivedName))
            {
                employList.remove(receivedName);
                readEmployList(employList);
                return receivedName+" removed from the employee roster.";

            }
        }
        return "Not in the list";

    }
}
