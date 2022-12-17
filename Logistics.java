package ForLoop;

import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberCargo = Integer.parseInt(scanner.nextLine());

        int price = 0;
        int cargo1 = 0;
        int cargo2 = 0;
        int cargo3 = 0;
        double totalPrice = 0;
        int totalCargo = 0;

        for (int i = 1; i <= numberCargo ; i++) {
            int cargo = Integer.parseInt(scanner.nextLine());

            if(cargo < 4){
                price =cargo * 200;
                totalPrice += price;
                cargo1 += cargo;
            }else if(cargo < 12){
                price =cargo * 175;
                totalPrice += price;
                cargo2 += cargo;
            }else if(cargo >= 12 ){
                price = cargo * 120;
                totalPrice += price;
                cargo3 += cargo;
            }

            totalCargo += cargo;

        }

        double averagePrice = totalPrice / totalCargo;
        System.out.printf("%.2f%n",averagePrice);
        System.out.printf("%.2f%%%n",(cargo1 * 1.00 / totalCargo) * 100);
        System.out.printf("%.2f%%%n",(cargo2 * 1.00 / totalCargo) * 100);
        System.out.printf("%.2f%%",(cargo3 * 1.00 / totalCargo) * 100);

    }
}
