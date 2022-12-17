package finalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        StringBuilder passToManipulate = new StringBuilder(password);

        String input = scanner.nextLine();

        while(!input.equals("Complete")){
            String command = input.split(" ")[0];

            switch (command){
                case "Make":
                    String secondPart = input.split(" ")[1];
                    int index = Integer.parseInt(input.split(" ")[2]);
                    if(index >= 0 && index < password.length()){
                        if(secondPart.equals("Upper")){
                            char symbol = password.charAt(index);
                            symbol = Character.toUpperCase(symbol);
                            passToManipulate.replace(index,index + 1, String.valueOf(symbol));
                            password = passToManipulate.toString();
                            System.out.println(password);

                        }else if(secondPart.equals("Lower")){
                            char symbol = password.charAt(index);
                            symbol = Character.toLowerCase(symbol);
                            passToManipulate.replace(index,index + 1, String.valueOf(symbol));
                            password = passToManipulate.toString();
                            System.out.println(password);

                        }

                    }

                    break;
                case "Insert":
                    int indexToInsert = Integer.parseInt(input.split(" ")[1]);
                    String toInsert = input.split(" ")[2];

                    if(indexToInsert >= 0 && indexToInsert <= password.length()){
                        passToManipulate.insert(indexToInsert,toInsert);
                        password = passToManipulate.toString();
                        System.out.println(password);

                    }
                    break;

                case "Replace":
                    char symbolToReplace = input.split(" ")[1].charAt(0);
                    int value = Integer.parseInt(input.split(" ")[2]);
                    char symbolToPlace = (char) (symbolToReplace + value);
                    password = password.replace(symbolToReplace,symbolToPlace);
                    passToManipulate = new StringBuilder(password);

                    System.out.println(password);
                    break;

                case "Validation":
                    int length = passToManipulate.length();

                    if(length < 8){
                        System.out.println("Password must be at least 8 characters long!");
                    }
                    Pattern pattern = Pattern.compile("^[\\w\\d_]+$");
                    Matcher matcher = pattern.matcher(passToManipulate);

                    if(!matcher.find()){
                        System.out.println("Password must consist only letters,digits and underscore!");
                    }
                    Pattern patternUpper = Pattern.compile("^.*[A-Z].*$");
                    Matcher matcherUpper = patternUpper.matcher(passToManipulate);

                    if(!matcherUpper.find()){
                        System.out.println("Password must consist at least one Upper case!");
                    }

                    Pattern patternLower = Pattern.compile("^.*[a-z].*$");
                    Matcher matcherLower = patternLower.matcher(passToManipulate);

                    if(!matcherLower.find()){
                        System.out.println("Password must consist at least one lower case!");
                    }

                    Pattern patternDigit = Pattern.compile("^.*[0-9].*$");
                    Matcher matcherDigit = patternDigit.matcher(passToManipulate);

                    if(!matcherDigit.find()){
                        System.out.println("Password must consist at least one digit!");
                    }

            }


            input = scanner.nextLine();

        }

    }
}
