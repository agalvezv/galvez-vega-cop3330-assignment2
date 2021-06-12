package oop.assignment2.ex31;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputHandlerTest {

    @Test
    void input_correclty_handles_with_sp_chars_Check() {

       InputHandler inputHandler = new InputHandler("!");


        int expected = 1;
        int actual = inputHandler.inputCheck("!");


        assertEquals(expected, actual);
    }

}