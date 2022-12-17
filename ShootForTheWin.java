package MidExam;

import java.util.Arrays;
import java.util.Scanner;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] targetArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String input = scanner.nextLine();
        int counter = 0;

        while(!input.equals("End")){
            int index = Integer.parseInt(input);

            if(index < 0 || index >= targetArray.length || targetArray[index] == -1){
                input = scanner.nextLine();
                continue;
            }

            if(index == 0){
                for (int i = index + 1; i < targetArray.length ; i++) {
                    if(targetArray[i] != -1){
                        if(targetArray[index] >= targetArray[i] ){
                            targetArray[i] += targetArray[index];

                        }else{
                            targetArray[i] -= targetArray[index];
                        }
                    }
                }
            }else if(index == targetArray.length - 1){
                for (int i = index - 1; i >= 0 ; i--) {
                    if(targetArray[i] != -1) {
                        if (targetArray[index] >= targetArray[i]) {
                            targetArray[i] += targetArray[index];

                        } else {
                            targetArray[i] -= targetArray[index];
                        }
                    }
                }
            }else{
                for (int i = index + 1; i < targetArray.length ; i++) {
                    if(targetArray[i] != -1){
                        if(targetArray[index] >= targetArray[i] ){
                            targetArray[i] += targetArray[index];

                        }else{
                            targetArray[i] -= targetArray[index];
                        }
                    }
                }
                for (int i =index - 1; i >= 0 ; i--) {
                    if(targetArray[i] != -1) {
                        if (targetArray[index] >= targetArray[i]) {
                            targetArray[i] += targetArray[index];

                        } else {
                            targetArray[i] -= targetArray[index];
                        }
                    }
                }
            }




            targetArray[index] = -1;
            counter ++;
            input = scanner.nextLine();

        }

        System.out.printf("Shot targets: %d -> ",counter);

        for (int element:targetArray) {
            System.out.print(element + " ");
        }
    }
}
