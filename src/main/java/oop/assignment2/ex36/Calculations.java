package oop.assignment2.ex36;

import java.util.ArrayList;
import java.text.DecimalFormat;

public class Calculations {

    static ArrayList calcValues = new ArrayList();
    static DecimalFormat df2 = new DecimalFormat("#.##");

    static double average;
    static double minimum;
    static double maximum;
    static double std;




    public static String setNumberValues(String recInput) {
        Double tempNumber;

        try{
            tempNumber = Double.parseDouble(recInput);
            calcValues.add(tempNumber);
        }
        catch(NumberFormatException nfe)
        {
            System.out.println("");
        }
        //System.out.println(calcValues);

        return "Roster Set.";
    }

    public static void outputList()
    {
        System.out.printf("Numbers: ");
        for(int i =0; i<calcValues.size();i++)
        {
            if(i==calcValues.size()-1)
            {
                System.out.printf(" %.2f", (double) calcValues.get(i));

            }
            else
            {
                System.out.printf(" %.2f,", (double) calcValues.get(i));

            }
            //System.out.printf(" %lf,", (double) calcValues.get(i));
        }
        System.out.println("");
    }

    public static double average()
    {
        average = 0.00;
        double sum = 0.00;

        for(int i =0; i<calcValues.size();i++)
        {
            sum = sum + (double) calcValues.get(i);
        }
        average = sum / calcValues.size();
        return average;
    }

    public static double min()
    {
        minimum=(double)calcValues.get(0);
        double sum = 0.00;

        for(int i =0; i<calcValues.size();i++)
        {
            if((double)calcValues.get(i)<minimum)
            {
                minimum= (double)calcValues.get(i);

            }

        }
        return minimum;
    }

    public static double max()
    {
        maximum=(double)calcValues.get(0);

        for(int i =0; i<calcValues.size();i++)
        {
            if((double)calcValues.get(i)>maximum)
            {
                maximum= (double)calcValues.get(i);

            }

        }
        return maximum;
    }

    public static double std(Double average)
    {
        std=0.00;

        int length = calcValues.size();

        for(int i=0;i<length;i++)
        {
            std = std + Math.pow(((double)calcValues.get(i) - average), 2);

        }
        std = Math.sqrt(std/length);

        return std;
    }


    public void outputResults(double hold) {
        if(hold==average)
        {
            System.out.println("The average is " + df2.format(hold));
        }
        else if(hold==minimum)
        {
            System.out.println("The minimum is " + df2.format(hold));
        }
        else if(hold==maximum)
        {
            System.out.println("The maximum is " + df2.format(hold));
        }
        else if(hold==std)
        {
            System.out.println("The standard deviation is " + df2.format(hold));
        }
    }
}
