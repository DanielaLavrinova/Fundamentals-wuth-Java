package PBExams;

import java.util.Scanner;

public class Gymnastics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double score = 0.0;

        String country = scanner.nextLine();
        String composition = scanner.nextLine();

        switch (country){
            case "Russia":

            switch(composition){

            case "ribbon":
                score = 9.100 + 9.400;
                break;
            case "hoop":
                score = 9.300 + 9.800;
                break;
            case "rope":
                score = 9.600 + 9.000;
                break;

            }
            break;
            case "Bulgaria":
                switch(composition){

                    case "ribbon":
                        score = 9.600 + 9.400;
                        break;
                    case "hoop":
                        score = 9.550 + 9.750;
                        break;
                    case "rope":
                        score = 9.500 + 9.400;
                        break;

                }
                break;
            case "Italy":
                switch(composition){

                    case "ribbon":
                        score = 9.200 + 9.500;
                        break;
                    case "hoop":
                        score = 9.450 + 9.350;
                        break;
                    case "rope":
                        score = 9.700 + 9.150;
                        break;

                }
                break;

        }

        double points = 20 - score;

        System.out.printf("The team of %s get %.3f on %s.%n",country,score,composition);
        System.out.printf("%.2f%%", (points / 20) * 100);



    }
}
