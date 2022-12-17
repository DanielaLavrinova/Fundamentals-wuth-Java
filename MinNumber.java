package WhileLoop;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();

        int minNum = Integer.MAX_VALUE;

        while(!number.equals("Stop")){
            int currentNum = Integer.parseInt(number);

            if(currentNum < minNum){
                minNum = currentNum;
            }

            number = scanner.nextLine();
        }

        System.out.println(minNum);
    }
}
