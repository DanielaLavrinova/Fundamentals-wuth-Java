package MidExam;

import java.util.Scanner;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int health = 100;
        int bitcoins = 0;
        String[] roomsArray = scanner.nextLine().split("\\|+");
        boolean isKilled = false;


        for (int i = 0; i < roomsArray.length ; i++) {
            String eachRoom = roomsArray[i];
            String[] elementsArray = eachRoom.split(" ");
            String command = elementsArray[0];
            int number = Integer.parseInt(elementsArray[1]);


            switch (command){
                case "potion":
                    int healthBeforeHeal = health;
                    health += number;
                    if(health >=100){
                        health = 100;
                        System.out.printf("You healed for %d hp.%n",100 - healthBeforeHeal);
                        System.out.printf("Current health: %d hp.%n",health);
                    }else{
                        System.out.printf("You healed for %d hp.%n",number);
                        System.out.printf("Current health: %d hp.%n",health);
                    }

                    break;
                case "chest":
                    bitcoins += number;
                    System.out.printf("You found %d bitcoins.%n",number);
                    break;
                default:
                    health -= number;
                    if(health > 0){
                        System.out.printf("You slayed %s.%n",command);

                    }else{
                        System.out.printf("You died! Killed by %s.%n",command);
                        System.out.printf("Best room: %d",i +1);
                        isKilled = true;
                        break;
                    }
                    break;

            }
            if(isKilled){
                break;
            }


        }
        if(!isKilled) {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", bitcoins);
            System.out.printf("Health: %d", health);
        }
    }
}
