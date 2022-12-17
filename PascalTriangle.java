package Arrays;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] tempArray =  {1,1};
        for (int i = 1; i <= n; i++) {
            int[] numbersArray = new int[i];

            for (int j = 0; j < numbersArray.length; j++) {
                numbersArray[0] = 1;
                numbersArray[numbersArray.length - 1] = 1;

                for (int k = 1; k < numbersArray.length - 1; k++) {
                    numbersArray[k] = tempArray[k] + tempArray[k - 1];
                }


            }
            tempArray = numbersArray;


            for (int element : numbersArray) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
        }
    }


