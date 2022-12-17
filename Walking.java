import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSteps = 0;
        int desireSteps = 10000;

        while (totalSteps < desireSteps){
            String input = scanner.next();
            input += scanner.nextLine();
            if(input.equals("Going home")){
                break;
            }

        }
        System.out.printf("Goal reached! Good job!%n%d steps over the goal!",(totalSteps - desireSteps));

    }
}
