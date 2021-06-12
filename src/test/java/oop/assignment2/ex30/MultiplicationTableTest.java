package oop.assignment2.ex30;

import oop.assignment2.ex29.InputHandler;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTableTest {

    @Test
    void input_digit_check_correct() {

        MultiplicationTable digitHandler = new MultiplicationTable();


        int expected = 1;
        int actual = digitHandler.countDigit(5);


        assertEquals(expected, actual);
    }

}