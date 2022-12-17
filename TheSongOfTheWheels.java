package NestedLoops;

import java.util.Scanner;

public class TheSongOfTheWheels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        String password = "";
        boolean flag = false;

        for (int i = 1; i <= 9 ; i++) {
            for (int j = 1; j <= 9 ; j++) {
                for (int k = 1; k <= 9 ; k++) {
                    for (int l = 1; l <= 9 ; l++) {

                        if(i * j + k * l == number && i < j && k > l){
                            System.out.printf("%d%d%d%d ",i,j,k,l);
                            counter ++;

                            if(counter == 4){
                                password = "" + i + "" + j + "" + k + "" + l;
                                flag = true;
                            }

                        }

                    }

                }

            }

        }

        if(flag){
            System.out.println();
            System.out.printf("Password: %s",password);
        }else {
            System.out.println();
            System.out.println("No!");
        }
    }
}
