package PBExams;

import java.util.Scanner;

public class EasterParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guests = Integer.parseInt(scanner.nextLine());
        double pricePerson = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double priceCake = budget * 0.10;

        if(guests >= 10 && guests <= 15){
            pricePerson = pricePerson - pricePerson * 0.15;

        }else if(guests > 15 && guests <= 20){
            pricePerson = pricePerson - pricePerson * 0.20;

        }else if(guests > 20){
            pricePerson = pricePerson - pricePerson * 0.25;

        }

        double totalPrice = guests * pricePerson + priceCake;

        if(totalPrice <= budget){
            System.out.printf("It is party time! %.2f leva left.",budget - totalPrice);
        }else {
            System.out.printf("No party! %.2f leva needed.",totalPrice - budget);
        }

    }
}
