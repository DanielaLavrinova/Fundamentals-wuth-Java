package PBExams;

import java.util.Scanner;

public class VetParking {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        int days =Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double totalSum = 0;

        for (int i = 1; i <= days ; i++) {
            double sum = 0;
            for (int j = 1; j <= hours ; j++) {

                if(i % 2 == 0 && j % 2 == 1){
                    sum = sum + 2.50;

                }else if(i % 2 == 1 && j % 2 == 0){
                    sum = sum + 1.25;

                }else {
                    sum = sum + 1;
                }

            }

            System.out.printf("Day: %d - %.2f leva%n",i,sum);

            totalSum += sum;

        }

        System.out.printf("Total: %.2f leva",totalSum);

    }
}
