package FirstStepsInCoding;

import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceMackerel = Double.parseDouble(scanner.nextLine()); // skumriq
        double priceSprat = Double.parseDouble(scanner.nextLine());    // caca
        double quantityPalamud = Double.parseDouble(scanner.nextLine());
        double quantityScad = Double.parseDouble(scanner.nextLine());// safrid
        int quantityClams = Integer.parseInt(scanner.nextLine());  // midi

        double pricePalamud = priceMackerel + priceMackerel * 60/100;
        double priceScad = priceSprat + priceSprat * 80/100;

        double moneyNeeded = quantityPalamud * pricePalamud + quantityScad * priceScad + quantityClams * 7.50;

        System.out.printf("%.2f",moneyNeeded);


    }

}
