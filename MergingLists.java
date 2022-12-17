package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        mergeTwoLists(firstList,secondList);


    }

    public static void mergeTwoLists(List<Integer> firstList,List<Integer> secondList){
        int size = Math.min(firstList.size(),secondList.size());

        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            resultList.add(firstList.get(i));
            resultList.add(secondList.get(i));

        }

        if(firstList.size() > secondList.size()){
            for (int i = size; i < firstList.size()  ; i++) {
                resultList.add(firstList.get(i));
            }
        }else if(secondList.size() > firstList.size()) {
            for (int i = size; i < secondList.size(); i++) {
                resultList.add(secondList.get(i));
            }
        }

        System.out.println(resultList.toString().replaceAll("[\\[\\],]",""));
    }
}
