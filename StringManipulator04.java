package finalExam;

import java.util.Scanner;

public class StringManipulator04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();
        StringBuilder messageToManipulate = new StringBuilder(message);

        String input = scanner.nextLine();

        while(!input.equals("End")){
            String command = input.split(" ")[0];

            switch (command){
                case "Translate":
                    String symbol = input.split(" ")[1];
                    String replacement = input.split(" ")[2];
                    message = message.replaceAll(symbol,replacement);
                    messageToManipulate = new StringBuilder(message);
                    System.out.println(message);
                    break;
                case "Includes":
                    String subString = input.split(" ")[1];
                    message = messageToManipulate.toString();

                    if(message.contains(subString)){
                        System.out.println("True");
                    }else{
                        System.out.println("False");
                    }
                    break;
                case "Start":
                    String subStart = input.split(" ")[1];
                    message = messageToManipulate.toString();
                    if(message.startsWith(subStart)){
                        System.out.println("True");
                    }else{
                        System.out.println("False");
                    }
                    break;
                case "Lowercase":
                    message = messageToManipulate.toString().toLowerCase();
                    System.out.println(message);
                    messageToManipulate = new StringBuilder(message);
                    break;
                case "FindIndex":
                    char symbolToFind = input.split(" ")[1].charAt(0);
                    message = messageToManipulate.toString();
                    int index = message.lastIndexOf(symbolToFind);
                    System.out.println(index);
                    break;
                case "Remove":
                    int startIndex = Integer.parseInt(input.split(" ")[1]);
                    int count = Integer.parseInt(input.split(" ")[2]);
                    int lastIndex = startIndex + count;
                    messageToManipulate.delete(startIndex,lastIndex);
                    message = messageToManipulate.toString();
                    System.out.println(message);
                    break;
            }

            input = scanner.nextLine();
        }

    }
}
