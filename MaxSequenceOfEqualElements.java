package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int maxSequence = 0;
        int maxIndex = 0;
        int counter = 0;

        for (int i = 0; i < numbersArray.length - 1 ; i++) {
            int currentIndex = numbersArray[i];

            if(currentIndex == numbersArray[i + 1]){
                counter ++;
            }else {
                counter = 0;
            }

            if(counter > maxSequence){
                maxSequence = counter;
                maxIndex = currentIndex;
            }

        }

        for (int i = 0; i <= maxSequence ; i++) {
            System.out.printf("%d ",maxIndex);
        }

    }
}
