package day3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SantasDeliveryTest {

    @Test
    void getDeliveries() {

        int testSolution = SantasDelivery.getDeliveries("day3_test.txt");
        assertEquals(4, testSolution);

    }
}