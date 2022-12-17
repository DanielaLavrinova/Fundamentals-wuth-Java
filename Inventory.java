package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inventoryList = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while(!input.equals("Craft!")){
            String command = input.split(" - ")[0];
            String item = input.split(" - ")[1];

            switch (command){
                case "Collect":
                    if(!inventoryList.contains(item)){
                        inventoryList.add(item);
                    }
                    break;
                case "Drop":
                    if(inventoryList.contains(item)){
                        inventoryList.remove(item);
                    }
                    break;
                case "Combine Items":
                    int index = 0;
                    boolean isExist = false;
                    String oldItem = item.split(":")[0];
                    String newItem = item.split(":")[1];
                    for (int i = 0; i < inventoryList.size(); i++) {
                        String currentElement = inventoryList.get(i);
                        if(currentElement.equals(oldItem)){
                            index = i;
                            isExist = true;
                            break;
                        }

                    }
                    if(isExist){
                        inventoryList.add(index + 1,newItem);
                    }
                    break;
                case "Renew":
                    String itemToAdd = item;
                    for (int i = 0; i < inventoryList.size(); i++) {
                        String currentItem = inventoryList.get(i);
                        if(currentItem.equals(item)){
                            inventoryList.remove(i);
                            inventoryList.add(itemToAdd);

                        }

                    }
                    break;
            }


            input = scanner.nextLine();

        }

        for (int i = 0; i < inventoryList.size() - 1; i++) {
            String item = inventoryList.get(i);
            System.out.print(item + ", ");
        }
        System.out.print(inventoryList.get(inventoryList.size()- 1));
    }
}
