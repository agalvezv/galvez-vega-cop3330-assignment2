package oop.assignment2.ex39;

import oop.assignment2.ex38.Filter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableOrganizationTest {

    @Test
    void sort_Check() {

        TableOrganization tableTest = new TableOrganization();

        tableTest.firstName.add("Fezz");
        tableTest.lastName.add("Ura");
        tableTest.position.add("Captain");
        tableTest.sepDate.add("2016-12-31");
        tableTest.sortList.add("Ura");

        tableTest.firstName.add("Orson");
        tableTest.lastName.add("James");
        tableTest.position.add("Sergeant");
        tableTest.sepDate.add("2016-12-31");
        tableTest.sortList.add("James");



        tableTest.rearrangeLists();
        String expected = "James";
        String actual = tableTest.sortList.get(0);
        assertEquals(expected, actual);
    }

}