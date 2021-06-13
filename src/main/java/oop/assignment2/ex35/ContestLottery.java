/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Alex Galvez-Vega
 */


package oop.assignment2.ex35;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ContestLottery {

    static ArrayList namesLott = new ArrayList();
    static Scanner inputs = new Scanner(System.in);
    static int randomChoice;
    static String nameCheck;;

    public static void lotteryManager() {
        //String ready = setNameLottery();
        //System.out.println(ready);
        int rChoice = lottorandChoice();
        lottoWinner(rChoice);

    }
    public static String setNameLottery(String recInput) {
        //boolean loopCheck = false;
        //int i = 0;
        namesLott.add(recInput);

/*
        while (loopCheck == false) {
            System.out.println("Enter a name: ");
            namesLott.add(inputs.nextLine());
            nameCheck = (String)namesLott.get(i);
            if(nameCheck.equals(""))
            {
                loopCheck=true;
            }
            i++;
        }
 */
        return "Roster Set.";
    }


/*
    public static String setNameLottery() {
        boolean loopCheck = false;
        int i = 0;


        while (loopCheck == false) {
            System.out.println("Enter a name: ");
            namesLott.add(inputs.nextLine());
            nameCheck = (String)namesLott.get(i);
            if(nameCheck.equals(""))
            {
                loopCheck=true;
            }
            i++;
        }
        return "Roster Set.";
    }

 */

    public static int lottorandChoice()
    {
        Random rand = new Random();
        randomChoice = rand.nextInt(namesLott.size()-1);
        return randomChoice;
    }

    public static void lottoWinner(int winner)
    {
        System.out.println("The winner is... " + namesLott.get(winner) + ".");

    }
}
