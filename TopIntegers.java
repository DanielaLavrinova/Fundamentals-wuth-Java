package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();



        for (int i = 0; i < numbers.length ; i++) {
            boolean isFound = false;
            int currentElement = numbers[i];
            for (int j = 1; j < numbers.length - i ; j++) {
                int nextElement = numbers[i + j];
                if(currentElement > nextElement){
                    isFound = true;

                }else {
                    isFound = false;
                    break;
                }
            }
            if(isFound){
                System.out.print(currentElement + " ");
            }

        }
        System.out.print(numbers[numbers.length-1]);
    }
}
