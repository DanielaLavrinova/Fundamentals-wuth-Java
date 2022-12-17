import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = scanner.nextDouble();
        double nVideocards = scanner.nextDouble();
        double nProcessor = scanner.nextDouble();
        double nMemory = scanner.nextDouble();
        double videoCards = 250;
        double processor = (videoCards * nVideocards) * 35/100;
        double memory = (videoCards * nVideocards) * 10/100;
        double totalPrice = nVideocards * videoCards + nProcessor * processor + nMemory * memory;

        if(nVideocards > nProcessor){
            totalPrice = totalPrice - totalPrice * 15/100;
        }

        if(totalPrice <= budget){
            System.out.printf("You have %.2f leva left!",(budget - totalPrice));
        }else if(totalPrice > budget){
            System.out.printf("Not enough money! You need %.2f leva more!",(totalPrice - budget));
        }

    }
}
