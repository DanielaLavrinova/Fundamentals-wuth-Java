import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTournaments = scanner.nextInt();
        int points = scanner.nextInt();
        int pointsTournament = 0;
        int finalPoints = 0;
        double averagePoints = 0;
        double counter = 0;
        double percentWin = 0;

        for (int i = 1; i <= numTournaments ; i++) {
            String tournamentPlace = scanner.next();
            tournamentPlace += scanner.nextLine();

            switch(tournamentPlace){
                case "W":
                    pointsTournament += 2000;
                    counter ++;
                    break;
                case "F":
                    pointsTournament += 1200;
                    break;
                case "SF":
                    pointsTournament += 720;
                    break;

            }
        }

        finalPoints = points + pointsTournament;
        averagePoints =Math.floor( pointsTournament / numTournaments);
        percentWin = (counter / numTournaments) * 100;

        System.out.printf("Final points: %d%n",finalPoints);
        System.out.printf("Average points: %.0f%n", averagePoints);
        System.out.printf("%.2f%%%n",percentWin);
    }
}
