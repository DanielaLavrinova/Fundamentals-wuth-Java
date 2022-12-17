package finalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String data = scanner.nextLine();

        List<String> locationsList = new ArrayList<>();

        Pattern pattern = Pattern.compile("([=|\\/])(?<destination>[A-Z][A-Za-z]{2,})(\\1)");
        Matcher matcher = pattern.matcher(data);

        while(matcher.find()){
            String destination = matcher.group("destination");
            locationsList.add(destination);
        }

        int travelPoints = 0;
        for (String destination:locationsList) {

            int length = destination.length();
            travelPoints += length;

        }

        System.out.print("Destinations: ");
        System.out.println(String.join(", ",locationsList));
        System.out.printf("Travel Points: %d",travelPoints);
    }

}
