import java.util.Scanner;

public class ConcatenateDate {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.next();
        firstName+= scanner.nextLine();
        String lastName = scanner.next();
        lastName+= scanner.nextLine();
        int age = scanner.nextInt();
        String town = scanner.next();
        town+= scanner.nextLine();
        System.out.printf("You are %s %s, a %d-years old person from %s.", firstName,lastName,age,town);

    }
}
