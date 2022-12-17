package finalExam;

import java.util.Scanner;

public class SinoTheWalker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String timeOfLeaving = scanner.nextLine();
        long steps = Long.parseLong(scanner.nextLine()) ;
        long timeForStep = Long.parseLong(scanner.nextLine()) ;

        long hours = Long.parseLong(timeOfLeaving.split(":")[0]);
        long minutes = Long.parseLong(timeOfLeaving.split(":")[1]);
        long seconds = Long.parseLong(timeOfLeaving.split(":")[2]);

        long timeToAdd = steps * timeForStep;

        seconds += timeToAdd;
        long hoursToAdd = 0;

        if(seconds > 59){
            long minToAdd = seconds / 60;
            long secToAdd = seconds % 60;
            minutes += minToAdd;

            if(minutes > 59){
                hoursToAdd = minutes / 60;
                minutes = minutes % 60;
            }
            hours += hoursToAdd;
            hours = hours % 24;
            seconds = secToAdd;
        }

        if(hours > 23){
            hours -= 24;
        }

        System.out.printf("Time Arrival: %02d:%02d:%02d",hours,minutes,seconds);
    }
}
