package PBExams;

import java.util.Scanner;

public class SeriesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int seasons = Integer.parseInt(scanner.nextLine());
        int series = Integer.parseInt(scanner.nextLine());
        double timePerSeries = Double.parseDouble(scanner.nextLine());

        double advert = timePerSeries * 0.20;
        double seriesAdvert = timePerSeries + advert;
        double additionalTime = seasons * 10;

        double totalTime = Math.round(seasons * (series * seriesAdvert ) + additionalTime);

        System.out.printf("Total time needed to watch the %s series is %.0f minutes.",name,totalTime);


    }
}
