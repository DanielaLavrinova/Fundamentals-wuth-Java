package textProcessing;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] usersArray = input.split(", ");

        for (String user:usersArray) {

            if(isValidUserName(user)){

                System.out.println(user);

            }
        }
    }

    private static boolean isValidUserName(String user) {

        if(user.length() < 3 || user.length() > 16){
            return false;
        }

        for (int i = 0; i < user.length(); i++) {
            char symbol = user.charAt(i);

            if(!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_'){
                return false;
            }
        }

        return true;
    }
}
