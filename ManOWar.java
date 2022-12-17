package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ManOWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> pirateShip = Arrays.stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> warShip = Arrays.stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int healthCapacity = Integer.parseInt(scanner.nextLine());

        String inputLine = scanner.nextLine();
        boolean flag = false;

        while(!inputLine.equals("Retire")){
            String command = inputLine.split(" ")[0];



            switch (command){
                case "Fire":
                    int index = Integer.parseInt(inputLine.split(" ")[1]);
                    int damageWarShip = Integer.parseInt(inputLine.split(" ")[2]);
                    boolean isWarIndexValid = isIndexValid(index,warShip);
                    int damagedSection = 0;
                    if(isWarIndexValid){
                        damagedSection = warShip.get(index) - damageWarShip;
                        if(damagedSection <= 0){
                            System.out.println("You won! The enemy ship has sunken.");
                            flag = true;
                            break;
                        }else {
                            warShip.set(index,damagedSection);
                        }
                    }
                    break;
                case "Defend":
                    int starIndex = Integer.parseInt(inputLine.split(" ")[1]);
                    int endIndex = Integer.parseInt(inputLine.split(" ")[2]);
                    int damagePirateShip = Integer.parseInt(inputLine.split(" ")[3]);
                    int damagedElement = 0;

                    if(isIndexValid(starIndex,pirateShip) && isIndexValid(endIndex,pirateShip)){
                        for (int i = starIndex; i <= endIndex; i++) {
                            int currentElement = pirateShip.get(i);
                            damagedElement = currentElement - damagePirateShip;
                            if(damagedElement <= 0){
                                System.out.println("You lost! The pirate ship has sunken.");
                                flag = true;
                                break;

                            }
                            pirateShip.set(i,damagedElement);
                        }


                    }
                    break;
                case "Repair":
                    int indexToRepair = Integer.parseInt(inputLine.split(" ")[1]);
                    int health = Integer.parseInt(inputLine.split(" ")[2]);
                    int repairedSection = 0;
                    if(isIndexValid(indexToRepair,pirateShip)){
                        repairedSection = pirateShip.get(indexToRepair) + health;

                        if(repairedSection > healthCapacity){
                            repairedSection = healthCapacity;
                        }

                        pirateShip.set(indexToRepair,repairedSection);

                    }
                    break;
                case "Status":
                    double sectionToRepair = healthCapacity * 0.20;
                    int counter = 0;
                    for (int element: pirateShip) {
                        if(element < sectionToRepair){
                            counter ++;

                        }

                    }
                    System.out.printf("%d sections need repair.%n",counter);
                    break;
            }

            inputLine = scanner.nextLine();


        }
        int sumPirateShip = 0;
        int sumWarShip = 0;

        if(!flag){
            for (int element:pirateShip) {
                sumPirateShip += element;
            }
            for (int element:warShip) {
                sumWarShip += element;
            }

            System.out.printf("Pirate ship status: %d%n",sumPirateShip);
            System.out.printf("Warship status: %d",sumWarShip);

        }
    }

    public static boolean isIndexValid(int index,List<Integer>numbersList){

        return  index >= 0 && index <= numbersList.size() - 1;

    }
}
