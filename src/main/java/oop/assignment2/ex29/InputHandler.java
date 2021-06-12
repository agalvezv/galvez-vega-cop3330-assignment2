package oop.assignment2.ex29;
import java.util.Scanner;

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
            System.out.println("What is the rate of return");
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
