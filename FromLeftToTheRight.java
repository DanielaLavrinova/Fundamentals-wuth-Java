import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number ; i++) {
            String input = scanner.nextLine();
            String [] split = input.split("\\s");
            long leftNum = Long.parseLong(split[0]);
            long rightNum = Long.parseLong(split[1]);
            long currentLNum = Math.abs(leftNum);
            long currentRNum = Math.abs(rightNum);
            long leftSum = 0;
            long rightSum = 0;
            while(currentLNum > 0){
                long digit = currentLNum % 10;
                leftSum += digit;
                currentLNum /= 10;

            }
            while(currentRNum > 0){
                long digit = currentRNum % 10;
                rightSum += digit;
                currentRNum /= 10;

            }

            if(leftNum > rightNum){
                System.out.println(Math.abs(leftSum));
            }else {
                System.out.println(Math.abs(rightSum));
            }


        }
    }
}
