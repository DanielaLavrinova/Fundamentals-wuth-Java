package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TakeSkipRope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();
        String onlyNumbers = message.replaceAll("\\D+", "");

        char[] lettersList = message.toCharArray();
        String letters = "";
        for (int i = 0; i < lettersList.length; i++) {
            if (!Character.isDigit(lettersList[i])) {
                letters += lettersList[i];

            }
        }

        List<Integer> numbersList = Arrays.stream(onlyNumbers.split(""))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Character> wordList = letters.chars().mapToObj(e -> (char) e).collect(Collectors.toList());
        List<Integer> takeList = new ArrayList<>();
        List<Integer> skipList = new ArrayList<>();

        for (int i = 0; i < numbersList.size(); i++) {
            int element = numbersList.get(i);
            if (i % 2 == 0) {
                takeList.add(element);

            } else {
                skipList.add(element);
            }

        }

        int length = numbersList.size() / 2;
        String finalResult = "";
        int index = 0;
        int startIndex = 0;
        int take = 0;
        int skip = 0;


        for (int i = 0; i < length; i++) {

            take = takeList.get(i);
            index += take;
            if (index > wordList.size()) {
                index = wordList.size();
            }
            if (startIndex > wordList.size()) {
                startIndex = wordList.size();
            }
            for (int j = startIndex; j < index; j++) {
                finalResult += wordList.get(j);
            }

            skip = skipList.get(i);
            index += skip;
            startIndex = index;

        }


        System.out.println(finalResult);

    }
}
