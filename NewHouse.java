import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flower = scanner.next();
        flower += scanner.nextLine();
        int quantity = scanner.nextInt();
        int budget = scanner.nextInt();
        double totalPrice = 0.00;

        if ((quantity >= 10 && quantity <= 1000) && (budget >= 50 && budget <= 2500)) {
            if (flower.equals("Roses") || flower.equals("Tulips") || flower.equals("Dahlias") || flower.equals("Narcissus") || flower.equals("Gladiolus")) {

                if (flower.equals("Roses")) {
                    if (quantity >= 10 && quantity <= 80) {
                        totalPrice = quantity * 5.00;
                    } else if (quantity > 80 && quantity <= 1000) {
                        totalPrice = quantity * 5.00;
                        totalPrice -= totalPrice * 10 / 100;
                    }
                } else if (flower.equals("Dahlias")) {
                    if (quantity >= 10 && quantity <= 90) {
                        totalPrice = quantity * 3.80;
                    } else if (quantity > 90 && quantity <= 1000) {
                        totalPrice = quantity * 3.80;
                        totalPrice -= totalPrice * 15 / 100;
                    }
                } else if (flower.equals("Tulips")) {
                    if (quantity >= 10 && quantity <= 80) {
                        totalPrice = quantity * 2.80;
                    } else if (quantity > 80 && quantity <= 1000) {
                        totalPrice = quantity * 2.80;
                        totalPrice -= totalPrice * 15 / 100;
                    }
                } else if (flower.equals("Narcissus")) {
                    if (quantity >= 120 && quantity <= 1000) {
                        totalPrice = quantity * 3.00;
                    } else if (quantity >= 10 && quantity < 120) {
                        totalPrice = quantity * 3.00;
                        totalPrice += totalPrice * 15 / 100;
                    }
                } else if (flower.equals("Gladiolus")) {
                    if (quantity >= 80 && quantity <= 1000) {
                        totalPrice = quantity * 2.50;
                    } else if (quantity >= 10 && quantity < 80) {
                        totalPrice = quantity * 2.50;
                        totalPrice += totalPrice * 20 / 100;
                    }
                }

                if (totalPrice <= budget) {
                    double price = budget - totalPrice;
                    System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", quantity, flower, price);
                } else if (totalPrice > budget) {
                    System.out.printf("Not enough money, you need %.2f leva more.", (totalPrice - budget));
                }

            }
        }
    }
}