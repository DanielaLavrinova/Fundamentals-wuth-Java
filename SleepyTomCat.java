package FirstStepsInCoding;

import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysOff = Integer.parseInt(scanner.nextLine());
        int daysYear = 365;
        int workingDays = daysYear - daysOff;
        int tomsHour = daysOff * 127 + workingDays * 63;
        int hour = 0;
        int minutes = 0;


        if(tomsHour > 30000){
            tomsHour = tomsHour - 30000;
            hour = tomsHour / 60;
            minutes = tomsHour % 60;
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play",hour,minutes);
        }else {
            tomsHour = 30000 - tomsHour;
            hour = tomsHour / 60;
            minutes = tomsHour % 60;
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", hour,minutes);
        }
    }
}
