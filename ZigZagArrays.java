package Arrays;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] firstArr = new int[n];
        int[] secondArr = new int[n];

        for (int row = 1; row <= n ; row ++) {
            String input = scanner.nextLine();
            int firstNum = Integer.parseInt(input.split( " ")[0]);
            int secondNum = Integer.parseInt(input.split( " ")[1]);

            if(row % 2 == 0){
                secondArr[row - 1] = firstNum;
                firstArr[row - 1] = secondNum;

            }else {
                secondArr[row - 1] = secondNum;
                firstArr[row - 1] = firstNum;

            }
        }

        for (int element:firstArr) {
            System.out.print(element + " ");
        }

        System.out.println();

        for (int element:secondArr) {
            System.out.print(element + " ");
        }
    }
}
