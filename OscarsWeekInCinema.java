package PBExams;

import java.util.Scanner;

public class OscarsWeekInCinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String typeHaul = scanner.nextLine();
        int tickets = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (name){

            case "A Star Is Born":

                switch (typeHaul){

                    case "normal":
                        price = tickets * 7.50;
                        break;
                    case "luxury":
                        price = tickets * 10.50;
                        break;
                    case "ultra luxury":
                        price = tickets * 13.50;
                        break;

                }
                break;

            case "Bohemian Rhapsody":

                switch (typeHaul){

                    case "normal":
                        price = tickets * 7.35;
                        break;
                    case "luxury":
                        price = tickets * 9.45;
                        break;
                    case "ultra luxury":
                        price = tickets * 12.75;
                        break;

                }
                break;

            case "Green Book":

                switch (typeHaul){

                    case "normal":
                        price = tickets * 8.15;
                        break;
                    case "luxury":
                        price = tickets * 10.25;
                        break;
                    case "ultra luxury":
                        price = tickets * 13.25;
                        break;

                }
                break;

            case "The Favourite":

                switch (typeHaul){

                    case "normal":
                        price = tickets * 8.75;
                        break;
                    case "luxury":
                        price = tickets * 11.55;
                        break;
                    case "ultra luxury":
                        price = tickets * 13.95;
                        break;

                }

                break;

        }

        System.out.printf("%s -> %.2f lv.",name,price);

    }
}
