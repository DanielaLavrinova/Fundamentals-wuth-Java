package PBExams;

import java.util.Scanner;

public class EasterDecoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalSum = 0.0;

        int customers = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= customers ; i++) {
            int counter = 0;
            double sum = 0.0;


            String input = scanner.nextLine();

            while(!input.equals("Finish")){

                switch (input){
                    case "basket":
                        sum += 1.50;
                        break;
                    case "wreath":
                        sum += 3.80;
                        break;
                    case "chocolate bunny":
                        sum += 7.00;
                        break;
                }

                counter ++;


                input = scanner.nextLine();

            }

            if(counter % 2 == 0){
                sum = sum - sum * 0.20;
                System.out.printf("You purchased %d items for %.2f leva.%n",counter,sum);

            }else {
                System.out.printf("You purchased %d items for %.2f leva.%n",counter,sum);
            }

            totalSum += sum;

        }

        System.out.printf("Average bill per client is: %.2f leva.",totalSum / customers);

    }
}
