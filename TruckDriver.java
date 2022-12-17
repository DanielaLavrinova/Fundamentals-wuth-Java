package ConditionalStatements;

import java.util.Scanner;

public class TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kilometers = Double.parseDouble(scanner.nextLine());

        double salary = 0;

        if(kilometers <= 5000){

            switch (season){

                case "Spring":
                case "Autumn":
                    salary = kilometers * 0.75;
                    break;
                case "Summer":
                    salary = kilometers * 0.90;
                    break;
                case "Winter":
                    salary = kilometers * 1.05;
                    break;
            }

        }else if(kilometers > 5000 && kilometers <= 10000){

            switch (season){

                case "Spring":
                case "Autumn":
                    salary = kilometers * 0.95;
                    break;
                case "Summer":
                    salary = kilometers * 1.10;
                    break;
                case "Winter":
                    salary = kilometers * 1.25;
                    break;
            }

        }else if (kilometers >= 10000 && kilometers <= 20000){
            salary = kilometers * 1.45;
        }

        salary = (salary * 4) ;
        salary = salary - (salary * 0.10);

        System.out.printf("%.2f",salary);
    }
}
