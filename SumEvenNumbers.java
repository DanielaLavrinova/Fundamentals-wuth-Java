package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer :: parseInt)
                .toArray();

        int sum = 0;
        for (int i = 0; i < numbersArray.length ; i++) {
            int element = numbersArray[i];
            if(element % 2 == 0){
                sum += element;
            }

        }

        System.out.println(sum);

    }
}
