/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Alex Galvez-Vega
 */

package oop.assignment2.ex30;

public class MultiplicationTable {
    public static void main(String[] args) {
        int size = 12;
        multTableBuilt(size);
    }

    public static void multTableBuilt(int size)
    {
        int multTable[][] = new int[size][size];

        for(int row =0; row<size; row++)
        {
            for(int col=0;col<size;col++)
            {
                multTable[row][col] = (row+1)*(col+1);
                //System.out.println(multTable[row][col]);

            }
        }

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                int digitN= 0;
                digitN = countDigit(multTable[i][j]);
                if(digitN>=3)
                {
                    System.out.print(multTable[i][j] + " ");

                }
                else if (digitN==2)
                {
                    System.out.print(" " + multTable[i][j] + " ");

                }
                else
                {
                    System.out.print("  " +multTable[i][j] + " ");
                }
                //System.out.print(multTable[i][j] + " ");
            }

            System.out.println();
        }

    }

    public static int countDigit(int holder)
    {
        if(holder/10==0)
        {
            return 1;
        }
        return 1 + countDigit(holder/10);
    }
}
