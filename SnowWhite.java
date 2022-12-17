package mapsLabdaStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SnowWhite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String,Map<String,Integer>> dwarfMap = new LinkedHashMap<>();

        while(!input.equals("Once upon a time")){
            String name = input.split(" <:> ")[0];
            String hatColor = input.split(" <:> ")[1];
            int physics = Integer.parseInt(input.split(" <:> ")[2]);

            Map<String,Integer> dataMap = new LinkedHashMap<>();

            if(!dwarfMap.containsKey(hatColor)){
                dataMap.put(name,physics);
                dwarfMap.put(hatColor,dataMap);

            }else{
                Map<String,Integer> currentMap = dwarfMap.get(hatColor);
                if(!dwarfMap.get(hatColor).containsKey(name)){

                    dwarfMap.get(hatColor).put(name,physics);

                }else{
                    int currentPhysics = currentMap.get(name);
                    if(currentPhysics < physics){
                        dwarfMap.get(hatColor).put(name,physics);

                    }
                }
            }

            input = scanner.nextLine();

        }


      /*  dwarfMap.entrySet().stream().sorted((a,b) -> b.getValue().size() - a.getValue().size()).forEach(entry->{
            Map<String,Integer> currentMap = entry.getValue();
            String color = entry.getKey();
            currentMap.entrySet().stream().sorted((a,b) -> b.getValue() - a.getValue()).forEach(e->{
                System.out.printf("(%s) %s - %d%n",color,e.getKey(),e.getValue());
            });

        }); */

       /* dwarfMap.entrySet().stream().sorted((a,b) -> b.getValue().size() - a.getValue().size()).forEach(entry->{
            String color = entry.getKey();
            entry.getValue().entrySet().stream().sorted((a,b) -> a.getValue() - b.getValue()).forEach(e -> {
                System.out.printf("(%s) %s - %d%n",color,e.getKey(),e.getValue());
            });
        }); */

        dwarfMap.entrySet().stream().sorted((a,b) -> b.getValue().values().stream().mapToInt(i ->i).sum()
                - a.getValue().values().stream().mapToInt(i ->i).sum()
        ).forEach(entry->{
            String color = entry.getKey();
            entry.getValue().entrySet().stream().sorted((a,b) -> b.getValue() - a.getValue()).forEach(e -> {
                System.out.printf("(%s) %s <-> %d%n",color,e.getKey(),e.getValue());
            });
        });

        System.out.println();
        System.out.println();

       dwarfMap.entrySet().stream().sorted((a,b) -> b.getValue().values().stream().mapToInt(i ->i).sum()
                - a.getValue().values().stream().mapToInt(i ->i).sum()
        ).sorted((i,j) -> i.getValue().size() - j.getValue().size()).forEach(entry->{
            String color = entry.getKey();
            entry.getValue().entrySet().stream().sorted((a,b) -> b.getValue() - a.getValue()).forEach(e -> {
                System.out.printf("(%s) %s <-> %d%n",color,e.getKey(),e.getValue());
            });
        });
    }
}
