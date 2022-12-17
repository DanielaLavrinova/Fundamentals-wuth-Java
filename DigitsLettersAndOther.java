package textProcessing;

import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        StringBuilder strDigit = new StringBuilder();
        StringBuilder strLetter = new StringBuilder();
        StringBuilder strOther = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char symbol = word.charAt(i);

            if(Character.isDigit(symbol)){
                strDigit.append(symbol);
            }else if(Character.isLetter(symbol)){
                strLetter.append(symbol);
            }else{
                strOther.append(symbol);
            }
        }

        System.out.println(strDigit);
        System.out.println(strLetter);
        System.out.println(strOther);
    }
}
