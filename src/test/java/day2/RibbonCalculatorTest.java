package day2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class RibbonCalculatorTest {

    @Test
    void totalRibbon() throws IOException {

    int neededRibbon = RibbonCalculator.totalRibbon("day2_test_input.txt");
        Assertions.assertEquals(172, neededRibbon);



    }
}