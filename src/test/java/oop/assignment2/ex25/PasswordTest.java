package oop.assignment2.ex25;

import oop.assignment2.ex24.Anagram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordTest {

    @Test
    void passwordResult() {
        Password testPassword = new Password("Orange");


        int expected = 2;
        int actual = Password.passwordValidator("Orange");

        assertEquals(expected, actual);
    }
}