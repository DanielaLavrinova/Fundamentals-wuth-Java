package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String data = scanner.nextLine();

        double income = 0;

        Pattern pattern = Pattern.compile("^%(?<customer>[A-Z][a-z]+)%[^\\|$%.]*<(?<product>\\w+)>[^\\|$%.]*\\|(?<count>[0-9]+)\\|[^\\|$%.]*?(?<price>\\d+.?\\d+)\\$$");


        while(!data.equals("end of shift")){
            Matcher matcher = pattern.matcher(data);

            if(matcher.find()){
                String customer = matcher.group("customer");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));

                double sum = count * price;

                income += sum;

                System.out.printf("%s: %s - %.2f%n",customer,product,sum);

            }


            data = scanner.nextLine();

        }

        System.out.printf("Total income: %.2f",income);
    }
}
