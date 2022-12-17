package finalExam;

import java.util.*;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String,Integer> plantMap = new LinkedHashMap<>();
        Map<String, List<Integer>> rateMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String data = scanner.nextLine();
            String plant = data.split("<->")[0];
            int rarity = Integer.parseInt(data.split("<->")[1]);

            plantMap.put(plant,rarity);
            List<Integer> list = new ArrayList<>();
            list.add(0);
            rateMap.put(plant,list);

        }

        String input = scanner.nextLine();

        while(!input.equals("Exhibition")){
            String[] tokens = input.split("[: -]+");
            String command = tokens[0];
            String plant = tokens[1];

            if(command.equals("Rate")){
                int rate = Integer.parseInt(tokens[2]);
                if(rateMap.containsKey(plant)){

                    rateMap.get(plant).add(rate);

                }else{
                    System.out.println("error");
                }


            }else if(command.equals("Update")){
                int rarity = Integer.parseInt(tokens[2]);
                if(rateMap.containsKey(plant)){
                    plantMap.put(plant,rarity);

                }else{
                    System.out.println("error");
                }


            }else if(command.equals("Reset")){
                if(rateMap.containsKey(plant)){
                    List<Integer> emptyList = new ArrayList<>();
                    emptyList.add(0);
                    rateMap.put(plant,emptyList);

                }else{
                    System.out.println("error");
                }

            }


            input = scanner.nextLine();

        }

        Map<String,Double> averageMap = new LinkedHashMap<>();

        for (Map.Entry<String, List<Integer>> entry : rateMap.entrySet()) {
            List<Integer> entryList = entry.getValue();
            entryList.remove(0);
            Double average = entryList.stream().mapToInt(value-> value).average().orElse(0.0);
            averageMap.put(entry.getKey(), average);

        }

        System.out.println("Plants for the exhibition:");

        plantMap.entrySet().forEach(e->{
            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n",e.getKey(),e.getValue(),averageMap.get(e.getKey()));
        });

    }
}
