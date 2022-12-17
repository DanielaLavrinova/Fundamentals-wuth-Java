package PBExams;

import java.util.Scanner;

public class ChristmasPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int paper = Integer.parseInt(scanner.nextLine());
        int cloth = Integer.parseInt(scanner.nextLine());
        double glue = Double.parseDouble(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double price = paper * 5.80 + cloth * 7.20 + glue * 1.20;
        double totalPrice = price - (price * discount)/ 100;

        System.out.printf("%.3f",totalPrice);
    }
}
