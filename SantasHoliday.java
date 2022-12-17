package PBExams;

import java.util.Scanner;

public class SantasHoliday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String score = scanner.nextLine();

        int nights = days - 1;
        double price = 0.0;

        if(days < 10){
            switch (room){
                case "room for one person":
                    price = nights * 18;
                    break;
                case "apartment":
                    price = nights * 25;
                    price = price - (price * 0.30);
                    break;
                case "president apartment":
                    price = nights * 35;
                    price = price - (price * 0.10);
                    break;

            }

        }else if(days <= 15){
            switch (room){
                case "room for one person":
                    price = nights * 18;
                    break;
                case "apartment":
                    price = nights * 25;
                    price = price - (price * 0.35);
                    break;
                case "president apartment":
                    price = nights * 35;
                    price = price - (price * 0.15);
                    break;

            }


        }else if(days > 15){
            switch (room){
                case "room for one person":
                    price = nights * 18;
                    break;
                case "apartment":
                    price = nights * 25;
                    price = price - (price * 0.50);
                    break;
                case "president apartment":
                    price = nights * 35;
                    price = price - (price * 0.20);
                    break;

            }
        }

        if(score.equals("positive")){
            price = price + (price * 0.25);

        }else if(score.equals("negative")){
            price = price - (price * 0.10);

        }
        System.out.printf("%.2f",price);

    }
}
