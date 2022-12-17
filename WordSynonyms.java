package mapsLabdaStreamAPI;

import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, List<String>> wordsMap = new LinkedHashMap<>();

        for (int i = 1; i <= number ; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            if(!wordsMap.containsKey(word)){
                wordsMap.put(word,new ArrayList<>());
            }

            wordsMap.get(word).add(synonym);

        }

        for (Map.Entry<String, List<String>> entry : wordsMap.entrySet()) {
            System.out.printf("%s - %s%n",entry.getKey(),String.join(", ",entry.getValue()));

        }

    }
}