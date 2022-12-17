package finalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile("(@|#)(?<wordOne>[A-Za-z]{3,})(\\1)(\\1)(?<wordTwo>[A-Za-z]{3,})(\\1)");
        Matcher matcher = pattern.matcher(text);
        List<String> mirrorList = new ArrayList<>();
        int counter = 0;

        while(matcher.find()){
            counter ++;
            String wordOne = matcher.group("wordOne");
            String wordTwo = matcher.group("wordTwo");
            StringBuilder mirrorWord = new StringBuilder(wordTwo);
            mirrorWord.reverse();
            String reversedWord = mirrorWord.toString();

            if(wordOne.equals(reversedWord)){
                String word = String.format("%s <=> %s",wordOne,wordTwo);
                mirrorList.add(word);

            }

        }

        if(counter > 0){
            System.out.printf("%d word pairs found!%n",counter);

        }else{
            System.out.println("No word pairs found!");
        }

        if(mirrorList.size() > 0){
            System.out.println("The mirror words are:");
            System.out.println(String.join(", ",mirrorList));
        }else{
            System.out.println("No mirror words!");
        }

    }
}
