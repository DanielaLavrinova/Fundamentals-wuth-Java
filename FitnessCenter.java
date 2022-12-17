package PBExams;

import java.util.Scanner;

public class FitnessCenter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counterBack = 0;
        int counterChest = 0;
        int counterLegs = 0;
        int counterAbs = 0;
        int counterShake = 0;
        int counterBar = 0;
        int counterSport = 0;
        int counterFood = 0;

        int people = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= people ; i++) {
            String training = scanner.nextLine();

            switch (training){

                case "Back":
                    counterBack ++;
                    break;
                case "Chest":
                    counterChest ++;
                    break;
                case "Legs":
                    counterLegs ++;
                    break;
                case "Abs":
                    counterAbs ++;
                    break;
                case "Protein shake":
                    counterShake ++;
                    break;
                case "Protein bar":
                    counterBar ++;
                    break;

            }

        }

        counterSport = counterAbs + counterBack + counterChest + counterLegs;
        counterFood = counterShake + counterBar;

        System.out.printf("%d - back%n",counterBack);
        System.out.printf("%d - chest%n",counterChest);
        System.out.printf("%d - legs%n",counterLegs);
        System.out.printf("%d - abs%n",counterAbs);
        System.out.printf("%d - protein shake%n",counterShake);
        System.out.printf("%d - protein bar%n",counterBar);
        System.out.printf("%.2f%% - work out%n",(counterSport * 1.00 / people)* 100);
        System.out.printf("%.2f%% - protein%n",(counterFood * 1.00 / people)* 100);

    }
}
