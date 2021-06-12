package oop.assignment2.ex24;

import java.util.Arrays;


public class Anagram {


    public static String string1;
    public static String string2;
    private static char str1[];
    private static char str2[];



    void checkAnagram()
    {
        str1 = string1.toCharArray();
        str2 = string2.toCharArray();

        if (areAnagram(str1, str2))
            System.out.println("The two strings are"
                    + " anagram of each other");
        else
            System.out.println("The two strings are not"
                    + " anagram of each other");

    }


    static boolean areAnagram(char[] str1, char[] str2)
    {

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
