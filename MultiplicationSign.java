package Methods;

import java.util.Scanner;

public class MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        isMultiplicationPositiveOrNegative(firstNumber,secondNumber,thirdNumber);

    }

    public static void isMultiplicationPositiveOrNegative(int fNumber,int sNumber,int tNumber) {
        int counter = 0;
        if (fNumber < 0) {
            counter++;
        }
        if (sNumber < 0) {
            counter++;
        }
        if (tNumber < 0) {
            counter++;
        }
        if(fNumber == 0 || sNumber == 0 || tNumber == 0){
            System.out.println("zero");
        }else if (counter % 2 == 1) {
            System.out.println("negative");
        }else {
            System.out.println("positive");
        }

    }

}

