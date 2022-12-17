package ForLoop;

import java.util.Scanner;

public class CharacterSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        int length = text.length();

        for (int i = 0; i < length; i++) {
            char symbol = text.charAt(i);
            System.out.println(symbol);
        }

    }
}
