package finalExam;

import java.util.Scanner;

public class SantaCookies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int totalCookiesPerBake = 0;
        int boxes = 0;

        for (int i = 0; i < n; i++) {
            int flour = Integer.parseInt(scanner.nextLine());
            int sugar = Integer.parseInt(scanner.nextLine());
            int cocoa = Integer.parseInt(scanner.nextLine());

            int flourCups = flour / 140;
            int sugarSpoons = sugar / 20;
            int cocoaSpoons = cocoa / 10;

            int smallerIng = Math.min(flourCups,sugarSpoons);
            int smallestIng = Math.min(smallerIng,cocoaSpoons);


            totalCookiesPerBake = (140 + 10 + 20) * smallestIng/ 25;

            int totalBoxes = totalCookiesPerBake / 5;

            if(flourCups <= 0 || sugarSpoons <= 0 || cocoaSpoons <= 0) {
                System.out.println("Ingredients are not enough for a box of cookies.");
            }else{
                System.out.printf("Boxes of cookies: %d%n",totalBoxes);

                boxes += totalBoxes;
            }

        }

        System.out.printf("Total boxes: %d",boxes);
    }
}
