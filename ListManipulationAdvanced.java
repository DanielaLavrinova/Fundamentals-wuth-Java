package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while(!input.equals("end")){

            if(input.contains("Contains")){
                int numberToCheck =Integer.parseInt(input.split(" ")[1]);

                boolean itContains = numbersList.contains(numberToCheck);

                if(itContains){
                    System.out.println("Yes");
                }else{
                    System.out.println("No such number");
                }

            }else if(input.contains("Print even")){

                for (int i = 0; i < numbersList.size(); i++) {
                    int currentNumber = numbersList.get(i);

                    if(currentNumber % 2 == 0){
                        System.out.print(currentNumber + " ");
                    }
                }

                System.out.println();

            }else if(input.contains("Print odd")){
                for (int i = 0; i < numbersList.size(); i++) {
                    int currentNumber = numbersList.get(i);

                    if(currentNumber % 2 != 0){
                        System.out.print(currentNumber + " ");
                    }
                }

                System.out.println();

            }else if(input.contains("Get sum")){
                int sum = 0;
                for (int i = 0; i < numbersList.size(); i++) {
                    int currentNumber = numbersList.get(i);
                    sum += currentNumber;
                }

                System.out.println(sum);

            }else if(input.contains("Filter")){
                String sign = input.split(" ")[1];
                int number = Integer.parseInt(input.split(" ")[2]);

                if(sign.equals(">=")){
                    for (int i = 0; i < numbersList.size(); i++) {
                        int currentNumber = numbersList.get(i);
                        if(currentNumber >= number){
                            System.out.print(currentNumber + " ");
                        }

                    }
                    System.out.println();

                }else if(sign.equals(">")){
                    for (int i = 0; i < numbersList.size(); i++) {
                        int currentNumber = numbersList.get(i);
                        if(currentNumber > number){
                            System.out.print(currentNumber + " ");
                        }

                    }
                    System.out.println();
                }else if(sign.equals("<")){
                    for (int i = 0; i < numbersList.size(); i++) {
                        int currentNumber = numbersList.get(i);
                        if(currentNumber < number){
                            System.out.print(currentNumber + " ");
                        }

                    }
                    System.out.println();

                }else if(sign.equals("<=")){
                    for (int i = 0; i < numbersList.size(); i++) {
                        int currentNumber = numbersList.get(i);
                        if(currentNumber <= number){
                            System.out.print(currentNumber + " ");
                        }

                    }
                    System.out.println();
                }

            }

            input = scanner.nextLine();

        }

    }
}
