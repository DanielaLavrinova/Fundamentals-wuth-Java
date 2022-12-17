package ForLoop;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int judgeNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= judgeNumber ; i++) {
            String nameJudge = scanner.nextLine();
            double pointsJudge = Double.parseDouble(scanner.nextLine());

            int length = nameJudge.length();

            academyPoints = academyPoints + ((length * pointsJudge) / 2);

            if(academyPoints > 1250.50){
                break;
            }

        }

        if(academyPoints > 1250.50){
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!",actorName,academyPoints);
        }else {
            System.out.printf("Sorry, %s you need %.1f more!",actorName,(1250.50 - academyPoints));
        }

    }
}
