package Methods;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fNumber = Integer.parseInt(scanner.nextLine());
        int sNumber = Integer.parseInt(scanner.nextLine());
        int tNumber = Integer.parseInt(scanner.nextLine());

        int sum = subtractNumbers(fNumber,sNumber,tNumber);

        System.out.println(sum);

    }

    public static int addNumbers(int fNumber, int sNumber,int tNumber){
        int sum = fNumber + sNumber;

        return sum;
    }

    public static int subtractNumbers(int fNumber,int sNumber,int tNumber){
        int sum = addNumbers(fNumber,sNumber,tNumber);
        sum -= tNumber;

        return  sum;

    }
}
