package PBExams;

import java.util.Scanner;

public class EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double price = 0;

        String fruit = scanner.nextLine();

        String size = scanner.nextLine();

        int quantity = Integer.parseInt(scanner.nextLine());

        switch (fruit){

            case "Watermelon":
                if(size.equals("small")){
                    price = quantity * (2 * 56);
                }else if(size.equals("big")){
                    price = quantity * (5 * 28.70);
                }
                break;
            case "Mango":
                if(size.equals("small")){
                    price = quantity * (2 * 36.66);
                }else if(size.equals("big")){
                    price = quantity * (5 * 19.60);
                }
                break;
            case "Pineapple":
                if(size.equals("small")){
                    price = quantity * (2 * 42.10);
                }else if(size.equals("big")){
                    price = quantity * (5 * 24.80);
                }
                break;
            case "Raspberry":
                if(size.equals("small")){
                    price = quantity * (2 * 20);
                }else if(size.equals("big")){
                    price = quantity * (5 * 15.20);
                }
                break;

        }

        if(price >= 400 && price <= 1000){
            price = price -(price * 0.15);

        }else if(price > 1000){
            price = price - (price * 0.50);

        }

        System.out.printf("%.2f lv.",price);


    }
}
