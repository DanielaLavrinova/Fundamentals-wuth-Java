package mapsLabdaStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MOBAChallenger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String,Map<String,Integer>> playersMap = new LinkedHashMap<>();

        while (!input.equals("Season end")){
            Map<String,Integer> skillsMap = new LinkedHashMap<>();

            if(input.contains("->")){
                String player = input.split(" -> ")[0];
                String position = input.split(" -> ")[1];
                int skill = Integer.parseInt(input.split(" -> ")[2]);

                if(!playersMap.containsKey(player)){
                    skillsMap.put(position,skill);
                    playersMap.put(player,skillsMap);
                }else{
                    if(!playersMap.get(player).containsKey(position)){
                        playersMap.get(player).put(position,skill);
                    }else{
                        int currentSkill = playersMap.get(player).get(position);
                        if(currentSkill < skill){
                            playersMap.get(player).put(position,skill);
                        }
                    }
                }

            }else if(input.contains("vs")){
                String playerOne = input.split(" vs ")[0];
                String playerTwo = input.split(" vs ")[1];

                if(playersMap.containsKey(playerOne) && playersMap.containsKey(playerTwo)){
                    Map<String,Integer> playerOneMap = playersMap.get(playerOne);
                    Map<String,Integer> playerTwoMap = playersMap.get(playerTwo);

                    boolean isEqual = false;

                    for (Map.Entry<String, Integer> entry : playerOneMap.entrySet()) {
                        String elementOne = entry.getKey();
                        for (Map.Entry<String, Integer> e : playerTwoMap.entrySet()) {
                            String elementTwo = e.getKey();
                            if(elementTwo.equals(elementOne)){
                                isEqual = true;
                                break;
                            }
                        }

                    }

                    int sumPlayerOne = 0;
                    int sumPlayerTwo = 0;

                    if(isEqual){
                        for (Map.Entry<String, Integer> entry : playerOneMap.entrySet()) {
                            sumPlayerOne += entry.getValue();
                        }

                        for (Map.Entry<String, Integer> entry : playerTwoMap.entrySet()) {
                            sumPlayerTwo += entry.getValue();
                        }

                        if(sumPlayerOne > sumPlayerTwo){
                            playersMap.remove(playerTwo);
                        }else if(sumPlayerOne < sumPlayerTwo){
                            playersMap.remove(playerOne);
                        }


                    }


                }

            }

            input = scanner.nextLine();

        }


        playersMap.entrySet().stream().sorted((a,b) -> b.getValue().values().stream().mapToInt(i ->i).sum()
                - a.getValue().values().stream().mapToInt(i ->i).sum()
                ).forEach(entry ->{
            System.out.printf("%s: %d skill%n",entry.getKey(),entry.getValue().values().stream().mapToInt(i -> i).sum());
            entry.getValue().entrySet().stream().sorted((a,b) -> b.getValue() - a.getValue()).forEach(e ->{
                System.out.printf("- %s <::> %d%n",e.getKey(),e.getValue());
            });

        });

    }
}
