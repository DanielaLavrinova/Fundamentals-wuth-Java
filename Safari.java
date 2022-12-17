package PBExams;

import java.util.Objects;
import java.util.Scanner;

public class Safari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double petrol = Double.parseDouble(scanner.nextLine());
        String day = scanner.nextLine();

        double pricePetrol = petrol * 2.10;
        double totalPrice = pricePetrol + 100;

        if(day.equals("Saturday")){

            totalPrice = totalPrice - totalPrice * 0.10;

        }else if(day.equals("Sunday")){

            totalPrice = totalPrice - totalPrice * 0.20;

        }

        if(totalPrice <= budget){

            System.out.printf("Safari time! Money left: %.2f lv.", budget - totalPrice);

        }else {

            System.out.printf("Not enough money! Money needed: %.2f lv.", totalPrice - budget);

        }

    }
}
