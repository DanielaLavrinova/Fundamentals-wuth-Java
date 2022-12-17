package PBExams;

import java.util.Scanner;

public class FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double eatenFood = 0;
        double dogFood = 0;
        double catFood = 0;
        double biscuit = 0;
        double totalBiscuit = 0;
        double totalEaten = 0;

        int days = Integer.parseInt(scanner.nextLine());
        double food = Double.parseDouble(scanner.nextLine());

        for (int i = 1; i <= days ; i++) {
            int dog = Integer.parseInt(scanner.nextLine());
            int cat = Integer.parseInt(scanner.nextLine());

            eatenFood = dog + cat;
            totalEaten += eatenFood;
            dogFood += dog;
            catFood += cat;

            if(i % 3 == 0){
                biscuit = eatenFood * 0.10;
                totalBiscuit += biscuit;
            }

        }

        double round = Math.round(totalBiscuit);

        System.out.printf("Total eaten biscuits: %.0fgr.%n",round);
        System.out.printf("%.2f%% of the food has been eaten.%n",(totalEaten / food)* 100);
        System.out.printf("%.2f%% eaten from the dog.%n",(dogFood / totalEaten) * 100);
        System.out.printf("%.2f%% eaten from the cat.",(catFood / totalEaten) * 100);


    }
}
