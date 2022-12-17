package Methods;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while(!input.equals("END")){
            boolean isPalindrome = printPalindromeNumber(input);
            System.out.println(isPalindrome);
            input = scanner.nextLine();
        }


    }

    public static boolean printPalindromeNumber(String input){
        char[] inputArray = input.toCharArray();
        String inputReverse = "";

        for (int i = inputArray.length - 1; i >= 0 ; i --) {
            inputReverse += inputArray[i];
        }
        if(input.equals(inputReverse)){
            return true;

        }else{
            return false;
        }

    }

}
