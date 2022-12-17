package PBExams;

import java.util.Scanner;

public class FitnessCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double price = 0;

        double money = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();

        if(gender.equals("f")){
            switch(sport){
                case "Gym":
                    price = 35;
                    break;
                case "Boxing":
                case "Pilates":
                    price = 37;
                    break;
                case "Yoga":
                    price = 42;
                    break;
                case "Zumba":
                    price = 31;
                    break;
                case "Dances":
                    price = 53;
                    break;

            }

        }else if(gender.equals("m")){
            switch(sport){
                case "Gym":
                    price = 42;
                    break;
                case "Boxing":
                    price = 41;
                    break;
                case "Yoga":
                    price = 45;
                    break;
                case "Zumba":
                    price = 34;
                    break;
                case "Dances":
                    price = 51;
                    break;
                case "Pilates":
                    price = 39;
                    break;

            }

        }

        if(age <= 19){
            price = price - (price * 0.20);
        }

        if(money >= price){
            System.out.printf("You purchased a 1 month pass for %s.",sport);
        }else {
            System.out.printf("You don't have enough money! You need $%.2f more.",price - money);
        }



    }
}
