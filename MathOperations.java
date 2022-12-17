package Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNumber = Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();
        double secondNumber = Double.parseDouble(scanner.nextLine());

        double result = result(firstNumber,operator,secondNumber);
        DecimalFormat df = new DecimalFormat("0.##");

        System.out.println(df.format(result));


    }


    public static double result(double fNumber,String operator,double sNumber){
        double result = 0;

        switch (operator){
            case "/":
                result = fNumber / sNumber;
                break;
            case "+":
                result = fNumber + sNumber;
                break;
            case "-":
                result = fNumber - sNumber;
                break;
            case "*":
                result = fNumber * sNumber;
                break;
        }

        return  result;

    }

}
