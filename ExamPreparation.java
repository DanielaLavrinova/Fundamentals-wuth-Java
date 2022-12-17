package WhileLoop;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int unScore = Integer.parseInt(scanner.nextLine());
        double averageScore = 0;
        int numTasks = 0;
        String lastProblem = "";
        int counter = 0;
        boolean isFailed = false;

        String taskName = scanner.nextLine();


        while(!taskName.equals("Enough")){
            int score = Integer.parseInt(scanner.nextLine());
            averageScore += score;
            numTasks ++;
            if (score <= 4){
                counter ++;
            }

            if(counter >= unScore){
                isFailed = true;
                break;
            }
            lastProblem = taskName;
            taskName = scanner.nextLine();

        }

        if(isFailed){
            System.out.printf("You need a break, %d poor grades.",counter);
        }else {
            System.out.printf("Average score: %.2f%n",averageScore / numTasks);
            System.out.printf("Number of problems: %d%n",numTasks);
            System.out.printf("Last problem: %s",lastProblem);
        }

    }
}
