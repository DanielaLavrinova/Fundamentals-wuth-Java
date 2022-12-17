import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number ; i++) {
            int currentNum = i;
            int sum  = 0;

            while(currentNum > 0){
                int digit = currentNum % 10;
                sum += digit;
                currentNum = currentNum / 10;

            }

            boolean isTrue = sum == 5 || sum == 7 || sum == 11;
            if(isTrue){
                System.out.printf("%d -> True%n",i);
            }else {
                System.out.printf("%d -> False%n",i);
            }

        }
    }
}
