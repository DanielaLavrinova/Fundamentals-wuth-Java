package Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        List<String> listOfNames = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            String input = scanner.nextLine();
            String name = input.split(" ")[0];
            String command = input.split(" ")[2];

            if(command.equals("going!")){
                if(listOfNames.contains(name)){
                    System.out.printf("%s is already in the list!%n",name);
                }else {
                    listOfNames.add(name);
                }

            }else if(command.equals("not")){
                if(listOfNames.contains(name)){
                    listOfNames.remove(name);
                }else{
                    System.out.printf("%s is not in the list!%n",name);
                }

            }

        }

        for (String name:listOfNames) {
            System.out.println(name);
        }
    }
}
