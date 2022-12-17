package textProcessing;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder word = new StringBuilder(text);

        for (int i = 0; i < word.length()- 1; i++) {
            char symbol = word.charAt(i);
            char nextSymbol = word.charAt(i + 1);
            if(symbol == nextSymbol){
                word.deleteCharAt(i + 1);
                i --;
            }
        }

        System.out.println(word);
    }
}
