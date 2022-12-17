package PBExams;

import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int maxGoals = Integer.MIN_VALUE;
        String lastPlayer = "";
        boolean flag = false;

        String namePlayer = scanner.nextLine();

        while(!namePlayer.equals("END")){
            int goals = Integer.parseInt(scanner.nextLine());

            if(goals >= 10){
                System.out.printf("%s is the best player!%n",namePlayer);
                System.out.printf("He has scored %d goals and made a hat-trick !!!",goals);
                flag = true;
                break;
            }

            if(goals > maxGoals){
                maxGoals = goals;
                lastPlayer = namePlayer;
            }

            namePlayer = scanner.nextLine();

        }

        if(!flag) {

            if (maxGoals >= 3) {
                System.out.printf("%s is the best player!%n", lastPlayer);
                System.out.printf("He has scored %d goals and made a hat-trick !!!", maxGoals);

            } else {
                System.out.printf("%s is the best player!%n", lastPlayer);
                System.out.printf("He has scored %d goals.", maxGoals);

            }
        }

    }
}
