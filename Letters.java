import java.util.Scanner;

public class Letters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        input += scanner.nextLine();

        for( int i = 0; i < input.length(); i ++){
            char letter = input.charAt(i);
            System.out.println(letter);
        }
    }
}
