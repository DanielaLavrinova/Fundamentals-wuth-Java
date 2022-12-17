package Methods;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int result = getMultiplyOfEvenAndOdd(number);
        System.out.println(Math.abs(result));


    }

    public static int getMultiplyOfEvenAndOdd(int number){
        int sumEven = sumOfEven(number);
        int sumEOdd = sumOfOdd(number);

        return  sumEOdd * sumEven;


    }

    public static int sumOfEven(int number){
        int positiveNum = Math.abs(number);
        int sumEven = 0;
        while(positiveNum > 0){
            int digit = positiveNum % 10;

            if(digit % 2 == 0){
                sumEven += digit;
            }

            positiveNum /= 10;
        }

        return sumEven;
    }

    public static int sumOfOdd(int number){
        int positiveNum = Math.abs(number);
        int sumOdd = 0;
        while(positiveNum > 0){
            int digit = positiveNum % 10;

            if(digit % 2 != 0){
                sumOdd += digit;
            }

            positiveNum /= 10;
        }

        return sumOdd;
    }
}
