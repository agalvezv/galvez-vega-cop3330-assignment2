package oop.assignment2.ex32;

import oop.assignment2.ex31.InputHandler;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    static String difficulty;
    //static String guess;
    private static int secretNumber;
    static Scanner inputs2 = new Scanner(System.in);


    GuessNumber(String recInput){
        difficulty = recInput;

    }

    public static void gameManager()
    {
        int currentSN;
        int gameComplete=0;
        currentSN = setSecretNumber(difficulty);
        System.out.println("I have my number. What is your guess?");
        gameComplete = guessNumber(currentSN);


    }
    public static void rePlay(){
        gameManager();

    }

    public static int setSecretNumber(String difficulty)
    {
        Random rand = new Random();
        if(difficulty.equals("3"))
        {
            secretNumber = rand.nextInt(1001);

        }
        else if(difficulty.equals("2"))
        {
            secretNumber = rand.nextInt(101);

        }
        else if(difficulty.equals("1"))
        {
            secretNumber = rand.nextInt(11);

        }

        return secretNumber;
    }
    public static int guessNumber(int currentSN)
    {
        int guesses = 1;
        int guessI =0;
        int error=0;
        while(guesses<=5)
        {
            try
            {
                guessI = inputs2.nextInt();
            }
            catch(Exception nre)
            {
                guesses++;
                System.out.println("You have " + (5-guesses) + " remaining. Guess again:");
            }

            if(guessI != currentSN)
            {

                if(guessI<currentSN)
                {
                    guesses++;
                    System.out.println("Too low. Guess again: ");
                }
                if(guessI>currentSN)
                {
                    guesses++;
                    System.out.println("Too high. Guess again: ");
                }
            }
            if(guessI==currentSN)
            {
                System.out.println("You got it in " + (guesses) + "!");
                return 0;

            }
        }
        return 0;
    }

}
