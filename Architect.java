import java.util.Scanner;

public class Architect {

    public static void main(String[] args) {

        System.out.print("Insert architect's name: ");
        Scanner scanner = new Scanner(System.in);
        String nameArchitect = scanner.nextLine();
        System.out.print("Insert project numbers: ");
        int projectNumber = scanner.nextInt();
        int hours = projectNumber * 3;

        System.out.printf("The architect %s will need %d hours to complete %d projects ",nameArchitect,hours,projectNumber);

    }
}
