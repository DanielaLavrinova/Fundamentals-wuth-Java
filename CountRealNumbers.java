package mapsLabdaStreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> realNumbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble).collect(Collectors.toList());

        TreeMap<Double,Integer> numbersMap = new TreeMap<>();

        for (Double number:realNumbersList) {
            if(!numbersMap.containsKey(number)){
                numbersMap.put(number,0);
            }
            numbersMap.put(number, numbersMap.get(number) + 1);
        }

        for (Map.Entry<Double, Integer> entry: numbersMap.entrySet()) {
            System.out.printf("%.0f -> %d%n",entry.getKey(),entry.getValue());
        }

    }
}
