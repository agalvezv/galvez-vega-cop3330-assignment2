/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Alex Galvez-Vega
 */


package oop.assignment2.ex31;
//import oop.assignment2.ex29.InputHandler;

public class HeartRate {
    static String restingPulseS;
    static String ageS;
    static double restingPulseD;
    static double ageD;

    HeartRate(){

    }
    HeartRate(String rec1, String rec2){
        restingPulseS=rec1;
        ageS=rec2;
        //System.out.println(restingPulseS);
        //System.out.println(ageS);
    }
    public static void funcManager()
    {

        //System.out.println(restingPulseS);
        //System.out.println(ageS);

        restingPulseD=Double.parseDouble(restingPulseS);
        ageD=Double.parseDouble(ageS);
        builtTable(restingPulseD, ageD);

    }

    public static void builtTable(Double rp, Double a){

        Double thr = 0.00;
        Double intense = .55;
        int intenseI = 55;

        //System.out.println(rp);
       // System.out.println(a);

        System.out.println("Intensity    | Rate");
        System.out.println("-------------|--------");

        for(int i=0;i<8;i++)
        {
            thr= 0.00;
            thr= 220-a;
            //System.out.println(thr);
            thr=thr-rp;
            //System.out.println(thr);
            thr=thr*intense;
            //System.out.println(thr);
            thr=thr+rp;
            //System.out.println(thr);
            int thri= Math.toIntExact(Math.round(thr));


            System.out.println(intenseI + "%          | " + thri + " bpm");
            intenseI += 5;
            intense = (double)intenseI/100;

        }


    }
}
