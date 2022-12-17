import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberSnowball = Integer.parseInt(scanner.nextLine());
        double maxValue = Double.MIN_VALUE;
        int maxSnow = Integer.MIN_VALUE;
        int maxTime = Integer.MIN_VALUE;
        int maxQuantity = Integer.MIN_VALUE;

        for (int i = 0; i < numberSnowball ; i++) {
            int snow = Integer.parseInt(scanner.nextLine());
            int time = Integer.parseInt(scanner.nextLine());
            int quantity = Integer.parseInt(scanner.nextLine());
            double snowballValue = Math.pow((snow/ time),quantity);

            if(snowballValue > maxValue){
                maxValue = snowballValue;
                maxSnow = snow;
                maxTime = time;
                maxQuantity = quantity;
            }

        }

        System.out.printf("%d : %d = %.0f (%d)",maxSnow,maxTime,maxValue,maxQuantity);
    }
}
