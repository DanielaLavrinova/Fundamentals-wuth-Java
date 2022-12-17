package ConditionalStatements;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double moneySpend = 0;
        String nights = "";
        String place = "";

        if(budget <= 100){
            place = "Bulgaria";
            switch (season){
                case "summer":
                    moneySpend = budget * 0.30;
                    nights = "Camp";
                    break;
                case "winter":
                    moneySpend = budget * 0.70;
                    nights = "Hotel";
                    break;
            }

        }else if(budget <= 1000){
            place = "Balkans";
            switch (season){
                case "summer":
                    moneySpend = budget * 0.40;
                    nights = "Camp";
                    break;
                case "winter":
                    moneySpend = budget * 0.80;
                    nights = "Hotel";
                    break;
            }

        }else {
            place = "Europe";
            nights = "Hotel";
            moneySpend = budget * 0.90;
        }

        System.out.printf("Somewhere in %s%n",place);
        System.out.printf("%s - %.2f",nights,moneySpend);
    }
}
