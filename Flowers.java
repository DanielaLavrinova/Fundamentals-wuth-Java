package ConditionalStatements;

import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hrizantemii = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String day = scanner.nextLine();

        double priceFlower = 0;

        switch (season){

            case "Spring":
            case "Summer":
                priceFlower = hrizantemii * 2.00 + roses * 4.10 + tulips * 2.50;
                break;
            case "Autumn":
            case "Winter":
                priceFlower = hrizantemii * 3.75 + roses * 4.50 + tulips * 4.15;
                break;
        }

        if(day.equals("Y")){
            priceFlower = priceFlower + (priceFlower * 0.15);
        }
        if(tulips > 7 && season.equals("Spring")){
            priceFlower = priceFlower - (priceFlower * 0.05);
        }
        if(roses >= 10 && season.equals("Winter")){
            priceFlower = priceFlower - (priceFlower * 0.10);
        }
        if((tulips + roses + hrizantemii) > 20){
            priceFlower = priceFlower - (priceFlower * 0.20);
        }

        System.out.printf("%.2f",priceFlower + 2);

    }
}
