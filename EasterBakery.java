package PBExams;

import java.util.Scanner;

public class EasterBakery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double powderPrice = Double.parseDouble(scanner.nextLine());
        double powderQuantity = Double.parseDouble(scanner.nextLine());
        double sugarQuantity = Double.parseDouble(scanner.nextLine());
        double eggsQuantity = Double.parseDouble(scanner.nextLine());
        int maqQuantity = Integer.parseInt(scanner.nextLine());

        double sugarPrice = powderPrice - powderPrice * 0.25;
        double eggsPrice = powderPrice + powderPrice * 0.10;
        double maqPrice = sugarPrice - sugarPrice * 0.80;

        double totalPrice = powderPrice * powderQuantity + sugarPrice * sugarQuantity + eggsPrice * eggsQuantity + maqPrice * maqQuantity;

        System.out.printf("%.2f",totalPrice);

    }
}
