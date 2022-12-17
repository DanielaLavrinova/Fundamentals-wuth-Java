package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int[] numbersArray = new int[number];

        for (int i = 0; i < number ; i++) {
            String name = scanner.nextLine();
            int length = name.length();
            int sum = 0;
            int totalSum = 0;
            char[] lettersArray = name.toCharArray();

            for (int j = 0; j < lettersArray.length; j++) {
                char symbol = lettersArray[j];
                int symbolAscii = 0;
                switch (symbol){
                    case 'a':
                    case 'e':
                    case 'o':
                    case 'i':
                    case 'u':
                    case 'A':
                    case 'E':
                    case 'O':
                    case 'I':
                    case 'U':
                        sum = symbol * length;
                        break;
                    default:
                        sum = symbol / length;
                }
                totalSum += sum;

            }
            numbersArray[i] = totalSum;

        }
        Arrays.sort(numbersArray);

        for (int element:numbersArray) {
            System.out.println(element);
        }
    }
}
