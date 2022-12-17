package PBExams;

import java.util.Scanner;

public class TouristShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget  = Double.parseDouble(scanner.nextLine());
        String name = scanner.nextLine();
        double totalSum = 0;
        int counter = 0;
        boolean flag = false;

        while(!name.equals("Stop")){
            counter ++;
            double price = Double.parseDouble(scanner.nextLine());

            if(price > budget){
                System.out.println("You don't have enough money!");
                System.out.printf("You need %.2f leva!",totalSum - budget);
                flag = true;
                break;

            }


            if(counter % 3 == 0){

                price = price / 2;

            }



            totalSum += price;

            if(totalSum > budget ){
                System.out.println("You don't have enough money!");
                System.out.printf("You need %.2f leva!",totalSum - budget);
                flag = true;
                break;

            }

            name = scanner.nextLine();

        }

        if(!flag){
            System.out.printf("You bought %d products for %.2f leva.",counter,totalSum);
        }
    }
}
