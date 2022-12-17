package textProcessing;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordsArray = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (int i = 0; i < wordsArray.length; i++) {
            String banWord = wordsArray[i];

            if(text.contains(banWord)){
                text = text.replace(banWord,printText("*",banWord.length()));
            }

        }

        System.out.println(text);

    }



    public static String printText(String word,int length){
        String result = "";
        for (int i = 0; i < length; i++) {
            result += word;
        }

        return  result;

    }
}
