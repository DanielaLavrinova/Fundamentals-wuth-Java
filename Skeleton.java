package PBExams;

import java.util.Scanner;

public class Skeleton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutes = Integer.parseInt(scanner.nextLine());
        int seconds = Integer.parseInt(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        int seconds100 = Integer.parseInt(scanner.nextLine());

        int totalTime = minutes * 60 + seconds;
        double timeSlope = (length / 120) * 2.5;
        double totalTimeMartin = ((length / 100) * seconds100) - timeSlope;

        if(totalTimeMartin <= totalTime){
            System.out.printf("Marin Bangiev won an Olympic quota!%n");
            System.out.printf("His time is %.3f.",totalTimeMartin);

        }else {
            System.out.print("No, Marin failed! ");
            System.out.printf("He was %.3f second slower.",Math.abs(totalTime - totalTimeMartin));
        }


    }
}
