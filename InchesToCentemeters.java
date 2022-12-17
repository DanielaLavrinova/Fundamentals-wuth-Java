import java.util.Scanner;

public class InchesToCentemeters {

    public static void main(String[] args) {

        System.out.print("Enter inches: ");

        Scanner scanner = new Scanner(System.in);
        double inches  = scanner.nextDouble();
        double centimeter = inches * 2.54;

        System.out.println(centimeter);

    }
}
