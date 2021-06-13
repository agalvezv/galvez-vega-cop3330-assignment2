/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Alex Galvez-Vega
 */


package oop.assignment2.ex24;

import java.util.Arrays;


public class Anagram {


    public static String string1;
    public static String string2;
    public static char str1[];
    public static char str2[];

    Anagram(){

    }

    Anagram(String inputstring1, String inputstring2)
    {
        string1 = inputstring1;
        string2 = inputstring2;
    }



    void checkAnagram()
    {


        if (isAnagram(string1, string2))
            System.out.println("The two strings are"
                    + " anagram of each other");
        else
            System.out.println("The two strings are not"
                    + " anagram of each other");

    }


    static boolean isAnagram(String string1, String string2)
    {
        str1 = string1.toCharArray();
        str2 = string2.toCharArray();

        int n1 = str1.length;
        int n2 = str2.length;


        if (n1 != n2)
            return false;


        Arrays.sort(str1);
        Arrays.sort(str2);


        for (int i = 0; i < n1; i++)
            if (str1[i] != str2[i])
                return false;

        return true;
    }



}
