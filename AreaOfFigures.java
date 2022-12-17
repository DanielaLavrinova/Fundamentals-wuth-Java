import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();
        double area = 0.0;

        if(figure.equals("square")){
            double side = scanner.nextDouble();
            area = side * side;
        }if(figure.equals("rectangle")){
            double sideA = scanner.nextDouble();
            double sideB = scanner.nextDouble();
            area = sideA * sideB;
        }if(figure.equals("circle")){
            double radius = scanner.nextDouble();
            area = Math.PI * radius * radius;
        }if(figure.equals("triangle")){
            double side = scanner.nextDouble();
            double highSide = scanner.nextDouble();
            area = (side * highSide)/2;
        }

        System.out.printf("%.3f", area);
    }
}
