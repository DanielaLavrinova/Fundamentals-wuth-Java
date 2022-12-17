import java.util.Scanner;

public class DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < n ; i++) {
            char letter = scanner.nextLine().charAt(0);
            char symbol = (char) (letter + key);
            word.append(symbol);

        }
        System.out.print(word);
    }
}
