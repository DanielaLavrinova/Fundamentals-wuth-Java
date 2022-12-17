package ConditionalStatements;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int actors = Integer.parseInt(scanner.nextLine());
        double priceCustom = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.10;
        double totalPriceCustom = actors * priceCustom;

        if(actors > 150){
            totalPriceCustom = totalPriceCustom - totalPriceCustom * 0.10;
        }

        if(budget < (totalPriceCustom + decor)){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",((totalPriceCustom + decor)- budget));
        }else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",budget - (totalPriceCustom + decor));
        }

    }
}
