package finalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int totalFood = 0;

        Pattern pattern = Pattern.compile("(?<symbols>[\\|\\#])(?<name>[A-Za-z\\s]+)(\\1)(?<date>\\d{2}\\/\\d{2}\\/\\d{2})(\\1)(?<calories>\\d{0,5})(\\1)");
        Matcher matcher = pattern.matcher(text);

        Map<String,Map<String,Integer>> productMap = new LinkedHashMap<>();

        while(matcher.find()){
            String foodName = matcher.group("name");
            String date = matcher.group("date");
            int calories = Integer.parseInt(matcher.group("calories"));

            Map<String,Integer> dataMap = new LinkedHashMap<>();

            dataMap.putIfAbsent(date,calories);
            productMap.putIfAbsent(foodName,dataMap);

            totalFood += calories;

        }

        int days = totalFood / 2000;

        System.out.printf("You have food to last you for: %d days!%n",days);

        productMap.entrySet().forEach(e->{
            System.out.printf("Item: %s, ",e.getKey());
            e.getValue().entrySet().forEach(element ->{
                System.out.printf("Best before: %s, Nutrition: %d%n",element.getKey(),element.getValue());
            });
        });

    }
}
