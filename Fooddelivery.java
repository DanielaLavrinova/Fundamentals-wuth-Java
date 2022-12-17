import java.util.Scanner;

public class Fooddelivery {

    public static void main(String[] args) {

        System.out.print("Please enter the quantity of chicken menu: ");
        Scanner scanner = new Scanner(System.in);
        double chickenMenu = scanner.nextDouble();
        System.out.print("Please enter the quantity of fish menu: ");
        double fishMenu = scanner.nextDouble();
        System.out.print("Please enter the quantity of vegetarian menu: ");
        double vegetarianMenu = scanner.nextDouble();
        double delivery = 2.50;
        double priceNoDessert = chickenMenu * 10.35 + fishMenu * 12.40 + vegetarianMenu * 8.15;
        double dessertPrice = priceNoDessert * 20/100;
        double totalPrice = priceNoDessert + dessertPrice + delivery;

        System.out.print(totalPrice);

    }
}
