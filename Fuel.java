package FirstStepsInCoding;

import java.util.Scanner;

public class Fuel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuelName = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        String clubCard = scanner.nextLine();

        double fuelPrice = 0;

        if (fuelName.equals("Gas")) {
            if (clubCard.equals("Yes")) {
                fuelPrice = quantity *(0.93 -0.08);
            } else {
                fuelPrice = quantity * 0.93;
            }

            if (quantity >= 20 && quantity <= 25) {
                fuelPrice = fuelPrice - fuelPrice * 8 / 100;
            } else if (quantity > 25) {
                fuelPrice = fuelPrice - fuelPrice * 10/100;
            }

        } else if (fuelName.equals("Gasoline")) {
            if (clubCard.equals("Yes")) {
                fuelPrice = quantity * (2.22 -0.18);
            } else {
                fuelPrice = quantity * 2.22;
            }

            if (quantity >= 20 && quantity <= 25) {
                fuelPrice = fuelPrice - fuelPrice * 8 / 100;
            } else if (quantity > 25) {
                fuelPrice = fuelPrice - fuelPrice * 10/100;
            }

        }else if (fuelName.equals("Diesel")) {
            if (clubCard.equals("Yes")) {
                fuelPrice = quantity * (2.33-0.12);
            } else {
                fuelPrice = quantity * 2.33;
            }

            if (quantity >= 20 && quantity <= 25) {
                fuelPrice = fuelPrice - fuelPrice * 8 / 100;
            } else if (quantity > 25) {
                fuelPrice = fuelPrice - fuelPrice * 10/100;
            }

        }
        System.out.printf("%.2f lv.",fuelPrice);
    }
}
