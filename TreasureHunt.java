package Arrays;

import java.util.Scanner;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] treasureArray = scanner.nextLine().split("\\|");

        String command = scanner.nextLine();

        while(!command.equals("Yohoho!")){
            String[] commandType = command.split(" ");
            String type = commandType[0];

            switch (type){

                case "Loot":
                    for (int i = 1; i < commandType.length; i++) {
                        boolean isEqual = false;
                        for (int j = 0; j < treasureArray.length; j++) {
                            if(commandType[i].equals(treasureArray[j])){
                                isEqual = true;
                                break;
                            }
                        }
                        if(!isEqual){
                            String additionalArray = commandType[i] + " " + String.join(" ",treasureArray);
                            treasureArray = additionalArray.split( " ");
                        }

                    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(commandType[1]);

                    if(index >= 0 && index < treasureArray.length){
                        String element = treasureArray[index];

                        for (int i = index; i < treasureArray.length-1 ; i++) {
                            treasureArray [i]= treasureArray[i + 1];
                        }
                        treasureArray[treasureArray.length - 1] = element;

                    }
                    break;
                case "Steal":
                    int count = Integer.parseInt(commandType[1]);
                    int length = treasureArray.length;

                    if(count > length){
                        count = length;

                    }

                    for (int i = treasureArray.length- count; i < treasureArray.length - 1 ; i++) {
                        System.out.print(treasureArray[i]+ ", ");
                    }
                    System.out.println(treasureArray[treasureArray.length-1]);

                    String[] arrayRemovedLoot = new String[treasureArray.length - count];

                    for (int i = 0; i < arrayRemovedLoot.length; i++) {
                        arrayRemovedLoot[i] = treasureArray[i];
                    }

                    treasureArray = arrayRemovedLoot;

                    break;

            }

            command = scanner.nextLine();

        }
        double sum = 0;
        int arrLength = treasureArray.length;
        for (int i = 0; i < treasureArray.length ; i++) {
            int elementLength = treasureArray[i].length();
            sum += elementLength;
        }

        if(sum == 0){
            System.out.println("Failed treasure hunt.");
        }else {
            System.out.printf("Average treasure gain: %.2f pirate credits.",sum  / arrLength);
        }

    }
}

