package MidExam;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int energy = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int wonBattle = 0;
        boolean lessEnergy = false;

        while(!input.equals("End of battle")){
            int distance = Integer.parseInt(input);

            if(energy >= distance){
                wonBattle ++;
                energy -= distance;
            }else if(energy < distance){
                lessEnergy = true;
                break;
            }

            if(wonBattle % 3 == 0){
                energy += wonBattle;
            }
            input = scanner.nextLine();
        }

        if(lessEnergy){
            System.out.printf("Not enough energy! Game ends with %d won battles and %d energy",wonBattle,energy);
        }else{
            System.out.printf("Won battles: %d. Energy left: %d",wonBattle,energy);
        }
    }
}
