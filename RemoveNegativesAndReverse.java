package Lists;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        removeNegativeNumbers(numbersList);

    }

    public static void removeNegativeNumbers(List<Integer> numbersList){
        numbersList.removeIf(e-> e < 0);

        if(numbersList.isEmpty()){
            System.out.println("empty");
        }else{
            Collections.reverse(numbersList);
            System.out.println(numbersList.toString().replaceAll("[\\[\\],]",""));
        }

    }
}
