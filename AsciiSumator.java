package textProcessing;

import java.util.Scanner;

public class AsciiSumator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String last = scanner.nextLine();
        String input = scanner.nextLine();

        char startSymbol = first.charAt(0);
        char endSymbol = last.charAt(0);

        int start = startSymbol;
        int end = endSymbol;

        int sum = 0;


        if (start < end) {
            for (int i = 0; i < input.length(); i++) {
                char symbol = input.charAt(i);
                int number = symbol;

                if (number > start && number < end) {
                    sum += number;
                }

            }

        } else if (end < start) {
            for (int i = 0; i < input.length(); i++) {
                char symbol = input.charAt(i);
                int number = symbol;

                if (number > end && number < start) {
                    sum += number;
                }

            }

        }

        System.out.println(sum);
    }
}
