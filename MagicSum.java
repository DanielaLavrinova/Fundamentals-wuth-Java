package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numberArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int magicNumber = Integer.parseInt(scanner.nextLine());


        for (int index = 0; index < numberArray.length - 1  ; index++) {

            for (int i = index + 1; i < numberArray.length ; i++) {
                int sum = 0;
                sum = numberArray[index] + numberArray[i];
                if(sum == magicNumber){
                    System.out.printf("%d %d%n",numberArray[index],numberArray[i]);

                }
            }

        }
    }
}
