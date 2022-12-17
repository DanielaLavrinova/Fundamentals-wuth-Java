package ConditionalStatements;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        int toysTotal = puzzles + dolls + bears + minions + trucks;

        double totalPrice = puzzles * 2.60 + dolls * 3.0 + bears * 4.10 + minions * 8.20  + trucks * 2;

        if(toysTotal >= 50){
            totalPrice = totalPrice - (totalPrice * 0.25);
        }

        totalPrice = totalPrice - totalPrice * 0.10;

        if(totalPrice >= tripPrice){
            System.out.printf("Yes! %.2f lv left.",totalPrice - tripPrice);
        }else {
            System.out.printf("Not enough money! %.2f lv needed.",tripPrice - totalPrice);
        }
    }
}
