import java.util.Scanner;

public class Radians {
    public static void main(String[] args) {

        System.out.print("Please insert radians: ");
        Scanner scan = new Scanner(System.in);
        double radians = scan.nextDouble();
        double degrees = 180 * radians/ Math.PI;
        System.out.print(degrees);

    }
}
