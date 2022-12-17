package finalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String,Integer> citiesMap = new LinkedHashMap<>();
        Map<String,Integer> goldMap = new LinkedHashMap<>();

        while(!input.equals("Sail")){
            String cityName = input.split("\\|\\|")[0];
            int population = Integer.parseInt(input.split("\\|\\|")[1]);
            int gold = Integer.parseInt(input.split("\\|\\|")[2]);

            if(!citiesMap.containsKey(cityName)){
                citiesMap.put(cityName,population);
                goldMap.put(cityName,gold);
            }else{
                int currentGold = goldMap.get(cityName);
                int currentPopulation = citiesMap.get(cityName);
                currentGold += gold;
                currentPopulation += population;
                citiesMap.put(cityName,currentPopulation);
                goldMap.put(cityName,currentGold);

            }

            input = scanner.nextLine();

        }

        String data = scanner.nextLine();

        while(!data.equals("End")){
            String command = data.split("=>")[0];
            String town = data.split("=>")[1];

            if(command.equals("Plunder")){
                int people = Integer.parseInt(data.split("=>")[2]);
                int gold = Integer.parseInt(data.split("=>")[3]);

                System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n",town
                        ,gold,people);
                int currentPeople = citiesMap.get(town);
                int currentGold = goldMap.get(town);

                currentPeople -= people;
                currentGold -= gold;
                citiesMap.put(town,currentPeople);
                goldMap.put(town,currentGold);

                if(currentGold <= 0 || currentPeople <= 0){
                    citiesMap.remove(town);
                    goldMap.remove(town);
                    System.out.printf("%s has been wiped off the map!%n",town);

                }


            }else if(command.equals("Prosper")){
                int gold = Integer.parseInt(data.split("=>")[2]);

                if(gold < 0){
                    System.out.printf("Gold added cannot be a negative number!%n");

                }else {
                    int currentGold = goldMap.get(town);
                    currentGold += gold;
                    goldMap.put(town,currentGold);
                    System.out.printf("%d gold added to the city treasury." +
                            " %s now has %d gold.%n",gold,town,currentGold);
                }

            }

            data = scanner.nextLine();

        }

        int size = citiesMap.size();

        if(size > 0){
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n",size);

            citiesMap.entrySet().forEach(e->{
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n"
                ,e.getKey(),e.getValue(),goldMap.get(e.getKey()));
            });
        }else{
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }
    }
}
