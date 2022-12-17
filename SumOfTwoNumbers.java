package NestedLoops;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        int sum = 0;
        boolean isFound = false;

        for (int i = start; i <= end ; i++) {
            for (int j = start; j <= end ; j++) {
                sum = i + j;
                counter ++;

                if(sum == magicNumber){
                    System.out.printf("Combination N:%d (%d + %d = %d)",counter,i,j,magicNumber);
                    isFound = true;
                    break;
                }
            }
            if(isFound){
                break;
            }
        }

        if(!isFound){
            System.out.printf("%d combinations - neither equals %d",counter,magicNumber);
        }

    }
}
