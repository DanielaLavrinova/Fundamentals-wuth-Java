package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while(!input.equals("end")){
            String command = input.split(" ")[0];
            int element = Integer.parseInt(input.split(" ")[1]);

            if(command.equals("Delete")){
                numbersList.removeAll(Arrays.asList(element));

            }else if(command.equals("Insert")){
                int index = Integer.parseInt(input.split(" ")[2]);
                numbersList.add(index,element);

            }


            input = scanner.nextLine();
        }

        System.out.println(numbersList.toString().replaceAll("[\\[\\],]",""));
    }
}
