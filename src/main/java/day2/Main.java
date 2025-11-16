package day2;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        long paperNeeded = PaperCalculator.paperNeeded("day2_input.txt");
        System.out.println("Paper Needed: " + paperNeeded);


        int ribbonNeeded = RibbonCalculator.totalRibbon("day2_input.txt");
        System.out.println("Total Ribbon: " + ribbonNeeded);

    }
}
