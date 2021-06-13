/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Alex Galvez-Vega
 */


package oop.assignment2.ex37;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;



public class PasswordGenerator {
    static int ml,nsc,na;
    static String password = "";
    static Random rand = new Random();

    public PasswordGenerator(int minlength, int numSpecChar, int numAmnt) {
        ml=minlength;
        nsc=numSpecChar;
        na=numAmnt;
    }
    public static String buildPassword()
    {
        boolean withinParam= false;
        String temp;
        temp = numberAmount();
        password = password+temp;
        temp = specialAmount();
        password = password+temp;
        temp = minLength();
        password = password+temp;
        temp=password;

        password = sortPass(temp);
        //System.out.println(password);
        withinParam = withinParam(password);
        if(withinParam==true)
        {
            return password;
        }
        return "xxxxxxxx";
    }

    public static boolean withinParam(String password) {
        if(password.length()>=(ml+nsc+na))
        {
            return true;
        }
        return false;
    }

    private static String sortPass(String temp) {
        String str=temp;
        List<String> characters = Arrays.asList(str.split(""));
        Collections.shuffle(characters);

        String shuffle = "";

        for (String character : characters)
        {
            shuffle += character;
        }


        return shuffle;
    }

    public static String numberAmount()
    {
        Random rand = new Random();
        String temp="";
        String returnS="";
        int tempN;
        for(int i=0;i<na;i++)
        {
            tempN = rand.nextInt(10);
            temp=Integer.toString(tempN);
            returnS= returnS+temp;

        }
        return returnS;
    }

    public static String specialAmount()
    {
        char specialCharacters[] ={'!','@','#','$','%','^','&','*'};
        String temp="";
        String returnS="";
        int tempN;
        for(int i=0;i<nsc;i++)
        {
            tempN = rand.nextInt(specialCharacters.length);
            temp=temp+specialCharacters[tempN];


        }
        returnS= temp;
        return returnS;
    }

    public static String minLength()
    {
        ml = ml + rand.nextInt(4);
        char tempC;
        String temp="";
        String returnS="";
        int tempN;
        for(int i=0;i<ml;i++)
        {
            tempN = rand.nextInt(26);
            tempC = (char)( 'a' + tempN );
            temp=temp+tempC;

        }
        returnS= temp;
        return returnS;
    }
}
