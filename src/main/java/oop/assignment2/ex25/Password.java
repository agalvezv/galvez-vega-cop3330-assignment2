package oop.assignment2.ex25;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {


    private static String passwordtest;
    private static char passwordtestc[];


    Password(String inputvalues, char inputvaluec[]) {
         passwordtest = inputvalues;
         passwordtestc = inputvaluec;

    }

    public static int passwordResult()
    {
        int result = passwordValidator(passwordtest, passwordtestc);
        return result;

    }




    private static int passwordValidator(String passwordtest, char passwordtestc[]) {
        int d =0;
        int a =0;
        int sa=0;
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]*");
        Matcher match = pattern.matcher(passwordtest);

        int s=0;
        for(int i=0;i<passwordtest.length();i++)
        {
            if(Character.isDigit(passwordtestc[i]))
            {
                d++;
            }
            if(Character.isAlphabetic(passwordtestc[i]))
            {
                a++;
            }
            if(!match.matches()){
                sa++;
            }
        }
        if(d>=1&&a>=8&&sa>=1)
        {
            s=4;
        }
        else if(d>=1&&a>=8)
        {
            s=3;
        }
        else if(d==0&&a<8)
        {
            s=2;
        }
        else if(d>1&&a==0)
        {
            s=1;
        }
        else
        {
            s=1;
        }
        return s;

    }
}










