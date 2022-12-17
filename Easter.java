package retakeFinalExam;

import java.util.Scanner;

public class Easter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder textToManipulate = new StringBuilder(text);

        String input = scanner.nextLine();


        while(!input.equals("Easter")){
            String command = input.split(" ")[0];

            switch (command){
                case "Replace":
                    String currentChar = input.split(" ")[1];
                    String newChar = input.split(" ")[2];
                    text = text.replaceAll(currentChar,newChar);
                    textToManipulate = new StringBuilder(text);
                    System.out.println(text);
                    break;
                case "Remove":
                    String subString = input.split(" ")[1];
                    text = text.replaceAll(subString,"");
                    textToManipulate = new StringBuilder(text);
                    System.out.println(text);
                    break;
                case "Includes":
                    String textToCheck = input.split(" ")[1];
                    if(text.contains(textToCheck)){
                        System.out.println("True");
                    }else{
                        System.out.println("False");
                    }
                    break;
                case "Change":
                    String letters = input.split(" ")[1];
                    if(letters.equals("Lower")){
                        text = text.toLowerCase();
                        textToManipulate = new StringBuilder(text);
                        System.out.println(text);

                    }else if(letters.equals("Upper")){
                        text = text.toUpperCase();
                        textToManipulate = new StringBuilder(text);
                        System.out.println(text);

                    }
                    break;

                case "Reverse":
                    int startIndex = Integer.parseInt(input.split(" ")[1]);
                    int endIndex = Integer.parseInt(input.split(" ")[2]);

                    if(startIndex >= 0 && startIndex < text.length() && endIndex >= 0 && endIndex < text.length()){
                        String textToReverse = text.substring(startIndex,endIndex + 1);
                        StringBuilder reverseText = new StringBuilder(textToReverse);
                        reverseText.reverse();
                        textToReverse = reverseText.toString();
                        System.out.println(textToReverse);
                    }
                    break;
            }


            input = scanner.nextLine();

        }

    }
}
