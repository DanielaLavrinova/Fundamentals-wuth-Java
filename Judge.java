package mapsLabdaStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Judge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String data = scanner.nextLine();
        Map<String,Map<String,Integer>> contestMap = new LinkedHashMap<>();
        Map<String,Integer> studentsMap = new TreeMap<>();

        while(!data.equals("no more time")){
            String username = data.split(" -> ")[0];
            String contest = data.split(" -> ")[1];
            int points = Integer.parseInt(data.split(" -> ")[2]);

            Map<String,Integer> usersMap = new TreeMap<>();
            boolean flag = false;


            if(!contestMap.containsKey(contest)){
                usersMap.put(username,points);
                contestMap.put(contest,usersMap);

            }else{
                if(!contestMap.get(contest).containsKey(username)){
                    usersMap.put(username,points);
                    contestMap.get(contest).put(username,points);
                }else{
                    flag = true;
                    int currentPoints = contestMap.get(contest).get(username);
                    if(currentPoints < points){
                        contestMap.get(contest).put(username,points);
                    }
                }
            }

            if(!studentsMap.containsKey(username)){
                studentsMap.put(username,points);
            }else{
                if(!flag) {
                    int value = studentsMap.get(username);
                    studentsMap.put(username, points + value);
                }else{
                    if(points > studentsMap.get(username)){
                        studentsMap.put(username,points);
                    }

                }
            }



            data = scanner.nextLine();

        }


        contestMap.entrySet().forEach(e -> {
            AtomicInteger number = new AtomicInteger();
            System.out.printf("%s: %d participants%n",e.getKey(),e.getValue().size());
            e.getValue().entrySet().stream().sorted((a, b) -> b.getValue() - a.getValue()).forEach(entry -> {
                System.out.printf("%d. %s <::> %d%n",number.incrementAndGet(),entry.getKey(),entry.getValue());
            });
        });

        System.out.println("Individual standings:");
        AtomicInteger number2 = new AtomicInteger();

        studentsMap.entrySet().stream().sorted((a, b) -> b.getValue() - a.getValue())
                .forEach(entry ->{
                    System.out.printf("%d. %s -> %d%n",number2.incrementAndGet(),entry.getKey(),entry.getValue());
                });
    }
}
