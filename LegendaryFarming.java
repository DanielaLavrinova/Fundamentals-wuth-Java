package mapsLabdaStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,Integer> legendaryItems = new LinkedHashMap<>();
        legendaryItems.put("shards",0);
        legendaryItems.put("fragments",0);
        legendaryItems.put("motes",0);

        Map<String,Integer> trashItems = new LinkedHashMap<>();
        boolean isObtained = false;

        String inputLine = scanner.nextLine().toLowerCase();

        while(true){
            String[] items = inputLine.split("\\s+");
            for (int i = 0; i < items.length; i =i + 2) {
                int quantity = Integer.parseInt(items[i]);
                String material = items[i + 1];

                if(material.equals("shards") || material.equals("fragments") || material.equals("motes")){
                   int currentQuantity = legendaryItems.get(material);
                   legendaryItems.put(material,currentQuantity + quantity);
                }else{
                    if(!trashItems.containsKey(material)){
                        trashItems.put(material,quantity);
                    }else{
                        int trashQuantity = trashItems.get(material);
                        trashItems.put(material,trashQuantity + quantity);
                    }
                }
                int shardsQuantity = legendaryItems.get("shards");
                int fragmentsQuantity = legendaryItems.get("fragments");
                int motesQuantity = legendaryItems.get("motes");

                if(shardsQuantity >= 250){
                    System.out.println("Shadowmourne obtained!");
                    shardsQuantity -= 250;
                    legendaryItems.put("shards",shardsQuantity);
                    isObtained = true;
                    break;

                }else if(fragmentsQuantity >= 250){
                    System.out.println("Valanyr obtained!");
                    fragmentsQuantity -= 250;
                    legendaryItems.put("fragments",fragmentsQuantity);
                    isObtained = true;
                    break;


                }else if(motesQuantity >= 250){
                    System.out.println("Dragonwrath obtained!");
                    motesQuantity -= 250;
                    legendaryItems.put("motes",motesQuantity);
                    isObtained = true;
                    break;

                }

            }

            if(isObtained){
                break;
            }

            inputLine = scanner.nextLine().toLowerCase();

        }

        legendaryItems.entrySet().forEach(e-> {
            System.out.printf("%s: %d%n",e.getKey(),e.getValue());
        });
        trashItems.entrySet().forEach(e->{
            System.out.printf("%s: %d%n",e.getKey(),e.getValue());
        });
    }
}
