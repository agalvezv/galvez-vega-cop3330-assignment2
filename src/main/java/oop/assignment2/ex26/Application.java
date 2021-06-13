/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Alex Galvez-Vega
 */


package oop.assignment2.ex26;

import java.util.Scanner;

public class Application {

    static Scanner inputs = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.println("What is your balance?");
        double b = inputs.nextDouble();
        b = Math.round(b*100);
        b = b/100;
        System.out.println("What is the APR on the card (as a percentage?");
        Double APR = inputs.nextDouble();

        System.out.println("What is the monthly payment you can make?");
        double p = inputs.nextDouble();
        p = Math.round(p*100);
        p = p/100;
        //months to pay
        PaymentCalculator mtpCheck = new PaymentCalculator(APR, b, p);

        int n;
        n = mtpCheck.monthsResolved();
        System.out.println("It will take you " + n + " months to pay off this card");


    }
}
