package PBExams;

import java.util.Scanner;

public class BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());


            
            int number1 = firstNum;
            int number2 = secondNum;
            
            int digitF = number1 % 10;
            int digitS = number2 % 10;
            
            number1 /= 10;
            number2 /= 10;

            int digitFF = number1 % 10;
            int digitSS = number2 % 10;

            number1 /= 10;
            number2 /= 10;

            int digitFFF = number1 % 10;
            int digitSSS = number2 % 10;

            number1 /= 10;
            number2 /= 10;

            int digitFFFF = number1 % 10;
            int digitSSSS = number2 % 10;

            number1 /= 10;
            number2 /= 10;

        for (int i = digitFFFF; i <= digitSSSS ; i++) {
            for (int j = digitFFF; j <= digitSSS ; j++) {
                for (int k = digitFF; k <= digitSS ; k++) {
                    for (int l = digitF; l <= digitS ; l++) {

                        if(i % 2 == 1 && j % 2 == 1 && k % 2 == 1 && l % 2 == 1){
                            System.out.printf("%d%d%d%d ",i,j,k,l);
                        }

                    }

                }

            }

        }

    }
                
}


           


    


