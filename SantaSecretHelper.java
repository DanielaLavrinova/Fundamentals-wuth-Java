package regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SantaSecretHelper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());

        List<String> wordsList = new ArrayList<>();

        String message = scanner.nextLine();

        while(!message.equals("end")){
            StringBuilder decryptedWord = new StringBuilder();
            for (int i = 0; i < message.length(); i++) {
                char symbol = message.charAt(i);
                symbol -= key;

                decryptedWord.append(symbol);
            }

            String newWord = decryptedWord.toString();

            wordsList.add(newWord);

            message = scanner.nextLine();

        }

        for (String word:wordsList) {
            Pattern pattern = Pattern.compile("@(?<name>[A-Za-z]+)([^@\\-!:>]+)!(?<behaviour>[G|N])!");
            Matcher matcher = pattern.matcher(word);
            if(matcher.find()){
                String name = matcher.group("name");
                String behaviour = matcher.group("behaviour");

                if(behaviour.equals("G")){
                    System.out.println(name);
                }

            }

        }

    }
}
