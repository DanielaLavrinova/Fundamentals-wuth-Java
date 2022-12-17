package mapsLabdaStreamAPI;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        char[] charArray = inputLine.toCharArray();

        LinkedHashMap<Character,Integer> symbolsMap = new LinkedHashMap<>();

        for (int i = 0; i < charArray.length ; i++) {
            char symbol = charArray[i];
            if(symbol == ' '){
                continue;
            }

            if(!symbolsMap.containsKey(symbol)){
                symbolsMap.put(symbol,1);
            }else{
                int currentValue = symbolsMap.get(symbol);
                symbolsMap.put(symbol,currentValue + 1);
            }

        }

        symbolsMap.entrySet().forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));
    }
}
