package PBExams;

import java.util.Scanner;

public class MovieProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int days = Integer.parseInt(scanner.nextLine());
        int tickets = Integer.parseInt(scanner.nextLine());
        double priceTicket = Double.parseDouble(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        double price = (priceTicket * tickets) * days;
        double sumPercent = (price * percent)/ 100;

        price -= sumPercent;

        System.out.printf("The profit from the movie %s is %.2f lv.",name,price);


    }

}
