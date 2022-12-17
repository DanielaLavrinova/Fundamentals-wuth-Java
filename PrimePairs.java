package NestedLoops;

import java.util.Scanner;

public class PrimePairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstN = Integer.parseInt(scanner.nextLine());
        int secondN = Integer.parseInt(scanner.nextLine());
        int diffFirst = Integer.parseInt(scanner.nextLine());
        int diffSecond = Integer.parseInt(scanner.nextLine());

        int firstPair = firstN + diffFirst;
        int secondPair = secondN + diffSecond;

        for (int i = firstN; i <= firstPair ; i++) {
            boolean flag = false;
            for (int j = secondN; j <= secondPair ; j++) {
                boolean nextFlag = false;
                for (int k = 2; k <= i / 2 ; k++) {
                    if(i % k == 0 ){
                        flag = true;
                        break;
                    }
                }
                if(!flag) {
                    for (int k = 2; k <= j / 2; k++) {
                        if (j % k == 0) {
                            nextFlag = true;
                            break;
                        }
                    }
                    if (!nextFlag) {
                        System.out.printf("%d%d%n", i, j);
                    }

                }else{
                    break;
                }

            }

        }

    }

}










