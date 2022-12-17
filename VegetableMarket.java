package FirstStepsInCoding;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceVegetable = Double.parseDouble(scanner.nextLine());
        double priceFruit = Double.parseDouble(scanner.nextLine());
        int quantityVeg = Integer.parseInt(scanner.nextLine());
        int quantityFruit = Integer.parseInt(scanner.nextLine());

        double totalPrice = priceVegetable * quantityVeg + priceFruit * quantityFruit;
        totalPrice = totalPrice / 1.94;
        System.out.printf("%.2f",totalPrice);

    }
}
