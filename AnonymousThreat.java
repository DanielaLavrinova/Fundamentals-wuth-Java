package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputLine = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while(!command.equals("3:1")){
            String task = command.split(" ")[0];
            if(task.equals("merge")){
                int startIndex = Integer.parseInt(command.split(" ")[1]);
                int endIndex = Integer.parseInt(command.split(" ")[2]);
                if(startIndex < 0){
                    startIndex = 0;
                }
                if(endIndex > inputLine.size()-1){
                    endIndex = inputLine.size() - 1;
                }

                boolean isValidIndex = startIndex < inputLine.size() - 1 && endIndex >= 0 && startIndex < endIndex;

                String result = "";
                if(isValidIndex){
                    for (int i = startIndex; i <= endIndex ; i++) {
                        String currentElement = inputLine.get(i);
                        result += currentElement;

                    }

                    for (int i = startIndex; i <= endIndex ; i++) {
                        inputLine.remove(startIndex);
                    }
                    
                    inputLine.add(startIndex,result);

                }
            }else if(task.equals("divide")){
                int index = Integer.parseInt(command.split(" ")[1]);
                int parts = Integer.parseInt(command.split(" ")[2]);

                boolean validIndex = index >= 0 && index < inputLine.size();
                if(validIndex){
                    String element = inputLine.get(index);
                    inputLine.remove(index);
                    int size = element.length();
                    int partsOfElement = size/ parts;
                    int beginIndex = 0;

                    for (int i = 1; i < parts; i++) {
                        inputLine.add(index,element.substring(beginIndex,beginIndex + partsOfElement));
                        index ++;
                        beginIndex += partsOfElement;
                    }

                    inputLine.add(index,element.substring(beginIndex));


                }

            }

            command = scanner.nextLine();

        }

        System.out.println(String.join(" ",inputLine));

    }
}
