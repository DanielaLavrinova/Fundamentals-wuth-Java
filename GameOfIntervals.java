package ForLoop;

import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        double points = 0;
        double result = 0;
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;
        int p6 = 0;

        for (int i = 1; i <= number ; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());


            if(currentNumber < 0){
                result = result / 2;
                p6 ++;
            } else if(currentNumber < 10){
                points = currentNumber * 0.20 ;
                result += points;
                p1++;
            }else if(currentNumber < 20){
                points = currentNumber * 0.30 ;
                result += points;
                p2++;
            }else if( currentNumber < 30){
                points = currentNumber * 0.40 ;
                result += points;
                p3++;
            }else if ( currentNumber < 40){
                points = 50;
                result += points;
                p4++;
            }else if ( currentNumber <= 50){
                points = 100;
                result += points;
                p5++;
            }else if ( currentNumber > 50){
                result = result / 2;
                p6++;
            }

        }

        System.out.printf("%.2f%n",result);
        System.out.printf("From 0 to 9: %.2f%%%n",(p1 * 1.00 / number)* 100);
        System.out.printf("From 10 to 19: %.2f%%%n",(p2 * 1.00 / number)* 100);
        System.out.printf("From 20 to 29: %.2f%%%n",(p3 * 1.00 / number)* 100);
        System.out.printf("From 30 to 39: %.2f%%%n",(p4 * 1.00 / number)* 100);
        System.out.printf("From 40 to 50: %.2f%%%n",(p5 * 1.00 / number)* 100);
        System.out.printf("Invalid numbers: %.2f%%%n",(p6 * 1.00 / number)* 100);

    }
}
