package oop.assignment2.ex34;
import java.util.Scanner;
import java.util.ArrayList;

public class Application {
    static ArrayList employList = new ArrayList();
    static Scanner inputs = new Scanner(System.in);
    public static void main(String[] args) {
        EmployeeList empRoster = new EmployeeList(employList);
        empRoster.employeeManager();


    }

}
