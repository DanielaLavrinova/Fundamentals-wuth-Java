package PBExams;

import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int number = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;

        for (int i = 1; i <= number ; i++) {

            String name = scanner.nextLine();
            double price = Double.parseDouble(scanner.nextLine());

            switch (name){

                case "Thrones":
                    price = price - price * 0.50;
                    break;
                case "Lucifer":
                    price = price - price * 0.40;
                    break;
                case "Protector":
                    price = price - price * 0.30;
                    break;
                case "TotalDrama":
                    price = price - price * 0.20;
                    break;
                case "Area":
                    price = price - price * 0.10;
                    break;

            }

            totalPrice = totalPrice + price;


        }

        if(budget >= totalPrice){
            System.out.printf("You bought all the series and left with %.2f lv.",budget - totalPrice);

        }else {
            System.out.printf("You need %.2f lv. more to buy the series!",totalPrice - budget);

        }



    }

}
