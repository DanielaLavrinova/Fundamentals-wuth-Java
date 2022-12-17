package PBExams;

import java.util.Scanner;

public class EasterTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        String dates = scanner.nextLine();

        int days = Integer.parseInt(scanner.nextLine());

        double price = 0.0;

        switch (destination){
            case "France":
                if(dates.equals("21-23")){
                    price = days * 30;

                }else if(dates.equals("24-27")){
                    price = days * 35;

                }else if(dates.equals("28-31")){
                    price = days * 40;

                }
                break;
            case "Italy":
                if(dates.equals("21-23")){
                    price = days * 28;

                }else if(dates.equals("24-27")){
                    price = days * 32;

                }else if(dates.equals("28-31")){
                    price = days * 39;

                }
                break;
            case "Germany":
                if(dates.equals("21-23")){
                    price = days * 32;

                }else if(dates.equals("24-27")){
                    price = days * 37;

                }else if(dates.equals("28-31")){
                    price = days * 43;

                }
                break;
        }

        System.out.printf("Easter trip to %s : %.2f leva.",destination,price);

    }
}
