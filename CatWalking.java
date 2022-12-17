package PBExams;

import java.util.Scanner;

public class CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minWalk = Integer.parseInt(scanner.nextLine());
        int numWalks = Integer.parseInt(scanner.nextLine());
        int calories = Integer.parseInt(scanner.nextLine());

        int burnCalories = (numWalks * minWalk) * 5;

        if(burnCalories >= calories * 1.00 / 2){
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.",burnCalories);
        }else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.",burnCalories);
        }
    }
}
