package mapsLabdaStreamAPI;

import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordsArray = scanner.nextLine().split("\\s+");
        LinkedHashMap<String,Integer> wordsMap = new LinkedHashMap<>();

        for (int i = 0; i < wordsArray.length; i++) {
            String word = wordsArray[i].toLowerCase();
            wordsMap.putIfAbsent(word,0);
            wordsMap.put(word,wordsMap.get(word) + 1);
        }

        List<String> resultList = new ArrayList<>();

        for (Map.Entry<String, Integer> element : wordsMap.entrySet()) {
            if(element.getValue() % 2 == 1){
                resultList.add(element.getKey());
            }

        }

        System.out.println(String.join(", ",resultList));

    }
}
