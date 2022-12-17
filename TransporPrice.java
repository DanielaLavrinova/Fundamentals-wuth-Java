package FirstStepsInCoding;

import java.util.Scanner;

public class TransporPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

         double priceTaxi = 0;
         double priceBus = 0;
         double priceTrain = 0;
         double minPrice = Double.MAX_VALUE;

        if(day.equals("day")){
            if(n < 20){
                priceTaxi = n * 0.79 + 0.70;
                System.out.printf("%.2f",priceTaxi);

            }else if (n >= 20 && n < 100){
                priceBus = 0.09 * n;
                System.out.printf("%.2f",priceBus);

            }else if(n >= 100){
                priceBus = 0.09 * n;
                priceTrain = 0.06 * n;

                if(priceBus < minPrice){
                    minPrice = priceBus;
                }
                if (priceTrain < minPrice){
                    minPrice = priceTrain;
                }
                System.out.printf("%.2f",minPrice);
            }

        }else if(day.equals("night")){
            if(n < 20){
                priceTaxi = n * 0.90 + 0.70;
                System.out.printf("%.2f",priceTaxi);

            }else if (n >= 20 && n < 100){
                priceBus = 0.09 * n;
                System.out.printf("%.2f",priceBus);

            }else if(n >= 100){
                priceBus = 0.09 * n;
                priceTrain = 0.06 * n;

                if(priceBus < minPrice){
                    minPrice = priceBus;
                }
                if (priceTrain < minPrice){
                    minPrice = priceTrain;
                }
                System.out.printf("%.2f",minPrice);
            }
        }
    }
}
