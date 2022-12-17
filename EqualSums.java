package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        

        boolean isFound = false;

        for (int index = 0; index < numbersArr.length ; index++) {
            int currentElement = numbersArr[index];
            int leftSum = 0;
            int rightSum = 0;

            for (int leftIndex = 0; leftIndex < index; leftIndex++) {
                leftSum += numbersArr[leftIndex];
            }
            for (int rightIndex = index + 1; rightIndex < numbersArr.length ; rightIndex++) {
                rightSum += numbersArr[rightIndex];
            }

            if(leftSum == rightSum){
                System.out.println(index);
                isFound = true;
                break;
            }
            
        }

        if(!isFound){
            System.out.println("no");
        }
    }
}
