package PBExams;

import java.util.Scanner;

public class ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitcoin = Integer.parseInt(scanner.nextLine());
        double chinesCoin = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());

        double totalBitcoins = bitcoin * 1168;
        double totalChines = (chinesCoin * 1.76) * 0.15;

        double totalMoney = (totalBitcoins + totalChines) / 1.95;
        commission = (totalMoney * commission) / 100;



        System.out.printf("%.2f",totalMoney - commission);


    }
}
