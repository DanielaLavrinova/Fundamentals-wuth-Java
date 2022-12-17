import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int numberStart = Integer.parseInt(scanner.nextLine());

        if(numberStart > 10){
            System.out.printf("%d X %d = %d%n",number,numberStart,number * numberStart);
        }else {
            for (int i = numberStart; i <= 10; i++) {
                int result = number * i;
                System.out.printf("%d X %d = %d%n", number, i, result);

            }
        }

    }
}
