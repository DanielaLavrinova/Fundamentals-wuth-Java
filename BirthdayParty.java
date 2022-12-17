package PBExams;

import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rent = Double.parseDouble(scanner.nextLine());

        double cakePrice = rent * 0.20;
        double drinks = cakePrice - cakePrice * 0.45;
        double animator = rent / 3;

        double totalPrice = rent + cakePrice + drinks + animator;
        System.out.printf("%.1f",totalPrice);


    }
}
