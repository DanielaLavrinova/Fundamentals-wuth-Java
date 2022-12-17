package ForLoop;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int maxNumber = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());

            if(currentNumber > maxNumber){
                maxNumber = currentNumber;
            }

            sum += currentNumber;

        }

        sum = sum - maxNumber;

        if(maxNumber == sum){
            System.out.printf("Yes%nSum = %d",maxNumber);
        }else {
            System.out.printf("No%nDiff = %d",Math.abs(maxNumber - sum));
        }

    }
}
