package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbersList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String input = scanner.nextLine();
        int moveCounter = 0;
        String elementToAdd = "";
        int sizeOfList = 0;
        boolean isEmpty = false;
        int counterToAdd = 0;


        while(!input.equals("end")){


            int firstIndex = Integer.parseInt(input.split(" ")[0]);
            int secondIndex = Integer.parseInt(input.split(" ")[1]);

            boolean validFirstIndex = isIndexValid(firstIndex,numbersList);
            boolean validSecondIndex = isIndexValid(secondIndex,numbersList);

            if((validFirstIndex && validSecondIndex) && firstIndex != secondIndex){
                String firstElement = numbersList.get(firstIndex);
                String secondElement = numbersList.get(secondIndex);

                if(firstElement.equals(secondElement)){
                   if(firstIndex > secondIndex){
                       numbersList.remove(firstIndex);
                       numbersList.remove(secondIndex);
                   }else {
                       numbersList.remove(secondIndex);
                       numbersList.remove(firstIndex);
                   }


                    System.out.printf("Congrats! You have found matching elements - %s!%n",firstElement);

                }else{
                    System.out.println("Try again!");
                }

            }else {
                counterToAdd = moveCounter + 1;
                elementToAdd = "-" + counterToAdd + "a";
                sizeOfList = numbersList.size()/ 2;

                numbersList.add(sizeOfList,elementToAdd);
                numbersList.add(sizeOfList + 1,elementToAdd);

                System.out.println("Invalid input! Adding additional elements to the board");

            }

            moveCounter ++;

            if(numbersList.size() <= 0){
                isEmpty = true;
                break;
            }

            input = scanner.nextLine();

        }

        if(isEmpty){
            System.out.printf("You have won in %d turns!",moveCounter);
        }else{
            System.out.println("Sorry you lose :(");
            System.out.println(String.join(" ",numbersList));
        }

    }

    public static boolean isIndexValid(int index1,List<String> numbersList){
        return index1 >= 0 && index1 <= numbersList.size() - 1;
    }
}
