package PBExams;

import java.util.Scanner;

public class NameGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int maxSum = Integer.MIN_VALUE;
        String winner = "";


        while(!name.equals("Stop")){
            int length = name.length();
            int sum = 0;

            for (int i = 0; i < length ; i++) {

                int number = Integer.parseInt(scanner.nextLine());
                char symbol = name.charAt(i);
                int n = symbol;

                if(n == number){
                    sum += 10;
                }else{

                    sum += 2;

                }

            }

            if(sum > maxSum){

                maxSum = sum;
                winner = name;

            }
            if(sum == maxSum){

                winner = name;

            }

            name = scanner.nextLine();

        }

        System.out.printf("The winner is %s with %d points!",winner,maxSum);

    }
}
