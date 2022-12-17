import java.util.Scanner;

public class GodzilaMovie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = scanner.nextDouble();
        double actors = scanner.nextDouble();
        double costume = scanner.nextDouble();
        double decor = budget * 10/100;

        if ( actors > 150){
            costume = costume - costume * 0.10;
        }

        double totalPrice = actors * costume + decor;

        if (totalPrice > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",(totalPrice - budget));
        }else if( totalPrice <= budget){
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",(budget - totalPrice));
        }
        }

    }

