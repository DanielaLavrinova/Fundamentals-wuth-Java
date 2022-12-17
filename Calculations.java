package Methods;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        switch (command){
            case "add":
                addNumbers(firstNumber,secondNumber);
                break;
            case "multiply":
                multiplyNumbers(firstNumber,secondNumber);
                break;
            case "subtract":
                subtractNumbers(firstNumber,secondNumber);
                break;
            case "divide":
                divideNumbers(firstNumber,secondNumber);
                break;
        }

    }

    public static void addNumbers(int a,int b){
        int result = a + b;
        System.out.println(result);
    }

    public static void multiplyNumbers(int a,int b){
        int result = a * b;
        System.out.println(result);
    }

    public static void subtractNumbers(int a,int b){
        int result = a - b;
        System.out.println(result);
    }

    public static void divideNumbers(int a,int b){
        int result = a / b;
        System.out.println(result);
    }


}
