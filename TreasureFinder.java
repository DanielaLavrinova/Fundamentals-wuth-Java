package textProcessing;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TreasureFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] keyArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        String data = scanner.nextLine();

        while(!data.equals("find")){

            String decryptedMassage = getDecryptedMassage(keyArray,data);


            Pattern patternType = Pattern.compile("&(?<type>\\w+)&");
            Matcher matcherType = patternType.matcher(decryptedMassage);
            String type = "";

            if(matcherType.find()){
                type = matcherType.group("type");
            }

            Pattern patternCoordinates = Pattern.compile("<(?<coordinates>[A-Za-z0-9]+)>");
            Matcher matcherCoordinates = patternCoordinates.matcher(decryptedMassage);
            String coordinates = "";

            if(matcherCoordinates.find()){
                coordinates = matcherCoordinates.group("coordinates");
            }

            System.out.printf("Found %s at %s%n",type,coordinates);


            data = scanner.nextLine();

        }
    }

    private static String getDecryptedMassage(int[] keysArray,String data) {
        StringBuilder massage = new StringBuilder();

        for (int i = 0,j = 0; i < data.length(); i++,j++) {
            char symbol = data.charAt(i);

            if(j > keysArray.length - 1){
                j = 0;
            }

            int number = keysArray[j];

            symbol -= number;

            massage.append(symbol);

        }

        String decryptedMassage = massage.toString();

        return  decryptedMassage;
    }
}
