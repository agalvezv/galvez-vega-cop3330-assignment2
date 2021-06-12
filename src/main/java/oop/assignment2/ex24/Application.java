package oop.assignment2.ex24;

import java.util.Scanner;


public class Application {

    static Scanner inputs = new Scanner(System.in);

    public static void main(String[] args) {

        String appString1;
        String appString2;

        System.out.println("Enter a word.");
        appString1 = inputs.nextLine();

        System.out.println("Enter a second word.");
        appString2 = inputs.nextLine();

        Anagram anagramCheck = new Anagram();
        Anagram.string1 = appString1;
        Anagram.string2 = appString2;
        anagramCheck.checkAnagram();



    }

}
