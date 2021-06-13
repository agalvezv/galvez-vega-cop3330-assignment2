package oop.assignment2.ex33;
import java.util.Random;

public class Magic8Ball {

    static String[] magicResponses = {"It is certain.", "It is decidedly so.", "Without a doubt.", "My sources say no", "Reply hazy try again", "It is decidedly so.", "Yes", "Yes"};
    static int randomChoice;

    Magic8Ball(){

    }
    public static void startMagicBall()
    {


        magicrandChoice(randomChoice);

    }
    public static int magicrandChoice(int randomChoice)
    {
        Random rand = new Random();
        randomChoice = rand.nextInt(7);
        System.out.println(magicResponses[randomChoice]);


        return 1;


    }

}
