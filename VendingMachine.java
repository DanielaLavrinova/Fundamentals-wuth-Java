import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double sum = 0;

        while (!input.equals("Start")){
            double coins = Double.parseDouble(input);

            if(coins == 0.1){
                sum += coins;
            }else if(coins == 0.2){
                sum += coins;
            }else if(coins == 0.5){
                sum += coins;
            }else if(coins == 1.0){
                sum += coins;
            }else if(coins == 2.0){
                sum += coins;
            }else {
                System.out.printf("Cannot accept %.2f%n",coins);
            }

            input = scanner.nextLine();

        }

        String product = scanner.nextLine();

        double priceProduct = 0;

        while(!product.equals("End")){

            if(product.equals("Nuts")){
                priceProduct = 2;
                if(sum < priceProduct){
                    System.out.println("Sorry, not enough money");
                }else {
                    System.out.printf("Purchased %s%n",product);
                    sum -= priceProduct;
                }
            }else if(product.equals("Water")){
                priceProduct = 0.7;
                if(sum < priceProduct){
                    System.out.println("Sorry, not enough money");
                }else {
                    System.out.printf("Purchased %s%n",product);
                    sum -= priceProduct;
                }
            }else if(product.equals("Crisps")){
                priceProduct = 1.5;
                if(sum < priceProduct){
                    System.out.println("Sorry, not enough money");
                }else {
                    System.out.printf("Purchased %s%n",product);
                    sum -= priceProduct;
                }
            }else if(product.equals("Soda")){
                priceProduct = 0.8;
                if(sum < priceProduct){
                    System.out.println("Sorry, not enough money");
                }else {
                    System.out.printf("Purchased %s%n",product);
                    sum -= priceProduct;
                }
            } else if(product.equals("Coke")){
                priceProduct = 1.0;
                if(sum < priceProduct){
                    System.out.println("Sorry, not enough money");
                }else {
                    System.out.printf("Purchased %s%n",product);
                    sum -= priceProduct;
                }
            }else{
                System.out.println("Invalid product");
            }


            product = scanner.nextLine();

        }

        System.out.printf("Change: %.2f",sum);


    }
}
