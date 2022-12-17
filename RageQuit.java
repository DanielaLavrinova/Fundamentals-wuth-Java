package regex;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RageQuit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        Pattern pattern = Pattern.compile("(?<letters>[a-zA-Z `~!@#$%^&*()\\\\\\[\\]+={}\\/|:;\\\"\\'<>,.?\\-_]+)(?<numbers>[0-9]+)");
        Matcher matcher = pattern.matcher(text);
        StringBuilder wordsToPrint = new StringBuilder();
        Map<Character,Integer> uniqueSymbol = new HashMap<>();

        while(matcher.find()){
            String word = matcher.group("letters");
            int number = Integer.parseInt(matcher.group("numbers"));
            String upperWord = word.toUpperCase();


            for (int i = 0; i < upperWord.length(); i++) {
                char symbol = upperWord.charAt(i);
                uniqueSymbol.putIfAbsent(symbol,number);

            }

            for (int i = 0; i < number; i++) {

                wordsToPrint.append(upperWord);

            }


        }

        int uniqueCount = uniqueSymbol.size();

        System.out.printf("Unique symbols used: %d%n",uniqueCount);


        String toPrint = wordsToPrint.toString();
        System.out.println(toPrint);
    }
}
