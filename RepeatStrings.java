package textProcessing;

import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordsArray = scanner.nextLine().split(" ");
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < wordsArray.length; i++) {
            String word = wordsArray[i];
            int length = word.length();


            for (int j = 0; j < length; j++) {
                str.append(word);
            }
        }

        System.out.println(str);
    }
}
