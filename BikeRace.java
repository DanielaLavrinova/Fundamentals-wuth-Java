package ConditionalStatements;

import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juniors = Integer.parseInt(scanner.nextLine());
        int seniors = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();

        double totalMoney = 0;

        switch(type){

            case "trail":
                totalMoney = juniors * 5.50 + seniors * 7.00;
                break;
            case "cross-country":
                totalMoney = juniors * 8.00 + seniors * 9.50;
                if((juniors + seniors) >= 50){
                    totalMoney = totalMoney - (totalMoney * 0.25);
                }
                break;
            case "downhill":
                totalMoney = juniors * 12.25 + seniors * 13.75;
                break;
            case "road":
                totalMoney = juniors * 20.00 + seniors * 21.50;
                break;
        }

        totalMoney = totalMoney - (totalMoney * 0.05);

        System.out.printf("%.2f",totalMoney);
    }
}
