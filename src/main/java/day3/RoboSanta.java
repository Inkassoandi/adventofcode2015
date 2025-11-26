package day3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class RoboSanta {


    public static int getDeliveries(String filename){

        int presentsDeliveries = 2;

        Map<Integer, String> deliveries = new HashMap<>();
        deliveries.put(0,"00");


        int x =0;
        int y=0;
        String santaPosition;
        String robotPosition;
        int house = 0;


        try (BufferedReader br = new BufferedReader(new FileReader(filename))){
            String line;
            line = br.readLine();
            String[] allMovements = line.split("");

            String[] santaMovements = new String[allMovements.length/2]; // ein array für Santas Positionen
            int santaMovementsPosition = 0;
            String[] robotMovements = new String[allMovements.length/2]; // ein Array für Robos Positionen

            for(int i=0; i<allMovements.length; i++){
                if (i %2 == 0){
                    santaMovements[i] = allMovements[i/2];
                }
            }


            for(String movement : movements){
                if (Objects.equals(movement, "^")){
                    y ++;
                } else if (Objects.equals(movement, "v")){
                    y --;
                } else if (Objects.equals(movement, "<")){
                    x --;
                } else if (Objects.equals(movement, ">")){
                    x ++;
                }

                house++;
                santaPosition = String.valueOf(x) + String.valueOf(y);

                if (!deliveries.containsValue(santaPosition)){
                    deliveries.put(house,santaPosition);
                    presentsDeliveries++;
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return presentsDeliveries;
    }



}
