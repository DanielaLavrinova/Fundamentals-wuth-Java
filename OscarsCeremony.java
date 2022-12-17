package PBExams;

import java.util.Scanner;

public class OscarsCeremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rent = Integer.parseInt(scanner.nextLine());
        double figures = rent - rent * 0.30;
        double catering = figures - figures * 0.15;
        double music= catering / 2;

        double sum = rent + figures + catering + music;

        System.out.printf("%.2f",sum);


    }
}
