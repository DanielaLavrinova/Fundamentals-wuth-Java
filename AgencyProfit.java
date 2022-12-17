package PBExams;

import java.util.Scanner;

public class AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String airlines = scanner.nextLine();
        int adultTickets = Integer.parseInt(scanner.nextLine());
        int kidsTickets = Integer.parseInt(scanner.nextLine());
        double priceAdult = Double.parseDouble(scanner.nextLine());
        double airportTaxes = Double.parseDouble(scanner.nextLine());

        double kidTicket = priceAdult - priceAdult * 0.70;

        int totalTickets = adultTickets + kidsTickets;

        double totalAirport = totalTickets * airportTaxes;

        double totalPrice = adultTickets * priceAdult + kidsTickets * kidTicket + totalAirport;

        double profit = totalPrice * 0.20;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.",airlines,profit);


    }
}
