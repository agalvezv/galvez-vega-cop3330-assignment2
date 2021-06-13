package oop.assignment2.ex35;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        ContestLottery lottGame = new ContestLottery();
        Scanner inputs = new Scanner(System.in);

        boolean loopCheck = false;
        String nameCheck;
        int i =0;
        String prepareCheck = "";
        while (loopCheck == false) {
            System.out.println("Enter a name: ");
            nameCheck = inputs.nextLine();
            prepareCheck=lottGame.setNameLottery(nameCheck);

            if(nameCheck.equals(""))
            {
                loopCheck=true;
            }
            i++;
        }
        System.out.println(prepareCheck);
        lottGame.lotteryManager();


    }
}
