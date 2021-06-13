package oop.assignment2.ex34;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeListTest {

    @Test
    void emptyEmployList() {
        ArrayList employList = new ArrayList();
        EmployeeList empTest = new EmployeeList(employList);

        String expected = "Not in the list";
        String actual = empTest.emptyEmployList("Potato");
        assertEquals(expected, actual);
        //Future update for this as well.
    }
}