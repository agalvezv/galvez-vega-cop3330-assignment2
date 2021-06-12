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
        //System.out.println(p);


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

        double calcpart1 = 1;
        calcpart1 = calcpart1/30;
        calcpart1 *= -1;
        //System.out.print(calcpart1);
        //part 1 correct

        //System.out.println(b);
        //System.out.println(p);
        double miniresult = Math.pow((1+i),30);
        miniresult = 1 - miniresult;
        double calcpart2 = 1 + b / p * miniresult;
        calcpart2 = Math.log10(calcpart2);
        //System.out.print(calcpart2);



        double miniresult2= i+1;
        double calcpart3 = Math.log10(miniresult2);
       // System.out.println(calcpart3);

        n = calcpart1*calcpart2/calcpart3;

        n = Math.ceil(n);
        //System.out.println(n);
        nFinal = (int)n;

        return nFinal;
    }

}
