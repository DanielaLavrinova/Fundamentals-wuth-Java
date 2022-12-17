package WhileLoop;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int i = 0;
        double sum = 0;

        while (i < n){
            int currentNumber = Integer.parseInt(scanner.nextLine());
            sum += currentNumber;
            i ++;
        }

        System.out.printf("%.2f",sum / n);

    }
}
