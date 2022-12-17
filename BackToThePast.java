package ForLoop;

import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double heritage = Double.parseDouble(scanner.nextLine());
        int year = Integer.parseInt(scanner.nextLine());
        double money = 0;
        int ivan = 18;

        for (int i = 1800; i <= year ; i++) {

            if (i % 2 == 0) {
                money = money + 12000;
                ivan ++;
            } else {
                money = money + (12000 + 50 * ivan);
                ivan ++;
            }
        }

        double moneyLeft = Math.abs(heritage - money);
        if(heritage >= money){
           System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.",moneyLeft);
        }else {
            System.out.printf("He will need %.2f dollars to survive.",moneyLeft);
        }
    }
}
