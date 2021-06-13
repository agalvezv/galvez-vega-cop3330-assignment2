package oop.assignment2.ex36;

import oop.assignment2.ex35.ContestLottery;
//import java.text.DecimalFormat;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Calculations myCalc = new Calculations();
        Scanner inputs = new Scanner(System.in);


        boolean loopCheck = false;
        String numCheck;
        int i =0;
        String prepareCheck = "";
        while (loopCheck == false) {
            System.out.println("Enter a number: ");
            numCheck = inputs.nextLine();

            if(numCheck.equals("done"))
            {
                loopCheck=true;
            }
            prepareCheck=myCalc.setNumberValues(numCheck);
            i++;
        }
        myCalc.outputList();
        System.out.println(prepareCheck);
        double average = myCalc.average();
        //System.out.println("The average is " + average);
        double minimum = myCalc.min();
        //System.out.println("The minimum is " + minimum);
        double maximum = myCalc.max();
        //System.out.println("The maximum is " + maximum);
        double std = myCalc.std(average);
        //System.out.println("The standard deviation is " + df2.format(std));



        myCalc.outputResults(average);
        myCalc.outputResults(minimum);
        myCalc.outputResults(maximum);
        myCalc.outputResults(std);



    }
}
