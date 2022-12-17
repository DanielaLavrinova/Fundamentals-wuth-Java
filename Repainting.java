package FirstStepsInCoding;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int naylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double priceNaylon = (naylon + 2) * 1.50;
        double pricePaint = (paint + paint * 10.00 / 100) * 14.50;
        double priceThinner = thinner * 5.00;
        double totalPrice = priceNaylon + pricePaint + priceThinner + 0.40;
        double architectHour = totalPrice * 30 / 100;
        double totalHours = architectHour * hours;

        totalPrice = totalPrice + totalHours;
        System.out.println(totalPrice);

    }
}
