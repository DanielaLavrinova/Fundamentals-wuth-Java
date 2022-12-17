package PBExams;

import java.util.Scanner;

public class Club {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double profit = Double.parseDouble(scanner.nextLine());
        String name = scanner.nextLine();

        double totalPrice = 0;
        boolean flag = false;

        while (!name.equals("Party!")){
            double priceCoctail = 0;
            int quantity = Integer.parseInt(scanner.nextLine());
            int length = name.length();

            priceCoctail = quantity * length;

            if(priceCoctail % 2 == 1){

                priceCoctail = priceCoctail - priceCoctail * 0.25;

            }

            totalPrice = totalPrice + priceCoctail;

            if(totalPrice >= profit){
                flag = true;
                break;

            }

            name = scanner.nextLine();

        }

        if(flag){

            System.out.println("Target acquired.");

        }else {

            System.out.printf("We need %.2f leva more.%n",profit - totalPrice);

        }

        System.out.printf("Club income - %.2f leva.",totalPrice);

    }

}
