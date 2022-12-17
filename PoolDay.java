package PBExams;

import java.util.Scanner;

public class PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        double entrance = Double.parseDouble(scanner.nextLine());
        double sunBed = Double.parseDouble(scanner.nextLine());
        double umbrellaPrice = Double.parseDouble(scanner.nextLine());

        double umbrella = Math.ceil(people * 1.00/ 2);
        double sunbedQuantity = Math.ceil(people * 0.75);

        double totalPrice = people * entrance + umbrellaPrice * umbrella + sunbedQuantity * sunBed;

        System.out.printf("%.2f lv.",totalPrice);

    }
}
