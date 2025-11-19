package day3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PresentsDeliveredTest {

    @Test
    void delivered() {


    int presentsDelivered = PresentsDelivered.delivered("day3_test.txt");
        Assertions.assertEquals(4, presentsDelivered);



    }
}