package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String inputLine = scanner.nextLine();

        while(!inputLine.equals("Finish")){
            String command = inputLine.split(" ")[0];

            switch (command){
                case "Add":
                    int elementToAdd = Integer.parseInt(inputLine.split(" ")[1]);
                    numbersList.add(elementToAdd);
                    break;
                case "Remove":
                    int elementToRemove = Integer.parseInt(inputLine.split(" ")[1]);
                    int index = 0;
                    boolean isExist = false;

                    for (int i = 0; i < numbersList.size(); i++) {
                        if(elementToRemove == numbersList.get(i)){
                            index = i;
                            isExist = true;
                            break;
                        }
                    }

                    if(isExist){
                       numbersList.remove(index);
                    }
                    break;
                case "Replace":
                    int value = Integer.parseInt(inputLine.split(" ")[1]);
                    int replacement = Integer.parseInt(inputLine.split(" ")[2]);

                    for (int i = 0; i < numbersList.size(); i++) {
                        if(value == numbersList.get(i)){
                            numbersList.set(i,replacement);
                            break;
                        }
                    }
                    break;
                case "Collapse":
                    int element = Integer.parseInt(inputLine.split(" ")[1]);

                    for (int i = 0; i < numbersList.size(); i++) {
                        if(element > numbersList.get(i)){
                            numbersList.remove(i);
                            i --;

                        }

                    }

                    break;
            }

            inputLine = scanner.nextLine();

        }

        for (int element:numbersList) {
            System.out.print(element + " ");
        }

    }
}
