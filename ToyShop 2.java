import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceTrip = scanner.nextDouble();
        double puzzels = scanner.nextDouble();
        double dolls = scanner.nextDouble();
        double bears = scanner.nextDouble();
        double minions = scanner.nextDouble();
        double trucks = scanner.nextDouble();

        double toys = puzzels + dolls + bears + minions + trucks;
        double toysPrice = puzzels * 2.60 + dolls * 3.00 + bears * 4.10 + minions * 8.20 + trucks * 2;

        if(toys >= 50){
            toysPrice = toysPrice - toysPrice * 0.25;
        }
        double rent = toysPrice * 0.10;
        double totalPrice = toysPrice - rent;

        if( totalPrice >= priceTrip){
            System.out.printf("Yes! %.2f lv left.",(totalPrice - priceTrip));
        }else {
            System.out.printf("Not enough money! %.2f lv needed.",(priceTrip - totalPrice));
        }


    }
}
