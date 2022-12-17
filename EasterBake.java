package PBExams;

import java.util.Scanner;

public class EasterBake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalSugar = 0;
        int totalPowder = 0;
        double powderPackages = 0.0;
        double sugarPackages = 0.0;
        int maxPowder = Integer.MIN_VALUE;
        int maxSugar = Integer.MIN_VALUE;

        int easterBread = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= easterBread ; i++) {
            int sugar = Integer.parseInt(scanner.nextLine());
            int powder = Integer.parseInt(scanner.nextLine());

            totalSugar += sugar;
            totalPowder += powder;

            if(sugar > maxSugar){
                maxSugar = sugar;
            }
            if(powder > maxPowder){
                maxPowder = powder;
            }

        }

        sugarPackages = Math.ceil(totalSugar * 1.00 / 950);
        powderPackages = Math.ceil(totalPowder * 1.00 / 750);

        System.out.printf("Sugar: %.0f%n",sugarPackages);
        System.out.printf("Flour: %.0f%n",powderPackages);
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.",maxPowder,maxSugar);

    }
}
