package NestedLoops;

import java.util.Scanner;

public class LettersCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;

        char startLetter = scanner.next().charAt(0);
        char endLetter = scanner.next().charAt(0);
        char avoidLetter = scanner.next().charAt(0);

        for (char i = startLetter;i <= endLetter;i++ ) {
            for (char j = startLetter; j <= endLetter ; j++) {
                for (char k = startLetter; k <= endLetter ; k++) {
                    if(i != avoidLetter && j != avoidLetter && k != avoidLetter) {
                        counter ++;
                        System.out.printf("%s%s%s ",i,j,k);
                    }

                }

            }

        }
        System.out.printf("%d",counter);
    }
}
