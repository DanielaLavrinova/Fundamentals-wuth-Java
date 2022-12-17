package ForLoop;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());
        int points = 0;
        int count = 0;

        for (int i = 1; i <= number ; i++) {
            String rank = scanner.nextLine();

            switch (rank){

                case "W":
                    points += 2000;
                    count ++;
                    break;
                case "F":
                    points += 1200;
                    break;
                case "SF":
                    points += 720;
                    break;

            }

        }

        int finalPoints = startingPoints + points;
        int averagePoints = points  / number;
        double win =(count * 1.00 / number) * 100;

        System.out.printf("Final points: %d%nAverage points: %d%n%.2f%%",finalPoints,averagePoints,win);

    }
}
