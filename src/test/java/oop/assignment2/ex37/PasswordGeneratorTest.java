package oop.assignment2.ex37;

import oop.assignment2.ex36.Calculations;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordGeneratorTest {
    @Test
    void bool_withinParam_Check() {

        PasswordGenerator myPassTest = new PasswordGenerator(2,2,2);


        boolean expected = true;
        boolean actual = myPassTest.withinParam("rgjrekjgjnengkenj");
        assertEquals(expected, actual);



    }

}