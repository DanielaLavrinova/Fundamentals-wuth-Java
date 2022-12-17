package textProcessing;

import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] dataArray = input.split("\\s+");

        double totalSum = 0;

        for (String word:dataArray) {

            double number = numberOfWord(word);

            totalSum += number;

        }

        System.out.printf("%.2f",totalSum);
    }

    private static double numberOfWord(String word) {

        char firstLetter = word.charAt(0);
        char secondLetter = word.charAt(word.length() - 1);

        StringBuilder numberString = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char symbol = word.charAt(i);

            if(Character.isDigit(symbol)){
                numberString.append(symbol);
            }
        }

        double number = Double.parseDouble(String.valueOf(numberString));

        if(Character.isUpperCase(firstLetter)){
            int positionUpper = firstLetter - 64;
            number = number / positionUpper;

        }else{
            int positionLower = firstLetter - 96;
            number = number * positionLower;
        }

        if(Character.isUpperCase(secondLetter)){
            int positionUpper = secondLetter - 64;
            number = number - positionUpper;

        }else{
            int positionLower = secondLetter - 96;
            number = number + positionLower;
        }

        return number;
    }
}
