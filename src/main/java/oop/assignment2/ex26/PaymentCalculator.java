package oop.assignment2.ex26;

public class PaymentCalculator {

    static double n;
    static double APR;
    static double i;
    static double b;
    static double p;

    PaymentCalculator(){

    }

    PaymentCalculator(double inputAPR, double inputb, double inputp){

        APR = inputAPR;
        b=inputb;
        p=inputp;


    }

    public static int monthsResolved(){
        int temp;
        temp = calculateMonthsUntilPaidOff(n, APR, i , b , p);
        return temp;
    }

    public static int calculateMonthsUntilPaidOff(double n, double APR, double i, double b, double p)
    {
        int nFinal = 0;
        APR = APR/100;
        //System.out.println(APR);
        //fine here.

        i = APR/365;
        //System.out.print(i);
        //double minicalc = 1-(1+i);
        double power = Math.pow((1+i),30);
        double miniresult = 1 - power;

        double incalc1 = 1 + b/p * miniresult;
        //System.out.print(incalc1);
        double incalc2 = 1 + i;
        //System.out.print(incalc2);

        n = -(1/30) * Math.log(incalc1) / Math.log(incalc2);
        //System.out.print(n);

        n = Math.round(n);
        nFinal = (int)n;

        return nFinal;
    }

}
