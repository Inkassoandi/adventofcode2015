package day2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class PaperCalculatorTest {

    @Test
    void paperNeeded() throws IOException {

    String testPackage = "day2_test_input.txt";
    long neededPackage = PaperCalculator.paperNeeded(testPackage);

        Assertions.assertEquals(305, neededPackage);

    }
}