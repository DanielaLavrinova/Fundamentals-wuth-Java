package regex;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PostOffice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dataArray = scanner.nextLine().split("\\|");

        String firstMessage = dataArray[0];
        String secondMessage = dataArray[1];
        String thirdMessage = dataArray[2];


        Pattern capitalLetterPattern = Pattern.compile("([$#%*&])(?<word>[A-Z]+)(\\1)");
        Matcher letterMatcher = capitalLetterPattern.matcher(firstMessage);
        String capitalWord = "";

        if(letterMatcher.find()){
             capitalWord = letterMatcher.group("word");

        }

        char[] capitalLetters = capitalWord.toCharArray();

        Pattern lengthWord = Pattern.compile("(?<ascii>[6-9][0-9]):(?<length>[0-9]{2})");
        Matcher lengthMatcher = lengthWord.matcher(secondMessage);
        Map<Character,Integer> ascciWordsMap = new LinkedHashMap<>();

        while(lengthMatcher.find()){

            int letter = Integer.parseInt(lengthMatcher.group("ascii"));
            String length = lengthMatcher.group("length");
            char symbol = (char) letter;
            char zero = length.charAt(0);
            int lengthOfWord = 0;
            if(zero == 0){
                char number = length.charAt(1);
                lengthOfWord = number;
            }else{
                lengthOfWord = Integer.parseInt(length);
            }

            for (int i = 0; i < capitalLetters.length; i++) {
                if(symbol == capitalLetters[i]){
                    ascciWordsMap.putIfAbsent(symbol,lengthOfWord);
                }
            }

        }

        Pattern thirdPart = Pattern.compile("\\b[A-Z]\\S*\\b");
        Matcher thirdMatcher = thirdPart.matcher(thirdMessage);

        List<String> matchingWordsList = new ArrayList<>();

        while(thirdMatcher.find()){
            String wordToAdd = thirdMatcher.group();
            matchingWordsList.add(wordToAdd);
        }

        for (String wordEntry:matchingWordsList) {
            char symbol = wordEntry.charAt(0);
            int length = wordEntry.length();

            for (Map.Entry<Character, Integer> entry : ascciWordsMap.entrySet()) {
                if(entry.getKey() == symbol && entry.getValue() + 1 == length){
                    System.out.println(wordEntry);
                }

            }

        }

    }
}
