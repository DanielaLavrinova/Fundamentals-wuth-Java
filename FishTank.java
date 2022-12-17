package FirstStepsInCoding;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int high = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        int area = length * width * high;
        double areaLiters = area / 1000.00;
        double areaWithoutPercent = areaLiters * (1 - percent / 100);

        System.out.println(areaWithoutPercent);

    }
}
