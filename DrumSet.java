package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DrumSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double savings = Double.parseDouble(scanner.nextLine());
        List<Integer> drumSet = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> initialDrum = new ArrayList<>();

        for (int number:drumSet) {
            initialDrum.add(number);
        }

        String input = scanner.nextLine();

        while(!input.equals("Hit it again, Gabsy!")){
            int power = Integer.parseInt(input);

            for (int i = 0; i < drumSet.size(); i++) {
                int newDrum = drumSet.get(i);
                double priceDrum = initialDrum.get(i)* 3;
                int element = initialDrum.get(i);
                newDrum -= power;
                drumSet.set(i,newDrum);
                if(newDrum <= 0 && savings >= priceDrum){
                    savings -= priceDrum;
                    drumSet.set(i,element);
                }else if(newDrum <= 0 && savings < priceDrum){
                    drumSet.remove(i);
                    initialDrum.remove(i);
                    i --;
                }

            }

            input = scanner.nextLine();

        }

        System.out.println(drumSet.toString().replaceAll("[\\[\\],]",""));

        System.out.printf("Gabsy has %.2flv.",savings);
    }
}
