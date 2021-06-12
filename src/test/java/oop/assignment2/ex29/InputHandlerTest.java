package oop.assignment2.ex29;

import oop.assignment2.ex25.Password;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputHandlerTest {


    @Test
    void input_correclty_handles_Check() {

        InputHandler inputHandler = new InputHandler("joy");


        int expected = 1;
        int actual = inputHandler.inputCheck("joy");


        assertEquals(expected, actual);
    }
/*
    @Test
    void inputFinished() {
        InputHandler inputHandler = new InputHandler("joy");


        String expected = "joy";
        String actual = inputHandler.inputFinished();

        assertEquals(expected, actual);
    }

 */
}