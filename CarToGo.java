package ConditionalStatements;

import java.util.Scanner;

public class CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String carType = "";
        String carClass = "";
        double price = 0;

        if(budget <= 100){
            carClass = "Economy class";
            if(season.equals("Summer")){
                carType = "Cabrio";
                price = budget * 0.35;
            }else if(season.equals("Winter")){
                carType = "Jeep";
                price = budget * 0.65;
            }
        }else if(budget > 100 && budget <= 500){
            carClass = "Compact class";
            if(season.equals("Summer")){
                carType = "Cabrio";
                price = budget * 0.45;
            }else if(season.equals("Winter")){
                carType = "Jeep";
                price = budget * 0.80;
            }
        }else {
            carClass = "Luxury class";
            carType = "Jeep";
            price = budget * 0.90;
        }

        System.out.printf("%s%n%s - %.2f",carClass,carType,price);

    }
}
