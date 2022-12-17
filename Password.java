import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.next();
        username += scanner.nextLine();
        String password = scanner.next();
        password += scanner.nextLine();

        String currentPassword = scanner.next();
        currentPassword += scanner.nextLine();

        while(!currentPassword.equals(password)){
            currentPassword = scanner.next();
            currentPassword += scanner.nextLine();
        }

        System.out.printf("Welcome %s!",username);
    }
}
