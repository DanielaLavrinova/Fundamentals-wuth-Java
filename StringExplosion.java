package textProcessing;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder word = new StringBuilder(input);

        int totalStrength = 0;

        for (int i = 0; i < word.length(); i++) {
            char symbol = word.charAt(i);

            if(symbol == '>'){
                int strength = Integer.parseInt(word.charAt(i + 1) + "");
                totalStrength += strength;
            }else if(symbol != '>' && totalStrength > 0){
                word.deleteCharAt(i);
                totalStrength --;
                i --;
            }
        }

        System.out.println(word);
    }
}
