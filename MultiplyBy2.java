package ConditionalStatements;

import java.util.Scanner;

public class MultiplyBy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());

        while (true){
            if (number < 0){
                System.out.print("Negative number!");
                break;
            }
            number = number * 2;
            System.out.printf("Result: %.2f%n",number);
            number = Double.parseDouble(scanner.nextLine());
        }
    }
}
