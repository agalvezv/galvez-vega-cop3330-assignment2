
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Alex Galvez-Vega
 */

package oop.assignment2.ex33;
import java.util.Scanner;

public class Application {
    static Scanner inputs = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("What's your question");
        String response = inputs.nextLine();
        Magic8Ball newQuestion = new Magic8Ball();
        newQuestion.startMagicBall();

    }
}
