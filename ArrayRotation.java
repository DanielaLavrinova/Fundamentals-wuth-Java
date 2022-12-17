package Arrays;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArray = scanner.nextLine().split( " ");

        int rotation = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= rotation ; i++) {
            String firstElement = inputArray[0];

            for (int j = 0; j < inputArray.length - 1; j++) {
                inputArray[j] = inputArray[j + 1];
            }

            inputArray[inputArray.length - 1] = firstElement;

        }

        for (String element:inputArray) {
            System.out.print(element + " ");
        }
    }
}
