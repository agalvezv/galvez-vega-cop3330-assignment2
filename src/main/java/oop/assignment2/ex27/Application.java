/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Alex Galvez-Vega
 */

package oop.assignment2.ex27;
import java.util.Scanner;

public class Application {

    static Scanner inputs = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the first name:");
        String firstN = inputs.nextLine();

        System.out.println("Enter the last name:");
        String lastN = inputs.nextLine();

        System.out.println("Enter the ZIP code:");
        String zipCode = inputs.nextLine();

        System.out.println("Enter the employee ID:");
        String empID = inputs.nextLine();

        Validation valCheck = new Validation(firstN,lastN,zipCode,empID);
        valCheck.validateInput();



    }

}
