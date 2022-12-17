package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scanner.nextLine());
        String indexes = scanner.nextLine();
        String command = scanner.nextLine();
        int[] indexesArrays = Arrays
                .stream(indexes.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] fieldArrays = new int[fieldSize];

        for (int i = 0; i < indexesArrays.length; i++) {
            int element = indexesArrays[i];

            if(element >= 0 && element < fieldArrays.length){
                fieldArrays[element] = 1;
            }
        }

        while(!command.equals("end")){
            String[] elementArray = command.split(" ");
            int firstIndex = Integer.parseInt(elementArray[0]);
            String direction = elementArray[1];
            int flyNumber = Integer.parseInt(elementArray[2]);

            if( firstIndex < 0 || firstIndex >= fieldArrays.length || fieldArrays[firstIndex] !=1 ){

                command = scanner.nextLine();
                continue;
            }

            fieldArrays[firstIndex] = 0;

            if(direction.equals("right")){

                firstIndex += flyNumber;

                while(firstIndex < fieldArrays.length && fieldArrays[firstIndex] == 1){
                    firstIndex += flyNumber;
                }

                if(firstIndex < fieldArrays.length){
                    fieldArrays[firstIndex] = 1;
                }

            }else if(direction.equals("left")){
                firstIndex -= flyNumber;


                while(firstIndex >= 0 && fieldArrays[firstIndex] == 1){
                    firstIndex -= flyNumber;
                }

                if(firstIndex >= 0 ){
                    fieldArrays[firstIndex] = 1;
                }

            }


            command = scanner.nextLine();

        }


        for (int element:fieldArrays) {
            System.out.print(element + " ");
        }

    }
}
