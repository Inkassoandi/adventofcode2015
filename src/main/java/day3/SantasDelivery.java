package day3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
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


        int x =0;
        int y=0;
        String position;
        int house = 0;


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

                house++;
                position = String.valueOf(x) + String.valueOf(y);

                if (!deliveries.containsValue(position)){
                    deliveries.put(house,position);
                    presentsDeliveries++;
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return presentsDeliveries;
    }


}
