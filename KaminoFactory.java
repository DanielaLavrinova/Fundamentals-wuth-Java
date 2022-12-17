package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int bestIndex = 0;
        String bestDna = "";
        int maxSum = 0;
        int bestCounter = 0;
        int bestSample = 0;
        int counterSample = 0;

        while(!input.equals("Clone them!")){
            counterSample ++;
            int[] dnaArray = Arrays
                    .stream(input.split("!+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int firstIndex = 0;
            int sum = 0;
            int counter = 0;
            int maxCounter = 0;


            for (int i = 0; i < dnaArray.length; i++) {
                int element = dnaArray[i];
                if(element == 1){
                    counter ++;
                    sum += element;

                }
                if(counter > maxCounter){
                    maxCounter = counter;
                    firstIndex = i - counter + 1;
                }
                if(element == 0){
                    counter = 0;
                }

            }


            if(maxCounter > bestCounter){
                bestCounter = maxCounter;
                bestIndex = firstIndex;
                bestDna = input;
                maxSum = sum;
                bestSample = counterSample;
            }else if(maxCounter == bestCounter){
                if(firstIndex < bestIndex){
                    bestIndex = firstIndex;
                    bestDna = input;
                    maxSum = sum;
                    bestSample = counterSample;
                }else if(firstIndex == bestIndex){
                    if(sum > maxSum){
                        maxSum = sum;
                        bestIndex = firstIndex;
                        bestDna = input;
                        bestSample = counterSample;
                    }
                }

                if(sum == 0){
                    bestDna = input;
                    bestSample = 1;
                }

            }


            input = scanner.nextLine();

        }

        System.out.printf("Best DNA sample %d with sum: %d.%n",bestSample,maxSum);
        String[] printArray = bestDna.split("!+");
        for (String element:printArray) {
            System.out.print(element + " ");
        }

    }
}
