package NestedLoops;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        boolean flag = false;
        int counterK = 0;
        int counterL = 0;


        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n ; j++) {
                for (int k = 97; k < (97 + l) ; k++) {
                    for (int m = 97; m <( 97 + l) ; m++) {
                        for (int o = 1; o <= n ; o++) {


                            if(o > i && o > j){

                                System.out.printf("%d%d",i,j);
                                System.out.print((char)k);
                                System.out.print((char)m);
                                System.out.printf("%d ",o);


                            }

                        }

                    }

                }

            }

        }

    }

}

