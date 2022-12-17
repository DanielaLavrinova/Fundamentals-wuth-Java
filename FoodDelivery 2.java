package FirstStepsInCoding;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int vegetarianMenu = Integer.parseInt(scanner.nextLine());

        double price = chickenMenu * 10.35 + fishMenu * 12.40+ vegetarianMenu * 8.15;
        double dessertPrice = price * 20 / 100;
        double totalPrice = price + dessertPrice + 2.50;

        System.out.println(totalPrice);

    }
}
