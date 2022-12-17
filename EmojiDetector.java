package finalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        Pattern patternEmoji = Pattern.compile("(::|\\*\\*)([A-Z][a-z]{2,})(\\1)");
        Matcher matcherEmoji = patternEmoji.matcher(text);
        Pattern numbersPattern = Pattern.compile("[0-9]");
        Matcher numbersMatcher = numbersPattern.matcher(text);

        long threshold = 1;

        while(numbersMatcher.find()){
            int number = Integer.parseInt(numbersMatcher.group());
            threshold *= number;

        }

        List<String> coolEmoji = new ArrayList<>();

        while(matcherEmoji.find()){
            String emoji = matcherEmoji.group();
            coolEmoji.add(emoji);

        }

        System.out.printf("Cool threshold: %d%n",threshold);
        System.out.printf("%d emojis found in the text. The cool ones are:%n",coolEmoji.size());

        for (int i = 0; i < coolEmoji.size(); i++) {
            String emoji = coolEmoji.get(i);
            int coolness = 0;
            for (int j = 0; j < emoji.length(); j++) {
                char symbol = emoji.charAt(j);
                if(Character.isLetter(symbol)) {
                    coolness += symbol;
                }
            }

            if(coolness >= threshold){

                System.out.printf("%s%n",emoji);

            }

        }

    }
}
