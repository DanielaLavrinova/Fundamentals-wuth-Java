package regex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        List<String> attackedPlanets =  new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();

        for (int i = 1; i <= number ; i++) {
            String message = scanner.nextLine();
            String messageAfterDecryption = getDecryptedMessage(message);

            Pattern pattern = Pattern.compile("@(?<planet>[A-Za-z]+)[^@!:>-]*:(?<population>[0-9]+)[^@!:>-]*!(?<attack>[AD])![^@!:>-]*\\->(?<count>[0-9]+)");
            Matcher matcher = pattern.matcher(messageAfterDecryption);

            if(matcher.find()){
                String planetName = matcher.group("planet");
                int population = Integer.parseInt(matcher.group("population"));
                String attackType = matcher.group("attack");
                int soldiersCount = Integer.parseInt(matcher.group("count"));

                if(attackType.equals("A")){

                    attackedPlanets.add(planetName);

                }else if(attackType.equals("D")){

                    destroyedPlanets.add(planetName);

                }

            }

        }

        Collections.sort(attackedPlanets);
        Collections.sort(destroyedPlanets);

        System.out.printf("Attacked planets: %d%n",attackedPlanets.size());
        attackedPlanets.forEach(name -> System.out.printf("-> %s%n",name));
        System.out.printf("Destroyed planets: %d%n",destroyedPlanets.size());
        destroyedPlanets.forEach(name-> System.out.printf("-> %s%n",name));
    }

    private static String getDecryptedMessage(String message) {
        int count = 0;
        String decryptedMessage = "";

        for (int i = 0; i < message.toCharArray().length; i++) {
            char symbol = message.charAt(i);
            switch (symbol){
                case 's':
                case 'S':
                case 't':
                case 'T':
                case 'a':
                case 'A':
                case 'r':
                case 'R':
                    count ++;
                    break;
            }
        }

        StringBuilder word = new StringBuilder();

        for (int i = 0; i < message.toCharArray().length ; i++) {
            char symbol = message.charAt(i);
            char newSymbol = (char)(symbol - count);

            word.append(newSymbol);

        }

        decryptedMessage = word.toString();

        return decryptedMessage;

    }
}
