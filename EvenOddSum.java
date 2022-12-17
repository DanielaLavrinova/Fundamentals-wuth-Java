import java.util.Scanner;

public class EvenOddSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int evenSum = 0;
        int oddSum = 0;

        for(int i = 1; i <= n; i ++){
            int number = scanner.nextInt();

            if(i % 2 == 0){
                evenSum += number;
            }else {
                oddSum += number;
            }
        }

        if (oddSum == evenSum) {
            System.out.println("Yes");
            System.out.println("Sum = " + oddSum);
        }else {
            System.out.println("No");
            System.out.println("Diff = " + (Math.abs(oddSum - evenSum)));
        }
    }
}
