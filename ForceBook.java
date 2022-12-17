package mapsLabdaStreamAPI;

import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        Map<String, List<String>> gameMap = new LinkedHashMap<>();

        List<String> teams = new ArrayList<>();


        while(!inputLine.equals("Lumpawaroo")){

            if(inputLine.contains("|")){
                String side = inputLine.split("\\s+\\|\\s+")[0];
                String user = inputLine.split("\\s+\\|\\s+")[1];

                if(!gameMap.containsKey(side)){

                    gameMap.put(side,new ArrayList<>());

                }

                boolean isExist = false;
                for (Map.Entry<String, List<String>> entry : gameMap.entrySet()) {
                    teams = entry.getValue();
                    if(teams.contains(user)){
                        isExist = true;
                        break;
                    }
                }
                if(!isExist){
                    gameMap.get(side).add(user);
                }

            }else if(inputLine.contains("->")){
                String user = inputLine.split(" -> ")[0];
                String side = inputLine.split(" -> ")[1];

                for (Map.Entry<String, List<String>> entry : gameMap.entrySet()) {
                    teams = entry.getValue();
                    if(teams.contains(user)){
                        teams.remove(user);
                        break;
                    }
                }
                if(!gameMap.containsKey(side)){
                    gameMap.put(side,new ArrayList<>());
                }
                gameMap.get(side).add(user);
                System.out.printf("%s joins the %s side!%n",user,side);

            }

            inputLine = scanner.nextLine();

        }

        gameMap.entrySet().stream().filter(e->e.getValue().size() > 0)
                .forEach(e->{
                    System.out.printf("Side: %s, Members: %d%n",e.getKey(),e.getValue().size());
                    e.getValue().forEach(user->{
                        System.out.printf("! %s%n",user);
                    });
                });
    }
}
