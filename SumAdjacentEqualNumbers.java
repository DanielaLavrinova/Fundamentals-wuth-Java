package Lists;

import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble).collect(Collectors.toList());

        for (int i = 0; i < numbersList.size() - 1; i++) {
            double firstItem = numbersList.get(i);
            double secondItem = numbersList.get(i + 1);

            if(firstItem == secondItem){
                numbersList.set(i,firstItem + secondItem);
                numbersList.remove(i + 1);

                i = -1;
            }
        }

        String result = joinElementsByDelimiter(numbersList," ");
        System.out.println(result);


    }

    public static String joinElementsByDelimiter(List<Double> numbersList,String delimiter){
        String result = "";
        DecimalFormat df = new DecimalFormat("0.#");

        for (Double element :numbersList) {
            result += df.format(element) + delimiter;

        }

        return  result;

    }
}
