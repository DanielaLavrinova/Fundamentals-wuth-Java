package ConditionalStatements;

import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());

        double tripPrice = 0;
        double ticketPrice = 0;

        if(people >= 1 && people <= 4){
            tripPrice = budget * 0.75;
        }else if(people >= 5 && people <= 9){
            tripPrice = budget * 0.60;
        }else if(people >= 10 && people <= 24){
            tripPrice = budget * 0.50;
        }else if(people >= 25 && people <= 49){
            tripPrice = budget * 0.40;
        }else {
            tripPrice = budget * 0.25;
        }

        budget = budget - tripPrice;

        switch (category){

            case "Normal":
                ticketPrice = people * 249.99;
                if(budget >= ticketPrice){
                    System.out.printf("Yes! You have %.2f leva left.",budget - ticketPrice);
                }else {
                    System.out.printf("Not enough money! You need %.2f leva.",ticketPrice - budget);
                }
                break;
            case "VIP":
                ticketPrice = people * 499.99;
                if(budget >= ticketPrice){
                    System.out.printf("Yes! You have %.2f leva left.",budget - ticketPrice);
                }else {
                    System.out.printf("Not enough money! You need %.2f leva.",ticketPrice - budget);
                }
                break;
        }

    }
}
