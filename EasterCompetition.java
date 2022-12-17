package PBExams;

import java.util.Scanner;

public class EasterCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxPoints = Integer.MIN_VALUE;
        String maxName = "";

        int easterBread = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= easterBread ; i++) {
            int totalPoints = 0;
            String name = scanner.nextLine();
            String input = scanner.nextLine();


            while (!input.equals("Stop")) {
                int score = Integer.parseInt(input);

                totalPoints += score;

                input = scanner.nextLine();
            }

            System.out.printf("%s has %d points.%n",name,totalPoints);

            if(totalPoints > maxPoints){
                maxPoints = totalPoints;
                System.out.printf("%s is the new number 1!%n",name);
                maxName = name;

            }

        }

        System.out.printf("%s won competition with %d points!",maxName,maxPoints);
    }
}
