package PBExams;

import java.util.Scanner;

public class MobileOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String term = scanner.nextLine();
        String contract = scanner.nextLine();
        String mobileNet = scanner.nextLine();
        int month = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (contract){

            case "Small":
                if(term.equals("one")){
                    price = 9.98;

                }else if(term.equals("two")){
                    price = 8.58;

                }
                break;
            case "Middle":
                if(term.equals("one")){
                    price = 18.99;

                }else if(term.equals("two")){
                    price = 17.09;

                }
                break;
            case "Large":
                if(term.equals("one")){
                    price = 25.98;

                }else if(term.equals("two")){
                    price = 23.59;

                }
                break;
            case "ExtraLarge":
                if(term.equals("one")){
                    price = 35.99;

                }else if(term.equals("two")){
                    price = 31.79;

                }
                break;

        }

        if(mobileNet.equals("yes")) {

            if (price <= 10) {
                price = price + 5.50;
            } else if (price > 10 && price <= 30) {
                price = price + 4.35;

            } else if (price > 30) {
                price = price + 3.85;

            }
        }

            if(term.equals("two")){
                price = price - price * 0.0375;

            }

            price = price * month;

            System.out.printf("%.2f lv.",price);

    }
}
