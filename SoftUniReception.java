package MidExam;

import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstEmployee = Integer.parseInt(scanner.nextLine());
        int secondEmployee = Integer.parseInt(scanner.nextLine());
        int thirdEmployee = Integer.parseInt(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        int counterHours = 0;

        int studentsPerHour = firstEmployee + secondEmployee + thirdEmployee;

        while(students > 0){
            counterHours  ++ ;
            students -= studentsPerHour;

            if(counterHours % 4 == 0){
                counterHours ++;
            }
        }

        System.out.printf("Time needed: %dh.",counterHours);

    }
}
