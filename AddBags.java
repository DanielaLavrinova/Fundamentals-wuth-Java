package PBExams;

import java.util.Scanner;

public class AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceLuggage = Double.parseDouble(scanner.nextLine());
        double weightLuggage = Double.parseDouble(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int quantityLuggage = Integer.parseInt(scanner.nextLine());

        double price = 0.0;



        if(weightLuggage < 10){
            price = priceLuggage * 0.20;

        }else if(weightLuggage <= 20){
            price = priceLuggage * 0.50;

        }else if(weightLuggage > 20){
            price = priceLuggage;

        }

        if(days < 7){
            price = price + price * 0.40;

        }else if(days <= 30){
            price = price + price * 0.15;

        }else {
            price = price + price * 0.10;

        }

        System.out.printf("The total price of bags is: %.2f lv.",price * quantityLuggage);


    }
}
