package mapsLabdaStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        int counter = 0;
        String item = "";

        Map<String,Integer> itemsMap = new LinkedHashMap<>();

        while(!inputLine.equals("stop")){
            counter ++;
            if(counter % 2 != 0){
                item = inputLine;
                if(!itemsMap.containsKey(item)){
                    itemsMap.put(item,0);
                }
            }else {
                int quantity = Integer.parseInt(inputLine);
                int currentQuantity = itemsMap.get(item);
                itemsMap.put(item,currentQuantity + quantity);
            }

            inputLine = scanner.nextLine();

        }

        itemsMap.entrySet().forEach(entry ->{
            System.out.printf("%s -> %d%n",entry.getKey(),entry.getValue());
        });
    }
}
