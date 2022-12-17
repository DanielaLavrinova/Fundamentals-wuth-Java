package textProcessing;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger firstNUm = new BigInteger(scanner.nextLine());
        BigInteger secondNUm = new BigInteger(scanner.nextLine());

        System.out.println(firstNUm.multiply(secondNUm));
    }
}
