package NestedLoops;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int primeSum = 0;
        int nonPrimeSum = 0;


        String input = scanner.nextLine();

        while(!input.equals("stop")){
            int currentNum = Integer.parseInt(input);
            boolean flag = true;

            if(currentNum < 0){
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }

            for (int i = 2; i <= currentNum - 1 ; i++) {

                if(currentNum % i == 0){
                    nonPrimeSum += currentNum;
                    flag = false;
                    break;
                }
            }

            if(flag){
                primeSum = primeSum + currentNum;
            }


            input = scanner.nextLine();

        }

        System.out.printf("Sum of all prime numbers is: %d%n",primeSum);
        System.out.printf("Sum of all non prime numbers is: %d",nonPrimeSum);

    }
}
