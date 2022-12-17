package regex;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] demons = scanner.nextLine().split(",\\s+");
        Map<String,Map<Integer,Double>> demonsMap = new LinkedHashMap<>();

        for (int i = 0; i < demons.length; i++) {
            String element = demons[i].replaceAll(" ","");
            element = element.replaceAll(",","");

            Pattern patternHealth = Pattern.compile("[^\\+\\/\\-\\*\\.\\d]");
            Matcher matcherHealth = patternHealth.matcher(element);
            StringBuilder name = new StringBuilder();

            while(matcherHealth.find()){

                name.append(matcherHealth.group());

            }

            int health = getHealth(name);

          Pattern patternNumbers = Pattern.compile("(-?\\d*\\.?\\d+)");
          Matcher matcherNumbers = patternNumbers.matcher(element);

          double damageSum = 0;

          while(matcherNumbers.find()){
              damageSum += Double.parseDouble(matcherNumbers.group());
          }

          Pattern symbolsPattern = Pattern.compile("[\\/\\*]");
          Matcher symbolsMatcher = symbolsPattern.matcher(element);

          while(symbolsMatcher.find()){
              String sign = symbolsMatcher.group();

              if(sign.equals("*")){
                  damageSum = damageSum * 2;

              }else if(sign.equals("/")){
                  damageSum = damageSum /2;
              }
          }
          Map<Integer,Double> demonsData = new LinkedHashMap<>();
          demonsData.put(health,damageSum);

          demonsMap.put(element,demonsData);

        }

        demonsMap.entrySet().forEach(e->{

            System.out.printf("%s - ",e.getKey());
            e.getValue().entrySet().forEach(element->
            System.out.printf("%d health, %.2f damage%n",element.getKey(),element.getValue()));

        });

    }

    private static int getHealth(StringBuilder name) {
        String currentName = name.toString();
        int sum = 0;

        for (int i = 0; i < currentName.length(); i++) {
            char symbol = currentName.charAt(i);
            int number = symbol;

            sum += number;

        }

        return sum;
    }
}
