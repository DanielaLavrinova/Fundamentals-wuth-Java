package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        sumFirstLastElement(numbersList);


    }

    public static void sumFirstLastElement(List<Integer> numbersList){
        int size = numbersList.size();

        for (int i = 0; i < size/2; i++) {
            int firstNum = numbersList.get(i);
            int secondNum = numbersList.get(numbersList.size()- 1);

            int newNum = numbersList.set(i,firstNum + secondNum);
            numbersList.remove(numbersList.size()-1);
        }

        System.out.println(numbersList.toString().replaceAll("[\\[\\],]",""));

    }
}
