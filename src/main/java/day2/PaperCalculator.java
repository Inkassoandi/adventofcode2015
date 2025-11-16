package day2;

import java.io.*;

public class PaperCalculator {

    public static long paperNeeded(String filename) throws IOException {

        long finalPaper = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filename))){
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                String[] parts = line.split("x");
                int l = Integer.parseInt(parts[0]);
                int w = Integer.parseInt(parts[1]);
                int h = Integer.parseInt(parts[2]);
                int thisPaper = (2*l*w) + (2*l*h) + (2*w*h);
                finalPaper += thisPaper;

                int a = l*w;
                int b = l*h;
                int c = w*h;
                int smallest = Math.min(a, Math.min(b, c));
                finalPaper += smallest;
            }
        }

        return finalPaper;
    }

}
