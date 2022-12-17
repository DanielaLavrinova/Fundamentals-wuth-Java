package FirstStepsInCoding;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double degreeC = Double.parseDouble(scanner.nextLine());
        double degreeF = degreeC * 1.8000 + 32.00;

        System.out.printf("%.2f",degreeF);

    }
}
