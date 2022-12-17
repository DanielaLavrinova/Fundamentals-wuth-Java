package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String bombDetails = scanner.nextLine();
        int specialBombNumber = Integer.parseInt(bombDetails.split(" ")[0]);
        int powerNumber = Integer.parseInt(bombDetails.split(" ")[1]);

        for (int i = 0; i < numbersList.size(); i++) {
            int currentNumber = numbersList.get(i);
            if(currentNumber == specialBombNumber){
                int startIndex = i - powerNumber;
                int endIndex = i + powerNumber;
                if(startIndex < 0){
                    startIndex = 0;
                }
                if(endIndex > numbersList.size()- 1){
                    endIndex = numbersList.size() - 1;
                }
                if(startIndex <= endIndex) {

                    for (int j = startIndex; j <= endIndex; j++) {
                        numbersList.remove(startIndex);
                    }
                }
                i = -1;
            }


        }
        int sum = 0;

        for (int i = 0; i < numbersList.size(); i++) {
            int currentNumber = numbersList.get(i);
            sum += currentNumber;

        }

        System.out.println(sum);
    }
}
