package oop.assignment2.ex25;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        System.out.println("What is your password?");
        String password = inputs.nextLine();
        //char passwordc[] = password.toCharArray();
        Password passwordCheck = new Password(password);

        int passStrength;
        passStrength = passwordCheck.passwordResult();
        //System.out.println(passStrength);
        if(passStrength==4)
        {
            password = "The password '" + password + "' is a very strong password";
        }
        else if(passStrength==3)
        {
            password= "The password '" + password + "' is a strong password";
        }
        if(passStrength==2)
        {
            password = "The password '" + password + "' is a weak password";
        }
        if(passStrength==1)
        {
            password = "The password '" + password + "' is a very weak password";
        }
        printFindings(password);




        }

        static void printFindings(String password)
        {
            System.out.println(password);
        }

    }

