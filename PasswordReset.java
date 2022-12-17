package finalExam;

import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder passwordToReset = new StringBuilder(text);
        String data = scanner.nextLine();

        while(!data.equals("Done")){
            String command = data.split(" ")[0];

            if(command.equals("TakeOdd")){
                StringBuilder newPassword = new StringBuilder();
                for (int i = 0; i < passwordToReset.length(); i++) {
                    char symbol = passwordToReset.charAt(i);
                    if(i % 2 != 0){
                        newPassword.append(symbol);
                    }
                }

                System.out.println(newPassword);
                passwordToReset = newPassword;

            }else if(command.equals("Cut")){
                int index = Integer.parseInt(data.split(" ")[1]);
                int length = Integer.parseInt(data.split(" ")[2]);
                int endIndex = index + length;
                String subString = passwordToReset.substring(index,endIndex);
                String newText = passwordToReset.toString().replaceFirst(subString,"");
                passwordToReset = new StringBuilder(newText);

                System.out.println(passwordToReset);

            }else if(command.equals("Substitute")){

                String subStringToReplace = data.split(" ")[1];
                String substitute = data.split(" ")[2];
                String textToCheck = passwordToReset.toString();

                if(textToCheck.contains(subStringToReplace)){

                    textToCheck = passwordToReset.toString().replaceAll(subStringToReplace,substitute);
                    System.out.println(textToCheck);
                    passwordToReset = new StringBuilder(textToCheck);

                }else{
                    System.out.println("Nothing to replace!");
                }

            }

            data = scanner.nextLine();

        }

        System.out.printf("Your password is: %s",passwordToReset);
    }
}
