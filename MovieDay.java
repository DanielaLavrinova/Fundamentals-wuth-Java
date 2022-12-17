package PBExams;

import java.util.Scanner;

public class MovieDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int time = Integer.parseInt(scanner.nextLine());
        int actions = Integer.parseInt(scanner.nextLine());
        int timeAction = Integer.parseInt(scanner.nextLine());

        double preparation = time * 0.15;
        double totalTime = preparation + (actions * timeAction);

        if(totalTime <= time){
            System.out.printf("You managed to finish the movie on time! You have %d minutes left!",Math.round(time - totalTime));
        }else {
            System.out.printf("Time is up! To complete the movie you need %d minutes.",Math.round(totalTime - time));
        }

    }
}
