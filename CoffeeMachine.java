package PBExams;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String drink = scanner.nextLine();
        String sugar = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch(drink){

            case "Espresso":

                switch (sugar){

                    case "Without":
                        price = quantity * 0.90;
                        break;
                    case "Normal":
                        price = quantity * 1.00;
                        break;
                    case "Extra":
                        price = quantity * 1.20;
                        break;

                }
                break;
            case "Cappuccino":

                switch (sugar){

                    case "Without":
                        price = quantity * 1.00;
                        break;
                    case "Normal":
                        price = quantity * 1.20;
                        break;
                    case "Extra":
                        price = quantity * 1.60;
                        break;

                }
                break;
            case "Tea":

                switch (sugar){

                    case "Without":
                        price = quantity * 0.50;
                        break;
                    case "Normal":
                        price = quantity * 0.60;
                        break;
                    case "Extra":
                        price = quantity * 0.70;
                        break;

                }
                break;

        }

        if(sugar.equals("Without")){

            price = price - price * 0.35;

        }

        if(drink.equals("Espresso") && quantity >= 5){

            price = price - price * 0.25;

        }

        if(price > 15){

            price = price - price * 0.20;

        }

        System.out.printf("You bought %d cups of %s for %.2f lv.",quantity,drink,price);

    }
}
