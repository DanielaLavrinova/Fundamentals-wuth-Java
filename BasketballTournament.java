package PBExams;

import java.util.Scanner;

public class BasketballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int total = 0;
        int win = 0;
        int lost = 0;

        while(!name.equals("End of tournaments")){

            int games = Integer.parseInt(scanner.nextLine());
            int counter = 0;
            for (int i = 1; i <= games ; i++) {
                int pointsDesi = Integer.parseInt(scanner.nextLine());
                int points = Integer.parseInt(scanner.nextLine());
                counter ++;

                if(pointsDesi > points){
                    System.out.printf("Game %d of tournament %s: win with %d points.%n",counter,name,pointsDesi - points);
                    win ++;

                }else {
                    System.out.printf("Game %d of tournament %s: lost with %d points.%n",counter,name,points - pointsDesi);
                    lost ++;

                }

                total ++;


            }

            name = scanner.nextLine();
        }

        System.out.printf("%.2f%% matches win%n", (win * 1.00 / total)* 100);
        System.out.printf("%.2f%% matches lost", (lost * 1.00/ total) * 100);


    }
}
