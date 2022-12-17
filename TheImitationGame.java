package finalExam;

import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String data = scanner.nextLine();


        while(!data.equals("Decode")){
            StringBuilder word = new StringBuilder(input);
            String command = data.split("\\|")[0];
            switch (command) {
                case"Move":
                    int number = Integer.parseInt(data.split("\\|")[1]);
                    String subString = input.substring(0,number);
                    word.delete(0,number);
                    word.append(subString);
                    break;
                case"Insert":
                    int index = Integer.parseInt(data.split("\\|")[1]);
                    String symbol = data.split("\\|")[2];
                    word.insert(index,symbol);
                    break;
                case"ChangeAll":
                    String toReplace = data.split("\\|")[1];
                    String toChange = data.split("\\|")[2];
                    input = word.toString();
                    input = input.replace(toReplace,toChange);
                    word = new StringBuilder(input);

            }

            input = word.toString();
            data = scanner.nextLine();

        }

        System.out.printf("The decrypted message is: %s",input);

    }

}
