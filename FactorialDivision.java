package Methods;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        long fFactorial = getFactorial(firstNumber);
        long sFactorial = getFactorial(secondNumber);
        double result = fFactorial * 1.0 / sFactorial;
        System.out.printf("%.2f",result);


    }

    public static long getFactorial(int number){
        long factorial = 1;
        for (int i = 1; i <= number ; i++) {
            factorial *= i;
        }

        return  factorial;

    }
}
