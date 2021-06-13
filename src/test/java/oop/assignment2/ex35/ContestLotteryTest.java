package oop.assignment2.ex35;

import oop.assignment2.ex34.EmployeeList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContestLotteryTest {

    @Test
    void setNameLottery() {
        ContestLottery contTest = new ContestLottery();

        String expected = "Roster Set.";
        String actual = contTest.setNameLottery("Shorty");
        assertEquals(expected, actual);
    }
}