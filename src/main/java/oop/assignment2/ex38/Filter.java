package oop.assignment2.ex38;
import java.util.Scanner;
public class Filter {
    static double initialArray[];
    static int size;
    static int upsize=0;
    static Scanner inputs = new Scanner(System.in);


    Filter(double[] tempArray, int tempsize){

        initialArray=tempArray;

        size = tempsize;
    }
    public static double[] initArray()
    {
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter value:");
            initialArray[i] = inputs.nextDouble();
        }

        return initialArray;
    }


    public int newSize() {
        int counter=0;
        for(int i=0;i<size;i++)
        {
            if(initialArray[i]%2==0)
            {
                counter++;
            }
        }
        return counter;
    }

    public double[] filterArray() {

        double filteredArray[] = new double[upsize];
        int j = 0;

        for(int i=0;i<size;i++)
        {
            if(initialArray[i]%2==0)
            {
                filteredArray[j] = initialArray[i];
                j++;
            }
        }

        return filteredArray;
    }
}
