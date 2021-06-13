package oop.assignment2.ex36;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CalculationsTest {

    @Test
    void std_random_value_Check() {

        Calculations myCalc = new Calculations();
        myCalc.calcValues.add(4.00);
        myCalc.calcValues.add(5.00);
        myCalc.calcValues.add(6.00);

        double expected= .816496580927726;
        double actual = myCalc.std(5.00);
        assertEquals(expected, actual);



    }
}