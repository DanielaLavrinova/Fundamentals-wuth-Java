package PBExams;

import java.util.Scanner;

public class MovieTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int n = scanner.nextInt();

        for (int i = a1; i <= a2 - 1 ; i++) {
            for (int j = 1; j <= n - 1 ; j++) {
                for (int k = 1; k <= ( n/2 ) - 1 ; k++) {
                    for (int l = a1; l <= a2 - 1 ; l++) {

                        if(i % 2 == 1  &&  (j + k + l )% 2 == 1  && i == l){

                            System.out.print((char)i + "-" );
                            System.out.printf("%d%d%d%n",j,k,l);

                        }

                    }

                }

            }

        }
    }
}
