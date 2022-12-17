import java.util.Scanner;

public class Painting {
    public static void main(String[] args) {

        System.out.print("Please insert nailon: ");
        Scanner scanner = new Scanner(System.in);
        double nailon = scanner.nextDouble();
        System.out.print("Please insert quantity paint: ");
        double boq = scanner.nextDouble();
        System.out.print("Please insert quantity razreditel:");
        double razreditel = scanner.nextDouble();
        System.out.print("Please insert hours: ");
        double hours = scanner.nextDouble();
        double bags = 0.40;
        double materials =( nailon + 2)* 1.50 + (boq + (boq*10/100))* 14.50+ razreditel * 5 + bags;
        double hoursMaistori = (materials * 0.30) * hours;
        double totalPrice = materials + hoursMaistori;
        System.out.print(totalPrice);

    }
}
