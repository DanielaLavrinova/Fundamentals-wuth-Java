package PBExams;

import java.util.Scanner;

public class Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int counterRed = 0;
        int counterOrange = 0;
        int counterYellow = 0;
        int counterWhite = 0;
        int counterBlack = 0;
        double points = 0.0;

        int numberBalls = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numberBalls ; i++) {
            String color = scanner.nextLine();

            switch(color){

                case "red":
                    points += 5;
                    counterRed ++;
                    break;
                case "orange":
                    points += 10;
                    counterOrange ++;
                    break;
                case "yellow":
                    points += 15;
                    counterYellow ++;
                    break;
                case "white":
                    points += 20;
                    counterWhite ++;
                    break;
                case "black":
                    points = Math.floor(points / 2);
                    counterBlack ++;
                    break;
                default:
                    counter ++;

            }

        }

        System.out.printf("Total points: %.0f%n",points);
        System.out.printf("Red balls: %d%n",counterRed);
        System.out.printf("Orange balls: %d%n",counterOrange);
        System.out.printf("Yellow balls: %d%n",counterYellow);
        System.out.printf("White balls: %d%n",counterWhite);
        System.out.printf("Other colors picked: %d%n",counter);
        System.out.printf("Divides from black balls: %d%n",counterBlack);

    }
}
