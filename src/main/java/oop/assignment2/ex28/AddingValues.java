/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Alex Galvez-Vega
 */


package oop.assignment2.ex28;

import java.util.Scanner;

public class AddingValues {
    static Scanner inputs = new Scanner(System.in);

    public static void main(String[] args) {


        Double sum = 0.00;
        sum = inputValtoCalc();

        System.out.println("The total is " + sum + ".");

    }
    public static double inputValtoCalc(){
        Double inputValue[]={0.00,0.00,0.00,0.00,0.00};
        Double temp = 0.00;
        for(int i=0; i<5;i++){
            //System.out.println("Enter " + (i+1) + " number:");
            System.out.println("Enter a number:");
            inputValue[i] = inputs.nextDouble();
        }
        temp = calculateSum(inputValue[0],inputValue[1],inputValue[2],inputValue[3],inputValue[4]);
        return temp;
    }
    public static double calculateSum(Double one, Double two, Double three, Double four, Double five){
        return one+two+three+four+five;
    }
}
