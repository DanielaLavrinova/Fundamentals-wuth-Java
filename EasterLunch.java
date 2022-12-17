package PBExams;

import java.util.Scanner;

public class EasterLunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int easterBread = Integer.parseInt(scanner.nextLine());
        int eggsNum = Integer.parseInt(scanner.nextLine());
        int cookies = Integer.parseInt(scanner.nextLine());

        double sum = easterBread * 3.20 + eggsNum * 4.35 + cookies * 5.40;

        double eggPaint = (eggsNum * 12) * 0.15;

        sum += eggPaint;

        System.out.printf("%.2f",sum);

    }
}
