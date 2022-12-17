package PBExams;

import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = scanner.nextDouble();
        int nights = scanner.nextInt();
        double priceNights = scanner.nextDouble();
        int percent = scanner.nextInt();

        if(nights > 7){
            priceNights = priceNights -(priceNights * 0.05);
        }

        double additionalPrice = (budget * percent) / 100;

        double totalPrice = nights * priceNights + additionalPrice;

        if(totalPrice <= budget){
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.",budget - totalPrice);
        }else {
            System.out.printf("%.2f leva needed.",totalPrice - budget);
        }


    }
}
