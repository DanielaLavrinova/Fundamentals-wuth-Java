package ForLoop;

import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int firstPair = 0;
        int seconPair = 0;
        int maxDiff = Integer.MIN_VALUE;
        int diff = 0;


        for (int i = 1; i <= n ; i++) {
            int firstNum = Integer.parseInt(scanner.nextLine());
            int secondNum = Integer.parseInt(scanner.nextLine());

            if(i * 1.00 % 2 == 1){
                firstPair = firstNum + secondNum;

            }else {
                seconPair = firstNum + secondNum;

            }

            if (i >= 2){
                diff = Math.abs(firstPair - seconPair);
            }

            if (diff > maxDiff){
                maxDiff = diff;
            }

        }
        if (maxDiff == 0){
            System.out.printf("Yes, value=%d%n",firstPair);
        }else {
            System.out.printf("No, maxdiff=%d%n",maxDiff);
        }

    }
}
