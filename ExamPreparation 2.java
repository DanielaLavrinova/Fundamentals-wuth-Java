import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        int counter = 0;
        int totalScore = 0;
        int countTask = 0;
        boolean isFailed = false;
        String lastName = "";

        while(counter < score){
            String nameTask = scanner.next();
            nameTask += scanner.nextLine();

            if(nameTask.equals("Enough")){
                isFailed = true;
                break;
            }
            int scoreTask = scanner.nextInt();

            if(scoreTask <= 4){
                counter ++;
            }

            totalScore += scoreTask;
            countTask ++;
            lastName = nameTask;
        }
        double averageScore = (totalScore * 1.0) / countTask;
        if(isFailed){
            System.out.printf("Average score: %.2f%n",averageScore);
            System.out.printf("Number of problems: %d%n",countTask);
            System.out.printf("Last problem: %s%n",lastName);
        }else {
            System.out.printf("You need a break, %d poor grades.",counter);
        }
    }
}
