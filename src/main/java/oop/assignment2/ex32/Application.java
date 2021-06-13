/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Alex Galvez-Vega
 */


package oop.assignment2.ex32;

import java.util.Scanner;

public class Application {
    static Scanner inputs= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the difficulty level (1, 2, or 3):");
        String difficulty = inputs.nextLine();
        DiffInputHandler diffCheck = new DiffInputHandler(difficulty);
        difficulty = diffCheck.inputFinished();

        GuessNumber enterGame = new GuessNumber(difficulty);
        enterGame.gameManager();

        boolean replayLoop =false;
        String reresponse;
        while(replayLoop == false)
        {
            System.out.println("Do you wish to play again?");
            reresponse = inputs.nextLine();
            reresponse = reresponse.toLowerCase();
            if(reresponse.equals("no")||reresponse.equals("n"))
            {
                replayLoop=true;
            }
            else
            {
                enterGame.gameManager();
            }
            //System.out.println(reresponse);

        }



    }
}
