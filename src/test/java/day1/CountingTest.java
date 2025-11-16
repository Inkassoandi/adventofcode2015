package day1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class CountingTest {

    @Test
    void floorCount() throws IOException {
        int floortest = Counting.floorCount("day1_test_input.txt");
        Assertions.assertEquals(2, floortest);
    }

    @Test
    void firstTimeBasement() throws IOException {
        int basementTest = Counting.firstTimeBasement("day1_test_input.txt");
        Assertions.assertEquals(7, basementTest);
    }
}