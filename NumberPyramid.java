package NestedLoops;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isEqual = false;
        int count = 0;

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i ; j++) {
                count ++;
                System.out.print(count + " ");

                if(count >= n){
                    isEqual = true;
                   break;
                }
            }

            System.out.println();

            if(isEqual){
                break;
            }

        }
    }
}
