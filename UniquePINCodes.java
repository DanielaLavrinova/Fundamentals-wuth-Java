package NestedLoops;

import java.util.Scanner;

public class UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i <= firstNum ; i++) {
            for (int j = 2; j <= secondNum ; j++) {
                for (int k = 2; k <= thirdNum ; k++) {
                   if(j > 7){
                       break;
                   }

                    if ( i % 2 == 0 &&( j == 2 || !(j % 2 == 0) ) && k % 2 == 0 ){
                        System.out.printf("%d %d %d%n",i,j,k);

                    }

                }
            }
        }

    }
}
