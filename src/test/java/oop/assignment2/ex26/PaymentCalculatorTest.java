package oop.assignment2.ex26;

import oop.assignment2.ex25.Password;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {


    @Test
    void calculateMonthsUntilPaidOff() {

        PaymentCalculator testCalc = new PaymentCalculator();


        int expected = 0;
        int actual = testCalc.calculateMonthsUntilPaidOff(0,0,0,0, 0);

        assertEquals(expected, actual);
    }
}