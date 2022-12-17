import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String output = scanner.nextLine();
        int length = output.length();
        int number = Integer.parseInt(output);
        int currentNum = number;
        int totalSum = 0;

        for (int i = 1; i <= length ; i++) {
            int num = number % 10;
            int sum = 1;

            for (int j = 1; j <= num ; j++) {
                sum *= j;
            }
            totalSum += sum;
            number = number / 10;

        }

        if(totalSum == currentNum){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
