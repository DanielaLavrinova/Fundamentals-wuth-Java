package Methods;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        boolean isLengthValid = isLengthValid(password);
        boolean isConsistOnlyDigitsAndLetters = isConsistOnlyDigitAndLetters(password);
        boolean isDigitNumberValid = isDigitNumberValid(password);

        if(!isLengthValid){
            System.out.println("Password must be between 6 and 10 characters");
        }

        if(!isConsistOnlyDigitsAndLetters){
            System.out.println("Password must consist only of letters and digits");
        }

        if(!isDigitNumberValid){
            System.out.println("Password must have at least 2 digits");
        }

        if(isLengthValid && isConsistOnlyDigitsAndLetters && isDigitNumberValid){
            System.out.println("Password is valid");
        }


    }

    public static boolean isLengthValid(String password){
        int length = password.length();

        if(length >= 6 && length <= 10){
            return  true;
        }else {
            return false;
        }

    }

    public static boolean isConsistOnlyDigitAndLetters(String password){
        for (char symbol:password.toCharArray()) {
            if(!Character.isLetterOrDigit(symbol)){
                return false;

            }
        }

        return true;
    }

    public static boolean isDigitNumberValid(String password){
        int counter = 0;
        for (char symbol:password.toCharArray()) {
            if(Character.isDigit(symbol)){
                counter ++;
            }
        }

        return counter >= 2;

    }
}
