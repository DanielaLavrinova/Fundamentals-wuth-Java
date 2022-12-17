package PBExams;

import java.util.Scanner;

public class FootballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int games = Integer.parseInt(scanner.nextLine());
        int counterW = 0;
        int counterD = 0;
        int counterL = 0;
        int totalPoints = 0;

        for (int i = 1; i <= games ; i++) {
            int points = 0;
            String result = scanner.nextLine();

            switch (result){

                case "W":
                    points = 3;
                    counterW ++;
                    break;
                case "D":
                    points = 1;
                    counterD ++;
                    break;
                case "L":
                    counterL ++;
                    break;

            }

            totalPoints = totalPoints + points;

        }

        if(games < 1){
            System.out.printf("%s hasn't played any games during this season.",name);

        }else {
            System.out.printf("%s has won %d points during this season.%n",name,totalPoints);
            System.out.println("Total stats:");
            System.out.printf("## W: %d%n",counterW);
            System.out.printf("## D: %d%n",counterD);
            System.out.printf("## L: %d%n",counterL);
            System.out.printf("Win rate: %.2f%%",(counterW * 1.00/games) * 100);

        }

    }
}
