package oop.assignment2.ex38;
import java.util.Scanner;
public class Application {
    static Scanner inputs = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        int size;
        System.out.println("Enter list size.");
        size = inputs.nextInt();
        double initialArray[] = new double[size];
        Filter initFilter = new Filter(initialArray,size);
        initialArray = initFilter.initArray();
        outputArray(initialArray, size);
        size = initFilter.newSize();
        initFilter.upsize=size;
        //System.out.println(initFilter.size);


        double filteredArray[] = new double[size];

        filteredArray = initFilter.filterArray();
        outputArray(filteredArray, size);


        

    }
    public static void outputArray(double printArray[], int size)
    {
        System.out.println("");
        System.out.println("Arrya listed:");
        for(int i=0;i<size;i++)
        {
            System.out.println(printArray[i]);
        }

    }
}
