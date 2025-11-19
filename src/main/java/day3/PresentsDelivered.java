package day3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Objects;

public class PresentsDelivered {



    public static int delivered(String filename){

        ArrayList<House> visitedHouses = new ArrayList<>();
        Position position = new Position(0,0);
        int deliveredPresents = 1;


        try (BufferedReader br = new BufferedReader(new FileReader(filename))){

            String movements;
            movements = br.readLine();
            movements = movements.trim();
            String[] moves = movements.split("");


            for (String move : moves) {
                if (Objects.equals(move, "^")) {
                    position.moveY(1);
                } else if (Objects.equals(move, "v")) {
                    position.moveY(-1);
                } else if (Objects.equals(move, ">")) {
                    position.moveX(1);
                } else if (Objects.equals(move, "<")) {
                    position.moveX(-1);
                }

                House house = new House(position.x, position.y);

                if (!visitedHouses.contains(house)) {
                    visitedHouses.add(house);
                    deliveredPresents++;
                }
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return  deliveredPresents;
    }


}
