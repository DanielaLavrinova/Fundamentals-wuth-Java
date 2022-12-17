package Methods;

import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        printTriangle(1,number);


    }

    public static void printTriangle(int start,int end){
        for (int i = start; i <= end ; i++) {
            printLine(1,i);
        }

        for (int i = end - 1; i >= 1 ; i--) {
            printLine(1,i);
        }
    }

    public static void printLine(int start,int end){
        for (int i = start; i <= end ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


}
