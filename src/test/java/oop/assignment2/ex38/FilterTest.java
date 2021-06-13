package oop.assignment2.ex38;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilterTest {

    @Test
    void newSize() {
        int size = 6;
        double initialArray[] = new double[size];
        initialArray[0]=1;
        initialArray[1]=2;
        initialArray[2]=1;
        initialArray[3]=2;
        initialArray[4]=1;
        initialArray[5]=1;
        Filter testFilter = new Filter(initialArray,size);

        int expected = 2;
        int actual = testFilter.newSize();
        assertEquals(expected, actual);
    }
}