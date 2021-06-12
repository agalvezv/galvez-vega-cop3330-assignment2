package oop.assignment2.ex27;

import oop.assignment2.ex25.Password;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidationTest {

    @Test
    void short_first_name() {
        Validation valTest = new Validation("","James","33512","AA-1234");


        int expected = 1;
        int actual = Validation.emptyfCheck("");

        assertEquals(expected, actual);
    }
}