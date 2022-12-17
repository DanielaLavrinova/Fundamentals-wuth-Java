import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int number = scanner.nextInt();
            sum += number;

            if(number > max){
                max = number;
            }
        }

        int sumMax = sum - max;

        if (sumMax == max){
            System.out.println("Yes");
            System.out.println("Sum = " + max);
        }else {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(max -sumMax));
        }
    }
}
