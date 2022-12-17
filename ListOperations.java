package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while(!input.equals("End")){
            if(input.contains("Add")){
                int numberToAdd = Integer.parseInt(input.split(" ")[1]);
                numbersList.add(numberToAdd);

            }else if(input.contains("Insert")){
                int numberToInsert = Integer.parseInt(input.split(" ")[1]);
                int indexToInsert = Integer.parseInt(input.split(" ")[2]);
                if(isIndexValid(indexToInsert,numbersList)){
                    numbersList.add(indexToInsert,numberToInsert);
                }else{
                    System.out.println("Invalid index");
                }

            }else if(input.contains("Remove")){
                int indexToRemove = Integer.parseInt(input.split(" ")[1]);
                if(isIndexValid(indexToRemove,numbersList)){
                    numbersList.remove(indexToRemove);
                }else{
                    System.out.println("Invalid index");
                }

            }else if(input.contains("Shift left")){
                int countLeft = Integer.parseInt(input.split(" ")[2]);
                for (int i = 1; i <= countLeft ; i++) {
                    int firstElement = numbersList.get(0);
                    numbersList.remove(0);
                    numbersList.add(firstElement);
                }

            }else if(input.contains("Shift right")){
                int countRight = Integer.parseInt(input.split(" ")[2]);
                for (int i = 1; i <= countRight ; i++) {
                    int lastElement = numbersList.get(numbersList.size()- 1);
                    numbersList.remove(numbersList.size()- 1);
                    numbersList.add(0,lastElement);

                }

            }

            input = scanner.nextLine();

        }

        System.out.println(numbersList.toString().replaceAll("[\\[\\],]",""));
    }

    public static boolean isIndexValid(int index,List<Integer>numbersList){
        return index>= 0 && index <= numbersList.size() -1;
    }
}
