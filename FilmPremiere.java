package PBExams;

import java.util.Scanner;

public class FilmPremiere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String menu = scanner.nextLine();
        int tickets = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch (name){

            case "John Wick":
                switch (menu){

                    case "Drink":
                        price = tickets * 12;
                        break;
                    case "Popcorn":
                        price = tickets * 15;
                        break;
                    case "Menu":
                        price = tickets * 19;
                        break;

                }
                break;
            case "Star Wars":
                switch (menu){

                    case "Drink":
                        price = tickets * 18;
                        break;
                    case "Popcorn":
                        price = tickets * 25;
                        break;
                    case "Menu":
                        price = tickets * 30;
                        break;

                }
                break;
            case "Jumanji":
                switch (menu){

                    case "Drink":
                        price = tickets * 9;
                        break;
                    case "Popcorn":
                        price = tickets * 11;
                        break;
                    case "Menu":
                        price = tickets * 14;
                        break;

                }
                break;

        }

        if(name.equals("Star Wars") && tickets >= 4){

            price = price - (price * 0.30);

        }else if (name.equals("Jumanji") && tickets == 2){

            price = price - (price * 0.15);

        }

        System.out.printf("Your bill is %.2f leva.",price);


    }
}
