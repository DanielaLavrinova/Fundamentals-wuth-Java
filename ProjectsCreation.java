package FirstStepsInCoding;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int projectNumbers = Integer.parseInt(scanner.nextLine());

        int projectHours = projectNumbers * 3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.",name,projectHours,projectNumbers);

    }
}
