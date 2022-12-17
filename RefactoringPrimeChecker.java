import java.util.Scanner;

public class RefactoringPrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 2; i <= number ; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2 ; j++) {
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){

            System.out.printf("%d -> true%n",i);

            }else{
                System.out.printf("%d -> false%n",i);
            }

        }
    }
}
