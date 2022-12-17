package ConditionalStatements;

import java.util.Scanner;

public class SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String gender = scanner.nextLine();
        int students = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());

        double price = 0;
        String sport = "";

        switch (season){

            case "Winter":
                switch (gender){

                    case "girls":
                        sport = "Gymnastics";
                        price = nights * 9.60;
                        break;
                    case "boys":
                        sport = "Judo";
                        price = nights * 9.60;
                        break;
                    case "mixed":
                        sport = "Ski";
                        price = nights * 10.00;
                        break;
                }

                break;
            case "Spring":

                switch (gender){

                    case "girls":
                        sport = "Athletics";
                        price = nights * 7.20;
                        break;
                    case "boys":
                        sport = "Tennis";
                        price = nights * 7.20;
                        break;
                    case "mixed":
                        sport = "Cycling";
                        price = nights * 9.50;
                        break;
                }

                break;
            case "Summer":

                switch (gender){

                    case "girls":
                        sport = "Volleyball";
                        price = nights * 15.00;
                        break;
                    case "boys":
                        sport = "Football";
                        price = nights * 15.00;
                        break;
                    case "mixed":
                        sport = "Swimming";
                        price = nights * 20.00;
                        break;
                }
                break;

        }

        price = price * students;

        if(students >= 10 && students < 20){
            price = price - (price * 0.05);
        }else if(students >= 20 && students < 50){
            price = price - (price * 0.15);
        }else if(students >= 50){
            price = price - (price * 0.50);
        }

        System.out.printf("%s %.2f lv.",sport,price);

    }
}
