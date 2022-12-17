package regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<String> furnitureList = new ArrayList<>();

        String regex = ">>(?<name>[A-Za-z]+)<<(?<price>\\d+.?\\d*)!(?<quantity>\\d+)";
        Pattern pattern = Pattern.compile(regex);

        double totalPrice = 0;


        while(!input.equals("Purchase")){
            Matcher matcher = pattern.matcher(input);
            double currentPrice = 0;

            if(matcher.find()){
                String name = matcher.group("name");
                int quantity = Integer.parseInt(matcher.group("quantity"));
                double price = Double.parseDouble(matcher.group("price"));

                currentPrice = quantity * price;
                totalPrice += currentPrice;

                furnitureList.add(name);

            }


            input = scanner.nextLine();

        }

        System.out.println("Bought furniture:");

        furnitureList.forEach(System.out::println);

        System.out.printf("Total money spend: %.2f",totalPrice);
    }
}
