package PBExams;

import java.util.Scanner;

public class MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantityMovies = Integer.parseInt(scanner.nextLine());
        double maxScore = Double.MIN_VALUE;
        double minScore = Double.MAX_VALUE;
        String maxMovie = "";
        String minMovie = "";
        double totalScore = 0;

        for (int i = 1; i <= quantityMovies ; i++) {
            String nameMovie = scanner.nextLine();
            double score = Double.parseDouble(scanner.nextLine());

            if(score > maxScore){
                maxScore = score;
                maxMovie = nameMovie;

            }

            if(score < minScore){
                minScore = score;
                minMovie = nameMovie;

            }

            totalScore += score;

        }

        System.out.printf("%s is with highest rating: %.1f%n",maxMovie,maxScore);
        System.out.printf("%s is with lowest rating: %.1f%n",minMovie,minScore);
        System.out.printf("Average rating: %.1f",totalScore / quantityMovies);

    }
}
