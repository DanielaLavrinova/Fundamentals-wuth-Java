package WhileLoop;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();

        int maxNum = Integer.MIN_VALUE;

        while(!number.equals("Stop")){
            int currentNum = Integer.parseInt(number);
            if(currentNum > maxNum){
                maxNum = currentNum;
            }

            number = scanner.nextLine();
        }

        System.out.println(maxNum);

    }
}
