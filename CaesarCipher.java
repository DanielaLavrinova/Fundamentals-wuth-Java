package textProcessing;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        StringBuilder word = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);

            symbol = (char)(symbol + 3);
            word.append(symbol);

        }

        System.out.println(word);

    }
}
