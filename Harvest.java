package FirstStepsInCoding;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int xArea = Integer.parseInt(scanner.nextLine());
        double yGrape = Double.parseDouble(scanner.nextLine());
        int zWine = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double harvest = xArea * yGrape;
        double wineHarvest = harvest * 40 / 100;
        double wineLiter = wineHarvest / 2.5;

        if(wineLiter >= zWine){
            double winePerPerson = Math.ceil((wineLiter - zWine) / workers);
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n",Math.floor(wineLiter));
            System.out.printf("%.0f liters left -> %.0f liters per person.",Math.ceil(wineLiter - zWine),winePerPerson);
        }else {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.",Math.floor(zWine - wineLiter));
        }
    }
}
