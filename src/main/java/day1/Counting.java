package day1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Counting {


    public static int floorCount(String filename) throws IOException {

        int floor = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

            String line;
            char[] chars = null;

            while ((line = br.readLine()) != null) {
                line = line.strip();
                chars = line.toCharArray();
            }
            for (char c : chars) {
                if (c == '(') {
                    floor++;
                } else if (c == ')'){
                    floor--;
                }
            }
        }
        return floor;
    }


}
