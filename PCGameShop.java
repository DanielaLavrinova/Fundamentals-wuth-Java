package PBExams;

import java.util.Scanner;

public class PCGameShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int counterH = 0;
        int counterF = 0;
        int counterO = 0;
        int counter = 0;

        for (int i = 1; i <= number ; i++) {
            String name = scanner.nextLine();

            switch (name){

                case "Hearthstone":
                    counterH ++;
                    break;
                case "Fornite":
                    counterF ++;
                    break;
                case "Overwatch":
                    counterO ++;
                    break;
                default:
                    counter ++;

            }

        }

        System.out.printf("Hearthstone - %.2f%%%n",(counterH * 1.00/ number)* 100);
        System.out.printf("Fornite - %.2f%%%n",(counterF * 1.00/ number)* 100);
        System.out.printf("Overwatch - %.2f%%%n",(counterO * 1.00/ number)* 100);
        System.out.printf("Others - %.2f%%%n",(counter * 1.00/ number)* 100);

    }
}
