package textProcessing;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String first = input.split("\\s+")[0];
        String second = input.split("\\s+")[1];

        int result = multiplierMethod(first,second);

        System.out.println(result);
    }

    private static int multiplierMethod(String first, String second) {
        int firstLength = first.length();
        int secondLength = second.length();
        int result = 0;

        if(firstLength > secondLength){
            for (int i = 0; i < secondLength; i++) {
                int numFirst = (int) first.charAt(i);
                int numSecond = (int) second.charAt(i);

                int number = numFirst * numSecond;

                result += number;

            }

            for (int i = secondLength; i < firstLength; i++) {
                int addNumber = (int) first.charAt(i);

                result += addNumber;
            }


        }else if(secondLength > firstLength){
            for (int i = 0; i < firstLength; i++) {
                int numFirst = (int) first.charAt(i);
                int numSecond = (int) second.charAt(i);

                int number = numFirst * numSecond;

                result += number;

            }

            for (int i = firstLength; i < secondLength; i++) {
                int addNumber = (int)second.charAt(i);

                result += addNumber;
            }

        }else {
            for (int i = 0; i < secondLength; i++) {
                int numFirst = (int) first.charAt(i);
                int numSecond = (int) second.charAt(i);

                int number = numFirst * numSecond;

                result += number;

            }

        }

        return result;
    }
}
