package PBExams;

import java.util.Scanner;

public class MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double worldRecord = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double time = Double.parseDouble(scanner.nextLine());

        double georgeTime = distance * time;
        double timeLate = Math.floor(distance / 50) * 30;

        double totalTime = georgeTime + timeLate;

        if(totalTime < worldRecord){
            System.out.printf("Yes! The new record is %.2f seconds.",totalTime);
        }else {
            System.out.printf("No! He was %.2f seconds slower.",totalTime - worldRecord);
        }

    }
}
