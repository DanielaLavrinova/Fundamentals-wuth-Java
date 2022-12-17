package Methods;

import java.util.Scanner;

public class CenterPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 =Double.parseDouble(scanner.nextLine());
        double y1 =Double.parseDouble(scanner.nextLine());
        double x2 =Double.parseDouble(scanner.nextLine());
        double y2 =Double.parseDouble(scanner.nextLine());

        printClosestPoint(x1,y1,x2,y2);


    }

    public static void printClosestPoint(double x1,double y1,double x2,double y2){
        double firstPoint = Math.sqrt(Math.pow(x1,2) + Math.pow(y1,2));
        double secondPoint = Math.sqrt(Math.pow(x2,2) + Math.pow(y2,2));

        if(firstPoint <= secondPoint){
            System.out.printf("(%.0f, %.0f)",x1,y1);
        }else {
            System.out.printf("(%.0f, %.0f)",x2,y2);
        }

    }
}

