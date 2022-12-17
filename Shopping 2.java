package ConditionalStatements;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ramMemory = Integer.parseInt(scanner.nextLine());

        double videoCardsPrice = videoCards * 250.00;
        double processorsPrice = videoCardsPrice * 0.35;
        double ramMemoryPrice =  videoCardsPrice * 0.10;

        double totalPrice = videoCardsPrice + processorsPrice * processors + ramMemoryPrice * ramMemory;

        if(videoCards > processors){
            totalPrice = totalPrice - totalPrice * 0.15;
        }

        if(totalPrice > budget){
            System.out.printf("Not enough money! You need %.2f leva more!",totalPrice - budget);
        }else {
            System.out.printf("You have %.2f leva left!",budget - totalPrice);
        }

    }
}
