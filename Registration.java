package retakeFinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Pattern pattern = Pattern.compile("U\\$(?<username>[A-Z][a-z]{2,})U\\$P@\\$(?<password>[A-Za-z]{5,}[0-9]+)P@\\$");
            Matcher matcher = pattern.matcher(input);

            if(matcher.find()){
                String name = matcher.group("username");
                String password = matcher.group("password");
                System.out.println("Registration was successful");
                System.out.printf("Username: %s, Password: %s%n",name,password);
                counter ++;

            }else{
                System.out.println("Invalid username or password");

            }
        }

        System.out.printf("Successful registrations: %d",counter);
    }
}
