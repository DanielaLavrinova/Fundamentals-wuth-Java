package FirstStepsInCoding;

import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int foodLeft = Integer.parseInt(scanner.nextLine());
        double dogPerDAy = Double.parseDouble(scanner.nextLine());
        double catPerDAy = Double.parseDouble(scanner.nextLine());
        double tortulePerDAy = Double.parseDouble(scanner.nextLine());

        double totalFood = (days * dogPerDAy + days * catPerDAy) * 1000 + days * tortulePerDAy;
        totalFood = totalFood / 1000;

        if(totalFood <= foodLeft){
            System.out.printf("%.0f kilos of food left.",Math.floor(foodLeft - totalFood));
        }else{
            System.out.printf("%.0f more kilos of food are needed.",Math.ceil(totalFood- foodLeft));
        }
    }
}
