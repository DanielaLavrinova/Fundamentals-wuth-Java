package PBExams;

import java.util.Scanner;

public class WorldSnookerChampionship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double price = 0.0;

        String stage = scanner.nextLine();
        String ticket = scanner.nextLine();
        int numbersTicket = Integer.parseInt(scanner.nextLine());
        String picture = scanner.nextLine();

        switch (stage){
            case "Quarter final":

                switch (ticket){

                    case "Standard":
                        price = numbersTicket * 55.50;
                        break;
                    case "Premium":
                        price = numbersTicket * 105.20;
                        break;
                    case "VIP":
                        price = numbersTicket * 118.90;
                        break;

                }
                break;

            case "Semi final":

                switch (ticket){

                    case "Standard":
                        price = numbersTicket * 75.88;
                        break;
                    case "Premium":
                        price = numbersTicket * 125.22;
                        break;
                    case "VIP":
                        price = numbersTicket * 300.40;
                        break;

                }
                break;

            case "Final":

                switch (ticket){

                    case "Standard":
                        price = numbersTicket * 110.10;
                        break;
                    case "Premium":
                        price = numbersTicket * 160.66;
                        break;
                    case "VIP":
                        price = numbersTicket * 400;
                        break;

                }
                break;

        }

        if(picture.equals("Y") && price <= 2500){

            price = price + numbersTicket * 40;

        }


        if(price > 2500 && price <= 4000){
            price = price - price * 0.10;
            if(picture.equals("Y")){
                price = price + numbersTicket * 40;
            }
        }else if(price > 4000){
            price = price - price * 0.25;
        }


        System.out.printf("%.2f",price);


    }
}
