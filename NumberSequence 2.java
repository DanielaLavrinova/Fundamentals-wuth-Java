import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int smallest = Integer.MAX_VALUE;
        int biggest = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int number = scanner.nextInt();
            if (number > biggest) {
                biggest = number;
            }
            if ( number < smallest) {
               smallest = number;
            }
        }

            System.out.println("Max number: " + biggest);
            System.out.println("Min number: " + smallest);

        }
    }

