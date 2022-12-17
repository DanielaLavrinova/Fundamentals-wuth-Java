package NestedLoops;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalAssessment = 0;
        int counterScore = 0;

        int judge = Integer.parseInt(scanner.nextLine());
        String namePresentation = scanner.nextLine();

        while (!namePresentation.equals("Finish")){
            double totalScore = 0;
            double averageScore = 0;

            for (int i = 1; i <= judge ; i++) {
                double score = Double.parseDouble(scanner.nextLine());
                totalScore += score;
                totalAssessment += score;
                counterScore ++;
            }
            averageScore = totalScore / judge;
            System.out.printf("%s - %.2f.%n",namePresentation,averageScore);


            namePresentation = scanner.nextLine();

        }

        System.out.printf("Student's final assessment is %.2f.",totalAssessment / counterScore);

    }
}
