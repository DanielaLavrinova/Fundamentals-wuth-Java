package PBExams;

import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double strawberryPrice = Double.parseDouble(scanner.nextLine());
        double bananas = Double.parseDouble(scanner.nextLine());
        double orange = Double.parseDouble(scanner.nextLine());
        double blueBerries = Double.parseDouble(scanner.nextLine());
        double strawberries = Double.parseDouble(scanner.nextLine());

        double blueBerriesPrice = strawberryPrice / 2;
        double orangePrice = blueBerriesPrice - blueBerriesPrice * 0.40;
        double bananasPrice = blueBerriesPrice - blueBerriesPrice * 0.80;

        double totalPrice = strawberryPrice * strawberries + bananasPrice * bananas + orangePrice * orange + blueBerriesPrice * blueBerries;
        System.out.printf("%.2f",totalPrice);


    }

}
