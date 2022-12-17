package PBExams;

import java.util.Scanner;

public class MovieStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        double price = 0;
        boolean flag = false;

        while(!input.equals("ACTION")){
            int length = input.length();

            if(length <= 15){

                double actorPrice = Double.parseDouble(scanner.nextLine());
                budget = budget - actorPrice;

            } else if(length > 15){

                price = budget * 0.20;
                budget = budget - price;

            }

            if(budget <= 0){
                flag = true;
                break;
            }

            input = scanner.nextLine();

        }

        if(flag){
            System.out.printf("We need %.2f leva for our actors.",Math.abs(budget));

        }else {

            System.out.printf("We are left with %.2f leva.",budget);

        }


    }
}
