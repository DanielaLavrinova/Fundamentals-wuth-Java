package PBExams;

import java.util.Scanner;

public class WeddingSeats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sector = scanner.nextLine();

        char end = sector.charAt(0);
        int length = sector.length();

        int firstRow = Integer.parseInt(scanner.nextLine());
        int seatsOdd = Integer.parseInt(scanner.nextLine());


        int rowsLength = firstRow + length ;


        for (char symbol = 'A'; symbol <= end ; symbol++) {
            for (int i = 1; i <= rowsLength; i++) {

                    System.out.printf("%S%d%n",symbol,i);

            }

        }

    }
}
