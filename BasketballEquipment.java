package FirstStepsInCoding;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int annualCard = Integer.parseInt(scanner.nextLine());

        double shoes = annualCard - annualCard * 40 / 100.00;
        double cloths = shoes - shoes * 20/100;
        double ball = cloths / 4;
        double accessory = ball / 5;
        double totalPrice = annualCard + shoes + cloths + ball + accessory;

        System.out.println(totalPrice);

    }
}
