package day3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class RoboSanta {


    public static int getDeliveries(String filename){

        int presentsDeliveries = 1; // Startwert der gelieferten Geschenke

        Map<Integer, String> deliveries = new HashMap<>(); // Hashmap für die erfassung bereits gelieferter Pakete
        deliveries.put(0,"00");

        int keyHashMap = 0; // Key für die Hashmap

        String santaPosition;   // String für die aufnahme der Position in die HashMap
        int xSanta =0;   // Position auf der X Achse
        int ySanta=0;    // Position auf der Y Achse

        String robotPosition;
        int xRobo=0;
        int yRobo=0;



        try (BufferedReader br = new BufferedReader(new FileReader(filename))){
            String line;
            line = br.readLine();
            String[] allMovements = line.split("");

            String[] santaMovements = new String[allMovements.length/2]; // ein array für Santas Bewegungen
            int santasArrayIndex = 0;
            String[] robotMovements = new String[allMovements.length/2]; // ein Array für Robos Bewegungen
            int robosArrayIndex = 0;

            for(int i=0; i<allMovements.length; i++){   // hier werden die Bewegungen in Santas und Robos Array aufgeteilt
                if (i %2 == 0){
                    santaMovements[santasArrayIndex] = allMovements[i];
                    santasArrayIndex++;
                } else {
                    robotMovements[robosArrayIndex] = allMovements[i];
                    robosArrayIndex++;
                }
            }

            // bis hier klappt alles

            for(String movement : santaMovements){
                if (Objects.equals(movement, "^")){
                    ySanta ++;
                } else if (Objects.equals(movement, "v")){
                    ySanta --;
                } else if (Objects.equals(movement, "<")){
                    xSanta --;
                } else if (Objects.equals(movement, ">")){
                    xSanta ++;
                }

                keyHashMap++;
                santaPosition = String.valueOf(xSanta) + String.valueOf(ySanta);

                if (!deliveries.containsValue(santaPosition)){
                    deliveries.put(keyHashMap,santaPosition);
                    presentsDeliveries++;
                }
            }

            for(String movement : robotMovements){
                if (Objects.equals(movement, "^")){
                    yRobo ++;
                } else if (Objects.equals(movement, "v")){
                    yRobo --;
                } else if (Objects.equals(movement, "<")){
                    xRobo --;
                } else if (Objects.equals(movement, ">")){
                    xRobo ++;
                }

                keyHashMap++;
                robotPosition = String.valueOf(xRobo) + String.valueOf(yRobo);

                if (!deliveries.containsValue(robotPosition)){
                    deliveries.put(keyHashMap,robotPosition);
                    presentsDeliveries++;
                }
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return presentsDeliveries;
    }



}
