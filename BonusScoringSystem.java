package MidExam;

import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberStudents = Integer.parseInt(scanner.nextLine());
        int lectures = Integer.parseInt(scanner.nextLine());
        int bonus = Integer.parseInt(scanner.nextLine());
        double maxBonus = Double.MIN_VALUE;
        int maxAttendance = 0;

        for (int i = 0; i < numberStudents ; i++) {
            int attendance = Integer.parseInt(scanner.nextLine());
            double totalBonus = (attendance * 1.00 / lectures) * (5 + (bonus));

            if(totalBonus > maxBonus){
                maxBonus = totalBonus;
                maxAttendance = attendance;
            }

        }
        maxBonus = Math.round(maxBonus);

        System.out.printf("Max Bonus: %.0f.%n",maxBonus);
        System.out.printf("The student has attended %d lectures.",maxAttendance);

    }
}
