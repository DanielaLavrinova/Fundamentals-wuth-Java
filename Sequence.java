import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int currentNumber = 1;

        while(currentNumber <= number){
            System.out.println(currentNumber);
            currentNumber = currentNumber * 2 + 1;

        }
    }
}
