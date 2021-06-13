
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Alex Galvez-Vega
 */

package oop.assignment2.ex37;

import java.util.Scanner;

public class Application {
    static Scanner inputs = new Scanner(System.in);

    public static void main(String[] args) {

        int minlength;
        System.out.println("What's the minimum length?");
        minlength = inputs.nextInt();

        int numSpecChar;
        System.out.println("How many special characters?");
        numSpecChar = inputs.nextInt();

        int numAmnt;
        System.out.println("How many numbers?");
        numAmnt = inputs.nextInt();

        PasswordGenerator createPassword = new PasswordGenerator(minlength,numSpecChar,numAmnt);
        String password = createPassword.buildPassword();
        System.out.println("Your password is " + password);


    }
}
