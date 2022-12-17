package PBExams;

import java.util.Scanner;

public class TennisEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double racketPrice = Double.parseDouble(scanner.nextLine());
        int racketNumber = Integer.parseInt(scanner.nextLine());
        int trainingShoes = Integer.parseInt(scanner.nextLine());

        double priceTrainingShoes = racketPrice / 6;

        double other = (racketNumber * racketPrice + priceTrainingShoes * trainingShoes) * 0.20;
        double totalPrice = racketNumber * racketPrice + priceTrainingShoes * trainingShoes + other;

        double djokovichPrice = totalPrice / 8;

        System.out.printf("Price to be paid by Djokovic %.0f%n",Math.floor(djokovichPrice));
        System.out.printf("Price to be paid by sponsors %.0f",Math.ceil(totalPrice - djokovichPrice));

    }
}
