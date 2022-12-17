package textProcessing;

import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();


        while(!word.equals("end")){
            StringBuilder str = new StringBuilder();
            str.append(word);
            str.reverse();

            System.out.printf("%s = %s%n",word,str);

            word = scanner.nextLine();

        }
    }
}
