import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int pourWater = 0;
        int capacity = 255;

        for (int i = 1; i <= number ; i++) {
            int quantityWater = Integer.parseInt(scanner.nextLine());
            if(quantityWater > capacity){
                System.out.println("Insufficient capacity!");
                continue;
            }
            pourWater += quantityWater;
            capacity -= quantityWater;

        }
        System.out.println(pourWater);
    }
}
