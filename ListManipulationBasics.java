package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while(!input.equals("end")){
            String command = input.split(" ")[0];


            switch (command){
                case "Add":
                    int numberToAdd = Integer.parseInt(input.split(" ")[1]);
                    numbersList.add(numberToAdd);
                    break;
                case "Remove":
                    int numberToRemove = Integer.parseInt(input.split(" ")[1]);
                    numbersList.remove(Integer.valueOf(numberToRemove));
                    break;
                case "RemoveAt":
                    int indexToRemove = Integer.parseInt(input.split(" ")[1]);
                    numbersList.remove(indexToRemove);
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(input.split(" ")[1]);
                    int index = Integer.parseInt(input.split(" ")[2]);
                    numbersList.add(index,numberToInsert);
                    break;
            }

            input = scanner.nextLine();

        }

        for (int number:numbersList) {
            System.out.print(number + " ");
        }
    }

}
