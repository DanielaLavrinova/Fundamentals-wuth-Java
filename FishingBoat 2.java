import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = scanner.nextInt();
        String season = scanner.next();
        season += scanner.nextLine();
        int fisherman = scanner.nextInt();
        double boatRent = 0.00;

        if ((season.equals("Spring") || season.equals("Summer") || season.equals("Autumn") || season.equals("Winter"))
        && fisherman >= 4 && fisherman <= 18) {

            if (season.equals("Spring")) {
                boatRent = 3000;
                if (fisherman >= 4 && fisherman <= 6) {
                    boatRent -= 3000 * 10 / 100;
                } else if (fisherman > 6 && fisherman <= 11) {
                    boatRent -= 3000 * 15 / 100;
                } else if (fisherman > 11 && fisherman <= 18) {
                    boatRent -= 3000 * 25 / 100;
                }
            } else if (season.equals("Summer") || season.equals("Autumn")) {
                boatRent = 4200;
                if (fisherman >= 4 && fisherman <= 6) {
                    boatRent -= 4200 * 10 / 100;
                } else if (fisherman > 6 && fisherman <= 11) {
                    boatRent -= 4200 * 15 / 100;
                } else if (fisherman > 11 && fisherman <= 18) {
                    boatRent -= 4200 * 25 / 100;
                }
            } else if (season.equals("Winter")) {
                boatRent = 2600;
                if (fisherman >= 4 && fisherman <= 6) {
                    boatRent -= 2600 * 10 / 100;
                } else if (fisherman > 6 && fisherman <= 11) {
                    boatRent -= 2600 * 15 / 100;
                } else if (fisherman > 11 && fisherman <= 18) {
                    boatRent -= 2600 * 25 / 100;
                }
            }

            if (fisherman % 2 == 0 && !(season.equals("Autumn"))) {
                boatRent -= boatRent * 5 / 100;
            }
            //System.out.println(boatRent);
            if (budget >= boatRent && (budget >= 1 && budget <= 8000)) {
                System.out.printf("Yes! You have %.2f leva left.", (budget - boatRent));
            } else if (budget < boatRent && (budget >= 1 && budget <= 8000)) {
                System.out.printf("Not enough money! You need %.2f leva.", (boatRent - budget));
            }
        }
    }
}