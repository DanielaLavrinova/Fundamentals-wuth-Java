package FirstStepsInCoding;

import java.util.Scanner;

public class RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radians = Double.parseDouble(scanner.nextLine());

        double gradus = radians * 180 / Math.PI;

        System.out.println(gradus);
    }
}
