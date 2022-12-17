package textProcessing;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {
            String input = scanner.nextLine();

            Pattern patternN = Pattern.compile("@(?<name>[A-Za-z]+)\\|");
            Matcher matcherN = patternN.matcher(input);
            Pattern patternA = Pattern.compile("#(?<age>\\d+)\\*");
            Matcher matcherA = patternA.matcher(input);

            while(matcherN.find() && matcherA.find()){
                String name = matcherN.group("name");
                String age = matcherA.group("age");

                System.out.printf("%s is %s years old.%n",name,age);
            }

        }
    }
}
