package ConditionalStatements;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double worldRecord = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double secondsPerMeter = Double.parseDouble(scanner.nextLine());

        double resistance = Math.floor(distance / 15) * 12.5;
        double ivanScore = distance * secondsPerMeter + resistance;

        if(ivanScore >= worldRecord){
            System.out.printf("No, he failed! He was %.2f seconds slower.",ivanScore - worldRecord);
        }else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",ivanScore);
        }
    }
}
