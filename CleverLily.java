package ForLoop;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceWashingMachine = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        int toysCounter = 0;
        int brother = 0;
        double money = 0;
        double totalMoney = 0;

        for (int i = 1; i <= age ; i++) {

            if (i % 2 == 0){
                money += 10;
                totalMoney += money;
                brother++;

            }else {
                toysCounter ++;
            }

        }

        double moneySaved = (totalMoney - brother) + toysCounter * toyPrice;

        if(moneySaved >= priceWashingMachine){
            System.out.printf("Yes! %.2f",moneySaved - priceWashingMachine);
        }else {
            System.out.printf("No! %.2f",priceWashingMachine - moneySaved);
        }

    }
}
