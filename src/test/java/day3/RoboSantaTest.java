package day3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoboSantaTest {

    @Test
    void getDeliveries() {

        int presentsDelivered = RoboSanta.getDeliveries("day3_test.txt");
        assertEquals(6, presentsDelivered);
        System.out.println(presentsDelivered);



    }
}