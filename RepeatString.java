package Methods;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());

        String result = printString(input,number);

        System.out.println(result);


    }

    public static String printString(String input,int number){
        String result = "";

        for (int i = 0; i < number ; i++) {
            result += input;

        }

        return  result;
    }
}
