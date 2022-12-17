package MidExam;

import java.util.Scanner;

public class BurgerBus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbersCities = Integer.parseInt(scanner.nextLine());


        double money = 0;

        for (int i = 1; i <= numbersCities ; i++) {
            double additionalExpenses = 0;
            double additionalEarned = 0;
            String name = scanner.nextLine();
            double earnedMoney = Double.parseDouble(scanner.nextLine());
            double expenses = Double.parseDouble(scanner.nextLine());

            if(i % 3 == 0 && i % 5 == 0){
                additionalEarned = earnedMoney * 0.10;
            }else if(i % 3 == 0){

                additionalExpenses = expenses * 0.5;
            }else if(i % 5 == 0){

                additionalEarned = earnedMoney * 0.10;
            }

            double totalMoney = earnedMoney - (expenses + additionalExpenses + additionalEarned);

            money += totalMoney;




            System.out.printf("In %s Burger Bus earned %.2f leva.%n",name,totalMoney);


        }

        System.out.printf("Burger Bus total profit: %.2f leva.",money);
    }

}
