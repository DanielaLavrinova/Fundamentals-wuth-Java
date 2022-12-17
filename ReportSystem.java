package WhileLoop;

import java.util.Scanner;

public class ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int expectedMoney = Integer.parseInt(scanner.nextLine());
        double counter = 1;
        double cash = 0;
        double card = 0;
        int countCash = 0;
        int countCard = 0;
        double totalMoney = 0;
        boolean isTrue = false;

        String input = scanner.nextLine();

        while(!input.equals("End")){
            int money = Integer.parseInt(input);
            if(counter % 2 == 1){
                if(money <= 100){
                    System.out.println("Product sold!");
                    cash += money;
                    countCash ++;
                    totalMoney += money;
                }else {
                    System.out.println("Error in transaction!");
                }

            }else {
                if(money >= 10){
                    System.out.println("Product sold!");
                    card += money;
                    countCard ++;
                    totalMoney += money;
                }else{
                    System.out.println("Error in transaction!");
                }
            }

            if(totalMoney >= expectedMoney){
                isTrue = true;
                break;
            }
            counter ++;
            input = scanner.nextLine();

        }

        if(isTrue){
            System.out.printf("Average CS: %.2f%n",(cash / countCash));
            System.out.printf("Average CC: %.2f%n",(card / countCard));
        }else{
            System.out.println("Failed to collect required money for charity.");
        }

    }
}
