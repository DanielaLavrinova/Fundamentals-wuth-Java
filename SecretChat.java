package finalExam;

import java.util.Scanner;

public class SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();
        StringBuilder messageToReveal = new StringBuilder(message);
        String data = scanner.nextLine();

        while(!data.equals("Reveal")){
            String command = data.split(":\\|:")[0];

            if(command.equals("InsertSpace")){
                int index = Integer.parseInt(data.split(":\\|:")[1]);
                messageToReveal.insert(index," ");
                System.out.println(messageToReveal);

            }else if(command.equals("Reverse")){
                String subString = data.split(":\\|:")[1];
                String text = messageToReveal.toString();

                if(text.contains(subString)){

                    text= messageToReveal.toString().replaceFirst(subString,"");
                    StringBuilder reverseSubString = new StringBuilder(subString);
                    reverseSubString.reverse();
                    subString = reverseSubString.toString();
                    messageToReveal = new StringBuilder(text);
                    messageToReveal.append(subString);
                    System.out.println(messageToReveal);

                }else{
                    System.out.println("error");
                }

            }else if(command.equals("ChangeAll")){
                String subToReplace = data.split(":\\|:")[1];
                String subToAdd = data.split(":\\|:")[2];

                String textToModify = messageToReveal.toString().replaceAll(subToReplace,subToAdd);
                messageToReveal = new StringBuilder(textToModify);
                System.out.println(messageToReveal);

            }

            data = scanner.nextLine();

        }

        System.out.printf("You have a new text message: %s",messageToReveal);
    }
}
