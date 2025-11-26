package day3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class SantasDelivery {


    public static int getDeliveries(String filename){

        int presentsDeliveries = 1;

        Map<Integer, String> deliveries = new HashMap<>();
        deliveries.put(0,"00");

        int keyHashMap = 0;
        int x =0;
        int y=0;
        String position;



        try (BufferedReader br = new BufferedReader(new FileReader(filename))){
            String line;
            line = br.readLine();
            String[] movements = line.split("");

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

                keyHashMap++;
                position = String.valueOf(x) + String.valueOf(y);

                if (!deliveries.containsValue(position)){
                    deliveries.put(keyHashMap,position);
                    presentsDeliveries++;
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return presentsDeliveries;
    }


}
