package MidExam;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int[] wagonsArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int length = wagonsArray.length;
        int sumPeople = 0;
        int capacity = 0;

        for (int i = 0; i < wagonsArray.length ; i++) {
            int element = wagonsArray[i];
            sumPeople += element;
        }

        capacity = (length * 4) - sumPeople;

        if(people > capacity){
            System.out.printf("There isn't enough space! %d people in a queue!%n",people - capacity);

        }else if(people < capacity && people > 0) {     //!=
            System.out.println("The lift has empty spots!");
        }

        if(people <= 0){
            for (int element:wagonsArray) {
                System.out.print(element + " ");
            }
        }else {
            people += sumPeople;

            for (int i = 0; i < wagonsArray.length; i++) {

                if (people >= 4) {
                    wagonsArray[i] = 4;
                } else {
                    wagonsArray[i] = people;
                }
                people -= 4;
                if (people <= 0) {
                    break;
                }
            }

            for (int element : wagonsArray) {
                System.out.print(element + " ");
            }

        }

    }
}
