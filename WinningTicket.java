package regex;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class WinningTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> ticketsList = Arrays.stream(scanner.nextLine().split("\\s*,+\\s*"))
                .collect(Collectors.toList());

        for (int i = 0; i < ticketsList.size(); i++) {
            String currentTicket = ticketsList.get(i);



            if(currentTicket.length() == 20){
                String firstPart = currentTicket.substring(0,10);
                String secondPart = currentTicket.substring(10);
                Pattern pattern = Pattern.compile("([$|@|#\\^])\\1{5,10}");
                Matcher matcherFirstPart = pattern.matcher(firstPart);
                Matcher matcherSecondPart = pattern.matcher(secondPart);


                if(matcherFirstPart.find() && matcherSecondPart.find()){
                    Pattern patternJackpot = Pattern.compile("^([$|@|#\\^])\\1{9}$");
                    Matcher matcherJackpot1 = patternJackpot.matcher(firstPart);
                    Matcher matcherJackpot2 = patternJackpot.matcher(secondPart);
                    if(matcherJackpot1.find() && matcherJackpot2.find()){
                        char symbol = firstPart.charAt(0);
                        System.out.printf("ticket \"%s\" - 10%s Jackpot!%n",currentTicket,symbol);
                    }else{
                        String symbolToCount1 = matcherFirstPart.group();
                        String symbolToCount2 = matcherSecondPart.group();
                        char symbol1 = symbolToCount1.charAt(4);
                        char symbol2 = symbolToCount2.charAt(4);
                        int lengthFirst = symbolToCount1.length();
                        int lengthSecond = symbolToCount2.length();


                        if(symbol1 == symbol2 ){

                            System.out.printf("ticket \"%s\" - %d%s%n",currentTicket,Math.min(lengthFirst,lengthSecond),symbol1);

                        }else{
                            System.out.printf("ticket \"%s\" - no match%n",currentTicket);
                        }

                    }

                }else{
                    System.out.printf("ticket \"%s\" - no match%n",currentTicket);
                }

            }else{
                System.out.println("invalid ticket");
            }

            //&& lengthFirst == lengthSecond
        }
    }
}
