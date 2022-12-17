package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> firstPlayer = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> secondPlayer = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());




        for (int i = 0; i < firstPlayer.size(); i++) {

            if(secondPlayer.size() <= 0) {
                break;
            }
            int fPlayerCard = firstPlayer.get(i);
            int sPlayerCard = secondPlayer.get(i);



            if(fPlayerCard > sPlayerCard){
                firstPlayer.add(fPlayerCard);
                firstPlayer.add(sPlayerCard);
                firstPlayer.remove(i);
                secondPlayer.remove(i);
                i --;


            }else if(sPlayerCard > fPlayerCard){
                secondPlayer.add(sPlayerCard);
                secondPlayer.add(fPlayerCard);
                firstPlayer.remove(i);
                secondPlayer.remove(i);
                i --;

            }else {
                firstPlayer.remove(i);
                secondPlayer.remove(i);
                i --;


            }


        }


        int sum = 0;
        if(!firstPlayer.isEmpty()){
            for (int number:firstPlayer) {
                sum += number;
            }
            System.out.printf("First player wins! Sum: %d",sum);
        }else {
            for (int number:secondPlayer) {
                sum += number;
            }
            System.out.printf("Second player wins! Sum: %d",sum);
        }

    }
}
