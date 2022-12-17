package MidExam;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] groceryList = scanner.nextLine().split("!");
        String input = scanner.nextLine();

        while(!input.equals("Go Shopping!")){
            String[] elementsArray = input.split(" ");
            String command = elementsArray[0];
            String shoppingItem = elementsArray[1];

            switch(command){
                case "Urgent":
                    String urgent = " ";
                    boolean isExist = false;
                    for (int i = 0; i < groceryList.length; i++) {
                        if(shoppingItem.equals(groceryList[i])){
                            isExist = true;
                            break;
                        }
                    }
                    if(!isExist) {
                        urgent = shoppingItem + " " + String.join(" ", groceryList);
                        String[] urgentArray = urgent.split(" ");
                        groceryList = urgentArray;
                    }
                    break;
                case "Unnecessary":
                    boolean isFound = false;
                    for (int i = 0; i < groceryList.length; i++) {
                        if(shoppingItem.equals(groceryList[i])){
                                isFound = true;
                                break;
                        }
                    }
                    if(isFound){
                        String[] unnecessaryArray = new String[groceryList.length - 1];
                        boolean flag = false;
                        String element = " ";
                        for (int j = 0,k = 0; j < groceryList.length; j++) {
                            if (!shoppingItem.equals(groceryList[j])) {
                                    unnecessaryArray[k]= groceryList[j];
                                    k++;
                            }
                        }
                        groceryList = unnecessaryArray;
                    }
                    break;
                case "Correct":
                    String newItem = elementsArray[2];
                    for (int i = 0; i < groceryList.length; i++) {
                        if(shoppingItem.equals(groceryList[i])){
                            groceryList[i] = newItem;
                        }
                    }
                    break;
                case "Rearrange":
                    String lastItem = shoppingItem;
                    for (int i = 0; i < groceryList.length; i++) {
                        if(shoppingItem.equals(groceryList[i]) && groceryList[i] != groceryList[groceryList.length -1]){
                            for (int j = i ; j < groceryList.length - 1  ; j++) {
                                groceryList[j] = groceryList[j + 1];
                            }
                            groceryList[groceryList.length - 1] = lastItem;
                        }
                    }
                    break;

            }

            input = scanner.nextLine();

        }


        System.out.println(String.join(", ",groceryList));

    }
}
