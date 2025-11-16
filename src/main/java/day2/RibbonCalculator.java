package day2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class RibbonCalculator {


    /*
     ribbon for bow == volume of present
     ribbon required to wrap the present - 2x3x4 -> 2+2+3+3 = 10
     */


    public static int totalRibbon(String filename) throws IOException {
        int finalRibbon = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                String[] parts = line.split("x");
                int l = Integer.parseInt(parts[0]);
                int w = Integer.parseInt(parts[1]);
                int h = Integer.parseInt(parts[2]);
                int volume = l * w * h;
                finalRibbon += volume;

                int[] sortSides = {l,w,h};
                Arrays.sort(sortSides);
                finalRibbon += 2*(sortSides[0]+sortSides[1]);
            }
            return finalRibbon;
        }
    }
}
