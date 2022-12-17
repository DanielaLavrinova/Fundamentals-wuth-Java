package ConditionalStatements;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flower = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double priceRoses = 5.00;
        double priceDahlias = 3.80;
        double priceTulips = 2.80;
        double priceNarcissus = 3.00;
        double priceGladiolus = 2.50;

        double totalPrice = 0;

        switch (flower){

            case "Roses":
                totalPrice = quantity * priceRoses;
                if(quantity > 80){
                  totalPrice = totalPrice -(totalPrice * 0.10);
                }
                break;
            case "Dahlias":
                totalPrice = quantity * priceDahlias;
                if(quantity > 90){
                   totalPrice = totalPrice - (totalPrice * 0.15);
                }
                break;
            case "Tulips":
                totalPrice = quantity * priceTulips;
                if(quantity > 80){
                   totalPrice = totalPrice - (totalPrice * 0.15);
                }
                break;
            case "Narcissus":
                totalPrice = quantity * priceNarcissus;
                if(quantity < 120){
                    totalPrice = totalPrice + (totalPrice * 0.15);
                }
                break;
            case "Gladiolus":
                totalPrice = quantity * priceGladiolus;
                if (quantity < 80){
                    totalPrice = totalPrice + (totalPrice * 0.20);
                }
                break;
        }

        if(budget >= totalPrice){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",quantity,flower,budget - totalPrice);
        }else {
            System.out.printf("Not enough money, you need %.2f leva more.",totalPrice - budget);
        }
    }
}
