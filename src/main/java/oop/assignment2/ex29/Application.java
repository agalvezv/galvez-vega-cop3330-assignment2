
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Alex Galvez-Vega
 */

package oop.assignment2.ex29;

import java.util.Scanner;

public class Application {

    static Scanner inputs = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("What is the rate of return");
        String inputValue = inputs.nextLine();
        InputHandler handle = new InputHandler(inputValue);


        inputValue = handle.inputFinished();
            double r = Double.parseDouble(inputValue);
            double years = 72 / r;
            System.out.println("It will take " + years + " years to double your intitial investment");




    }
}
