import java.util.Scanner;

public class Schoolmaterials {
    public static void main(String[] args) {

        System.out.print("Please enter pens: ");
        Scanner scanner = new Scanner(System.in);
        int pens = scanner.nextInt();
        System.out.print("Please enter markers: ");
        int markers = scanner.nextInt();
        System.out.print("Please enter preparat: ");
        int preparat = scanner.nextInt();
        System.out.print("Please enter discount: ");
        double discount = scanner.nextDouble()/100;
        double sum = pens * 5.8 + markers * 7.2 + preparat * 1.2;
        double discountSum = sum * discount;
        double total = sum - discountSum;
        System.out.print("The total price is: " + total);

    }
}
