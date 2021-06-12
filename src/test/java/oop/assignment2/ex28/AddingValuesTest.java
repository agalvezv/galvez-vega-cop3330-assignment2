package oop.assignment2.ex28;

import oop.assignment2.ex26.PaymentCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddingValuesTest {

    @Test
    void calculate_sum_with_zero_values() {

        AddingValues testCalc = new AddingValues();


        double expected = 0.00;
        double actual = testCalc.calculateSum(0.00,0.00,0.00,0.00,0.00);

        assertEquals(expected, actual);

    }

    @Test
    void calculate_neg_with_zero_values() {

        AddingValues testCalc = new AddingValues();


        double expected = 4.00;
        double actual = testCalc.calculateSum(-1.00,-1.00,2.00,2.00,2.00);

        assertEquals(expected, actual);

    }
}