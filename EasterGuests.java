package PBExams;

import java.util.Scanner;

public class EasterGuests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guests = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double easterBread = Math.ceil(guests * 1.00 / 3);
        double priceEasterBread = easterBread * 4;

        int eggsNum = guests * 2;
        double eggsPrice = eggsNum * 0.45;

        double totalPrice = priceEasterBread + eggsPrice;

        if(totalPrice <= budget){
            System.out.printf("Lyubo bought %.0f Easter bread and %d eggs.%n",easterBread,eggsNum);
            System.out.printf("He has %.2f lv. left.%n",budget - totalPrice);
        }else {
            System.out.println("Lyubo doesn't have enough money.");
            System.out.printf("He needs %.2f lv. more.",totalPrice - budget);
        }

    }
}
