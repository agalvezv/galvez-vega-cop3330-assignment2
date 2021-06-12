package oop.assignment2.ex31;

import java.util.Scanner;

public class Application {

    static Scanner inputs = new Scanner(System.in);
    public static void main(String[] args) {
        String restingPulseS;
        String ageS;

        System.out.println("Resting Pulse:");
        restingPulseS = inputs.nextLine();
        InputHandler testVal = new InputHandler(restingPulseS);
        restingPulseS = testVal.inputFinished();
        System.out.println("Age:");
        ageS = inputs.nextLine();
        InputHandler testVal2 = new InputHandler(ageS);
        ageS = testVal2.inputFinished();
        HeartRate hrCheck = new HeartRate(restingPulseS, ageS);
        hrCheck.funcManager();




    }
}
