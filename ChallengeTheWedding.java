package NestedLoops;

import java.util.Scanner;

public class ChallengeTheWedding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counterT = 0;
        int man = Integer.parseInt(scanner.nextLine());
        int woman = Integer.parseInt(scanner.nextLine());
        int table = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= man ; i++) {
            for (int j = 1; j <= woman ; j++) {
                counterT ++;
                if(counterT > table ){
                   break;
                }

                System.out.printf("(%d <-> %d) ",i,j);

            }

        }
    }
}
