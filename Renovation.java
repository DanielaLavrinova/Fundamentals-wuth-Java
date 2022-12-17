package PBExams;

import java.util.Scanner;

public class Renovation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int high = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        double area = high * width * 4;
        area = Math.ceil(area - (area * percent) / 100);
        boolean flag = false;

        String paint = scanner.nextLine();

        while (!paint.equals("Tired!")){
            int liters = Integer.parseInt(paint);
            area = area - liters;

            if(area <= 0){
                flag = true;
                break;
            }

            paint = scanner.nextLine();

        }

        if(flag){

            if(area == 0){
                System.out.println("All walls are painted! Great job, Pesho!");
            }else {
                System.out.printf("All walls are painted and you have %.0f l paint left!",Math.abs(area));
            }

        }else {
            System.out.printf("%.0f quadratic m left.",area);

        }

    }

}
