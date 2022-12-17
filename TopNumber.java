package Methods;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number ; i++) {

            if(isDivisibleBy8(i) && consistOddDigit(i)){
                System.out.println(i);
            }

        }


    }

    public static boolean isDivisibleBy8(int number){
        int sum = 0;

        while (number > 0 ){
            int digit = number % 10;

            sum += digit;

            number /= 10;

        }

        return sum % 8 == 0;

    }

    public static boolean consistOddDigit(int number){

        while(number > 0){
            int digit = number % 10;
            if(digit % 2 != 0){
                return true;
            }

            number /= 10;

        }

        return false;
    }

}
