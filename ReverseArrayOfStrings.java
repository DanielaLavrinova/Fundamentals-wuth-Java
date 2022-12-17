package Arrays;

import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] lettersArray = scanner.nextLine().split(" ");

        for (int i = 0; i < lettersArray.length / 2; i++) {

            String oldLetter = lettersArray[i];
            lettersArray[i] = lettersArray[lettersArray.length - 1 - i];
            lettersArray[lettersArray.length - 1 - i] = oldLetter;

        }

        for (int i = 0; i < lettersArray.length ; i++) {
            System.out.print(lettersArray[i] + " ");
        }

    }
}
