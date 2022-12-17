import java.util.Scanner;

public class Books {
    public static void main(String[] args) {

        System.out.print("Please insert book's pages: ");
        Scanner scanner = new Scanner(System.in);
        int pagesBook = scanner.nextInt();
        System.out.print("Please insert hours: ");
        int pagesHours = scanner.nextInt();
        System.out.print("Please insert days: ");
        int days = scanner.nextInt();
        int totalHours = pagesBook/pagesHours;
        int totalDays = totalHours/days;
        System.out.print(totalDays);

    }
}
