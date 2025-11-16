package day1;

import java.io.IOException;

public class Main  {
    public static void main(String[] args) throws IOException {

        int floor = Counting.floorCount("day1_input.txt");
        System.out.println("floor: " + floor);

        int firstTimeBasement = Counting.firstTimeBasement("day1_input.txt");
        System.out.println("firstTimeBasement: " + firstTimeBasement);
    }

    }

