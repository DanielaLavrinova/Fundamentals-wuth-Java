import java.util.Scanner;

public class LunchBreak {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        name += scanner.nextLine();
        double lengthMovie = scanner.nextDouble();
        double lengthBreak = scanner.nextDouble();
        double lunch = lengthBreak * 1/8;
        double relax = lengthBreak * 1/4;
        double timeLeft =lengthBreak - lunch - relax;

        if(timeLeft >= lengthMovie){
            double time = Math.ceil(timeLeft - lengthMovie);
            int time1 = (int) time;
            System.out.printf("You have enough time to watch %s and left with %d minutes free time.",name,time1);
        }else if(timeLeft < lengthMovie){
            double time = Math.ceil(lengthMovie - timeLeft);
            int time1 = (int)time;
            System.out.printf("You don't have enough time to watch %s, you need %d more minutes.",name,time1);
        }
    }
}
