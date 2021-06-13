/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Alex Galvez-Vega
 */


package oop.assignment2.ex31;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputHandler {

    private static String recInput;
    private static char recInputC[];
    private static double recInputN;
    static Scanner inputs = new Scanner(System.in);

    InputHandler(String intInput){
        recInput = intInput;
    }

    public static String inputFinished(){
        int error = 0;

        error=inputCheck(recInput);
        while(error>0){
            System.out.println("Retype value.");
            recInput = inputs.nextLine();
            error=inputCheck(recInput);
        }

        String returnString = recInput;
        return returnString;
    }

    public static int inputCheck(String recInput){
        recInputC = recInput.toCharArray();
        int errorCheck = 0;
        int charCheck=0;
        int numCheck=0;

        Pattern pattern = Pattern.compile("[a-zA-Z0-9]*");
        Matcher match = pattern.matcher(recInput);
        if(!match.matches()){
            System.out.println("Sorry. That's not valid input.");
            errorCheck++;
            return errorCheck;
        }

        for(int i=0;i<recInput.length();i++)
        {
            if(Character.isAlphabetic(recInputC[i]))
            {
                charCheck++;
            }
        }
        if(charCheck>0)
        {
            System.out.println("Sorry. That's not valid input.");
            errorCheck++;
        }
        else if(charCheck==0){
            for(int i=0;i<recInput.length();i++)
            {
                if(Character.isDigit(recInputC[i]))
                {
                    numCheck++;
                }
            }
            if(numCheck>0){
                recInputN = Double.parseDouble(recInput);
                if(recInputN==0){
                    System.out.println("Sorry. That's not a valid input.");
                    errorCheck++;
                }
            }
        }

        return errorCheck;
    }

}
