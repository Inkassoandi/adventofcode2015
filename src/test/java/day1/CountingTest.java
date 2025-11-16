package day1;

import org.junit.jupiter.api.Assertions;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class CountingTest {

    @org.junit.jupiter.api.Test
    void floorCount() throws IOException {


        int floortest = Counting.floorCount("test_input.txt");
        Assertions.assertEquals(2, floortest);

    }
}