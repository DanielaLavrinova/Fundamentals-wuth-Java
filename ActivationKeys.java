package finalExam;

import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder key = new StringBuilder(input);
        String data = scanner.nextLine();

        while(!data.equals("Generate")){
            String command = data.split(">>>")[0];

            if(command.equals("Contains")){
                String substring = data.split(">>>")[1];
                String rowActivationKey = key.toString();

                if(rowActivationKey.contains(substring)){
                    System.out.printf("%s contains %s%n",rowActivationKey,substring);
                }else{
                    System.out.println("Substring not found!");
                }


            }else if(command.equals("Flip")){
                String letters = data.split(">>>")[1];
                int startIndex = Integer.parseInt(data.split(">>>")[2]);
                int endIndex = Integer.parseInt(data.split(">>>")[3]);

                String subString = key.substring(startIndex,endIndex);
                String changedSubString = "";

                if(letters.equals("Upper")){
                    changedSubString = subString.toUpperCase();

                }else if(letters.equals("Lower")){
                    changedSubString = subString.toLowerCase();

                }

                String result = key.toString().replaceFirst(subString,changedSubString);
                key = new StringBuilder(result);

                System.out.println(key);

            }else if(command.equals("Slice")){
                int start = Integer.parseInt(data.split(">>>")[1]);
                int end = Integer.parseInt(data.split(">>>")[2]);

                key.delete(start,end);
                System.out.println(key);

            }

            data = scanner.nextLine();

        }

        System.out.printf("Your activation key is: %s",key);
    }
}
