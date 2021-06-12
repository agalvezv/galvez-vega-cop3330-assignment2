package oop.assignment2.ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void isAnagram_correct_with_lengths() {
        Anagram testAnagram = new Anagram();



        boolean actual = Anagram.isAnagram("244", "wfew3f");


        boolean expected = false;
        assertEquals(expected, actual);
    }
}