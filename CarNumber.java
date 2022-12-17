package NestedLoops;

import java.util.Scanner;

public class CarNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fNum = Integer.parseInt(scanner.nextLine());
        int sNum = Integer.parseInt(scanner.nextLine());

        for (int i = fNum; i <= sNum ; i++) {
            for (int j = fNum; j <=  sNum ; j++) {
                for (int k = fNum; k <= sNum ; k++) {
                    for (int l = fNum; l <= sNum ; l++) {
                        if(i % 2 == 0 && l % 2 != 0 || i % 2 != 0 && l % 2 == 0){
                            if(i > l){
                                if((j + k) % 2 == 0){
                                    System.out.printf("%d%d%d%d ",i,j,k,l);

                                }


                            }


                        }


                    }

                }

            }

        }
    }
}
