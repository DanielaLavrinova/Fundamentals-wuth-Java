package Methods;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        printMiddleCharacter(text);

    }

    public static void printMiddleCharacter(String text){
        int length = text.length();
        if(length % 2 != 0){
            char symbol = text.charAt(length / 2);
            System.out.println(symbol);
        }else if(length % 2 == 0){
            char fSymbol = text.charAt(length / 2 - 1);
            char sSymbol = text.charAt(length / 2 );
            System.out.println("" + fSymbol + sSymbol);

        }

    }
}
