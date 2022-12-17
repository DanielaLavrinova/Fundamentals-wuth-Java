package ConditionalStatements;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstPlayer = Integer.parseInt(scanner.nextLine());
        int secondPlayer = Integer.parseInt(scanner.nextLine());
        int thirdPlayer = Integer.parseInt(scanner.nextLine());

        int totalTime = firstPlayer + secondPlayer + thirdPlayer;
        int hours = totalTime / 60;
        int minutes = totalTime % 60;

        if(minutes < 10){
            System.out.printf("%d:0%d",hours,minutes);
        }else {
            System.out.printf("%d:%d",hours,minutes);
        }
    }
}
