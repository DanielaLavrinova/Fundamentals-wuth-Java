package Methods;

import java.util.Scanner;

public class TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        printTribonacci(number);


    }

    public static void printTribonacci(int number){
       int number1 = 0;
       int number2 = 1;
       int number3 = 1;
       int number4 = number3 + number2 + number1;

        for (int i = 1; i <= number ; i++) {
            number1 = number2;
            number2 = number3;
            number3 = number4;
            number4 = number1 + number2 + number3;
            System.out.printf("%d ",number1);

        }

        if(number< 1){
            System.out.println(0);
        }
    }
}
