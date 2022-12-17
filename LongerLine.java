package Methods;

import java.util.Scanner;

public class LongerLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double x3 = Double.parseDouble(scanner.nextLine());
        double y3 = Double.parseDouble(scanner.nextLine());
        double x4 = Double.parseDouble(scanner.nextLine());
        double y4 = Double.parseDouble(scanner.nextLine());

        printLongestLine(x1,y1,x2,y2,x3,y3,x4,y4);


    }

    public static void printLongestLine(double x1,double y1,double x2,double y2,double x3,double y3,double x4,double y4){
        double firstLine = Math.sqrt(Math.pow(x2 -x1,2) + Math.pow(y2-y1,2));
        double secondLine = Math.sqrt(Math.pow(x4 -x3,2) + Math.pow(y4-y3,2));


        if(firstLine >= secondLine){
            closestPoint(x1,y1,x2,y2);

        }else{
            closestPoint(x3,y3,x4,y4);
        }
    }

    public static void closestPoint(double x1,double y1,double x2,double y2){
        double firstPoint = Math.sqrt(Math.pow(x1,2) + Math.pow(y1,2));
        double secondPoint = Math.sqrt(Math.pow(x2,2) + Math.pow(y2,2));

        if(firstPoint<= secondPoint){
            System.out.printf("(%.0f, %.0f)(%.0f, %.0f)",x1,y1,x2,y2);
        }else{
            System.out.printf("(%.0f, %.0f)(%.0f, %.0f)",x2,y2,x1,y1);
        }


    }
}
