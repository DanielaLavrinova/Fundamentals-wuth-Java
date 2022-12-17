package PBExams;

import java.util.Scanner;

public class EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int redEggs = 0;
        int orangeEggs = 0;
        int blueEggs = 0;
        int greenEggs = 0;
        int maxEggs = Integer.MIN_VALUE;
        String colorMax = "";

        int eggsNumber = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= eggsNumber ; i++) {
            String color = scanner.nextLine();

            switch (color){

                case "red":
                    redEggs ++;
                    break;
                case "orange":
                    orangeEggs ++;
                    break;
                case "blue":
                    blueEggs ++;
                    break;
                case "green":
                    greenEggs ++;

            }

        }

        if(redEggs > maxEggs){
            maxEggs = redEggs;
            colorMax = "red";
        } if(orangeEggs > maxEggs){
            maxEggs = orangeEggs;
            colorMax = "orange";
        } if(blueEggs > maxEggs){
            maxEggs = blueEggs;
            colorMax = "blue";
        } if(greenEggs > maxEggs){
            maxEggs = greenEggs;
            colorMax = "green";
        }

        System.out.printf("Red eggs: %d%n",redEggs);
        System.out.printf("Orange eggs: %d%n",orangeEggs);
        System.out.printf("Blue eggs: %d%n",blueEggs);
        System.out.printf("Green eggs: %d%n",greenEggs);
        System.out.printf("Max eggs: %d -> %s",maxEggs,colorMax);

    }
}
