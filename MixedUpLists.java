package Lists;

import java.util.*;
import java.util.stream.Collectors;

public class MixedUpLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());


        List<Integer>resultList = new ArrayList<>();
        int startNumber = 0;
        int endNumber = 0;
        Collections.reverse(secondList);

        if(firstList.size() > secondList.size()){
            startNumber = firstList.get(firstList.size()- 2);
            endNumber = firstList.get(firstList.size()- 1);
            firstList.remove(firstList.size()- 1);
            firstList.remove(firstList.size()- 1);
        }else if(firstList.size() < secondList.size()){
            startNumber = secondList.get(secondList.size() - 2);
            endNumber = secondList.get(secondList.size() - 1);
            secondList.remove(secondList.size() - 1);
            secondList.remove(secondList.size() - 1);
        }


        int minSize = Integer.min(firstList.size(), secondList.size());

        for (int i = 0; i < minSize ; i++) {
            resultList.add(firstList.get(i));
            resultList.add(secondList.get(i));

        }

        List<Integer> numbersList = new ArrayList<>();
        int minNumber = Integer.min(startNumber,endNumber);
        int maxNumber = Integer.max(startNumber,endNumber);

        for (int i = 0; i < resultList.size(); i++) {
           int element = resultList.get(i);
           if(element > minNumber && element < maxNumber){
               numbersList.add(element);
           }
        }

        Collections.sort(numbersList);

        for (int element:numbersList) {
            System.out.print(element + " ");
        }

        System.out.println();

    }
}
