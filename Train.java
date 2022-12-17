package Arrays;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagons = Integer.parseInt(scanner.nextLine());
        int[] trainArray = new int[wagons];
        int people = 0;

        for (int i = 0; i < trainArray.length ; i++) {
            trainArray[i]= Integer.parseInt(scanner.nextLine());
            people += trainArray[i];
        }

        for (int element:trainArray) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println(people);
    }
}
