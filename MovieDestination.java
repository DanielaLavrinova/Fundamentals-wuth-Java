package PBExams;

import java.util.Scanner;

public class MovieDestination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String place = scanner.nextLine();
        String season = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch (season){

            case "Summer":
                switch (place){
                    case "Dubai":
                        price = days * 40000;
                        break;
                    case "Sofia":
                        price = days * 12500;
                        break;
                    case "London":
                        price = days * 20250;
                        break;
                }

                break;
            case "Winter":

                switch (place){
                    case "Dubai":
                        price = days * 45000;
                        break;
                    case "Sofia":
                        price = days * 17000;
                        break;
                    case "London":
                        price = days * 24000;
                        break;
                }

        }

        if(place.equals("Dubai")){

            price = price - price * 0.30;

        }else if(place.equals("Sofia")){

            price = price + price * 0.25;

        }

        if(price <= budget){

            System.out.printf("The budget for the movie is enough! We have %.2f leva left!",budget - price);

        }else{

            System.out.printf("The director needs %.2f leva more!",price - budget);

        }

    }
}
