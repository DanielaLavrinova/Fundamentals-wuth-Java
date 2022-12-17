package NestedLoops;

import java.util.Scanner;

public class SecretDoorsLock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int number = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        int aB = a * b;
        boolean flag = false;

        for (int i = 35; i <= 55 ; i++) {
            for (int j = 64; j <= 96 ; j++) {
                for (int k = 1; k <= a ; k++) {
                    for (int l = 1; l <= b ; l++) {

                                System.out.print((char)i);
                                System.out.print((char)j);
                                System.out.printf("%d%d",k,l);
                                System.out.print((char)j);
                                System.out.print((char)i);
                                System.out.print("|");
                                counter ++;
                                if(counter == number || counter == aB){
                                    flag = true;
                                    break;
                                }

                                i ++;
                                j ++;

                                if(i > 55){
                                    i = 35;
                                }
                                if(j > 96){
                                    j = 64;
                                }

                    }
                    if(flag){
                        break;
                    }
                }
                if(flag){
                    break;
                }

            }
            if(flag){
                break;
            }
        }

    }
}
