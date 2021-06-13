package oop.assignment2.ex32;

import oop.assignment2.ex31.InputHandler;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiffInputHandlerTest {

    @Test
    void input_Finished_within_values_Check() {
        DiffInputHandler diffinputHandler = new DiffInputHandler("2");


        int expected = 0;
        int actual = diffinputHandler.inputCheck("2");


        assertEquals(expected, actual);
    }
    @Test
    void input_Finished_outside_values_Check() {
        DiffInputHandler diffinputHandler = new DiffInputHandler("4");


        int expected = 1;
        int actual = diffinputHandler.inputCheck("4");


        assertEquals(expected, actual);
    }

}