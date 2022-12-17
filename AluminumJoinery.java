package PBExams;

import java.util.Scanner;

public class AluminumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String deliveryWay = scanner.nextLine();

        double price = 0.0;
        double delivery = 60;
        boolean flag = false;

        if(number < 10){
            System.out.println("Invalid order");
            flag = true;
        }

        switch (type){
            case "90X130":
                price = 110;

                if(number > 30 && number <= 60){
                    price = price - price * 0.05;
                }else if(number > 60){
                    price = price - price * 0.08;
                }
                break;
            case "100X150":
                price = 140;
                if(number > 40 && number <= 80){
                    price = price - price * 0.06;
                }else if(number > 80) {
                    price = price - price * 0.10;
                }
                break;
            case "130X180":
                price = 190;
                if(number > 20 && number <= 50){
                    price = price - price * 0.07;
                }else if(number > 50){
                    price = price - price * 0.12;
                }
                break;
            case "200X300":
                price = 250;
                if(number > 25 && number <= 50){
                    price = price - price * 0.09;
                }else if (number > 50){
                    price = price - price * 0.14;
                }
                break;

        }

        price = price * number;

        if(deliveryWay.equals("With delivery")){
            price += delivery;

        }

        if(number > 99){
            price = price - price * 0.04;
        }

        if(!flag){
            System.out.printf("%.2f BGN",price);
        }

    }
}
