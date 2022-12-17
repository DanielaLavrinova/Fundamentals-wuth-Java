package FirstStepsInCoding;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pagesBook = Integer.parseInt(scanner.nextLine());
        int pagesHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int hoursPerDay = (pagesBook / pagesHour) / days;
        System.out.println(hoursPerDay);

    }
}
