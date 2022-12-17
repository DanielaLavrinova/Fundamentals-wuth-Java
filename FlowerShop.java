package FirstStepsInCoding;

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int magnoly = Integer.parseInt(scanner.nextLine());
        int zumbuly = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int cactus = Integer.parseInt(scanner.nextLine());
        double presentPrice = Double.parseDouble(scanner.nextLine());

        double priceOrder = magnoly * 3.25 + zumbuly * 4 + roses * 3.5 + cactus * 8;
        priceOrder = priceOrder - priceOrder * 5/100;

        if(priceOrder >= presentPrice){
            System.out.printf("She is left with %.0f leva.",Math.floor(priceOrder - presentPrice));
        }else {
            System.out.printf("She will have to borrow %.0f leva.",Math.ceil(presentPrice - priceOrder));
        }

    }
}
