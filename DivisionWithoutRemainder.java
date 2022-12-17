package PBExams;

import java.util.Scanner;

public class DivisionWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;

        for (int i = 1; i <= n ; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if(number % 2 == 0){
                counter1 ++;

            }
            if(number % 3 == 0){
                counter2 ++;

            }
            if(number % 4 == 0){
                counter3 ++;

            }

        }

        System.out.printf("%.2f%%%n",(counter1 * 1.00 / n)* 100);
        System.out.printf("%.2f%%%n",(counter2 * 1.00 / n)* 100);
        System.out.printf("%.2f%%%n",(counter3 * 1.00 / n)* 100);
    }
}
