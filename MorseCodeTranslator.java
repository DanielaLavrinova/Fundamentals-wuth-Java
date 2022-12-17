package textProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MorseCodeTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\|?(?<code>[- .]+)\\|?");
        Matcher matcher = pattern.matcher(input);

        while(matcher.find()){
            String word = matcher.group("code");

            word = getWordFromMorseCode(word);

            System.out.print(word + " ");

        }

    }

    private static String getWordFromMorseCode(String word) {
        String[] wordsArray = word.split(" ");
        StringBuilder morseWord = new StringBuilder();
        for (String letter:wordsArray) {
            String symbol = "";
            switch (letter){
                case ".-":
                    symbol = "A";
                    break;
                case "-...":
                    symbol = "B";
                    break;
                case "-.-.":
                    symbol = "C";
                    break;
                case "-..":
                    symbol = "D";
                    break;
                case ".":
                    symbol = "E";
                    break;
                case "..-.":
                    symbol = "F";
                    break;
                case "--.":
                    symbol = "G";
                    break;
                case "....":
                    symbol = "H";
                    break;
                case "..":
                    symbol = "I";
                    break;
                case ".---":
                    symbol = "J";
                    break;
                case "-.-":
                    symbol = "K";
                    break;
                case ".-..":
                    symbol = "L";
                    break;
                case "--":
                    symbol = "M";
                    break;
                case "-.":
                    symbol = "N";
                    break;
                case "---":
                    symbol = "O";
                    break;
                case ".--.":
                    symbol = "P";
                    break;
                case "--.-":
                    symbol = "Q";
                    break;
                case ".-.":
                    symbol = "R";
                    break;
                case "...":
                    symbol = "S";
                    break;
                case "-":
                    symbol = "T";
                    break;
                case "..-":
                    symbol = "U";
                    break;
                case "...-":
                    symbol = "V";
                    break;
                case ".--":
                    symbol = "W";
                    break;
                case "-..-":
                    symbol = "X";
                    break;
                case "-.--":
                    symbol = "Y";
                    break;
                case "--..":
                    symbol = "Z";
                    break;

            }

            morseWord.append(symbol);

        }
        String toPrint = morseWord.toString();

        return toPrint;
    }
}
