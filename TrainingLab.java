package FirstStepsInCoding;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());

        int aisle = 100;
        int workPlaceW = 70;
        int workPlaceL = 120;
        width = width * 100 - aisle;
        double numColumns = Math.floor (width / workPlaceW);
        length = length * 100;
        double numRows = Math.floor(length / workPlaceL);
        double numberWorkPlace = (numRows * numColumns) - 3;

        System.out.printf("%.0f",numberWorkPlace);

    }
}
