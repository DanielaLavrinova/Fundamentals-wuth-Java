package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String[] inputArray = scanner.nextLine().split(" ");
        String command = inputArray[0];

        while(!command.equals("end")){

            switch (command){
                case "swap":
                    int firstIndex =Integer.parseInt(inputArray[1]);
                    int secondIndex =Integer.parseInt(inputArray[2]);
                    int firstElement = numbersArray[firstIndex];
                    int secondElement = numbersArray[secondIndex];
                    numbersArray[firstIndex]= secondElement;
                    numbersArray[secondIndex] = firstElement;
                    break;
                case "multiply":
                    int firstIndexM =Integer.parseInt(inputArray[1]);
                    int secondIndexM =Integer.parseInt(inputArray[2]);
                    int firstElementM = numbersArray[firstIndexM];
                    int secondElementM = numbersArray[secondIndexM];
                    numbersArray[firstIndexM]=firstElementM * secondElementM;
                    break;
                case "decrease":
                    for (int i = 0; i < numbersArray.length; i++) {
                        numbersArray[i] = numbersArray[i] - 1;
                    }
                    break;
            }
            inputArray = scanner.nextLine().split(" ");
            command = inputArray[0];

        }
        for (int i = 0;i < numbersArray.length - 1;i ++) {
            System.out.print(numbersArray[i] + ", ");
        }
        System.out.print(numbersArray[numbersArray.length-1]);
    }
}
