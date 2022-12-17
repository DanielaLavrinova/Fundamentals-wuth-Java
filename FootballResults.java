package PBExams;

import java.util.Scanner;

public class FootballResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 3;
        int won = 0;
        int lost = 0;
        int drawn = 0;

        for (int i = 1; i <= n ; i++) {


            String firstResult = scanner.nextLine();


            char letterF = firstResult.charAt(0);
            char letterS = firstResult.charAt(2);

            int firstN = Integer.parseInt(String.valueOf(letterF));
            int secondN = Integer.parseInt(String.valueOf(letterS));

            if(firstN > secondN){
                won ++;

            }else if(firstN < secondN){
                lost ++;

            }else if(firstN == secondN){
                drawn ++;

            }

        }

        System.out.printf("Team won %d games.%n",won);
        System.out.printf("Team lost %d games.%n",lost);
        System.out.printf("Drawn games: %d",drawn);


    }
}

