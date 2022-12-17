package PBExams;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int actors = Integer.parseInt(scanner.nextLine());
        double costumes = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.10;

        if(actors > 150){

            costumes = costumes - costumes * 0.10;

        }

        double totalPrice = actors * costumes + decor;

        if(totalPrice <= budget){
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",budget - totalPrice);

        }else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",totalPrice - budget);

        }


    }
}
