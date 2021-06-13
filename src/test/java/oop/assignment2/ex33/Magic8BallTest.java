package oop.assignment2.ex33;

import oop.assignment2.ex31.InputHandler;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Magic8BallTest {

    @Test
    void magicrandChoice() {

        Magic8Ball gameTest = new Magic8Ball();


        int expected = 1;
        int actual = gameTest.magicrandChoice(5);
        //This is here for the future challenges
        //I plan to update this in the future
        //As of now the base game doesn't have much to test outside of input errors that don't mess with the class in its current form.



        assertEquals(expected, actual);
    }
}