package PBExams;

import java.util.Scanner;

public class CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalFood = 0;

        int food = Integer.parseInt(scanner.nextLine());

        int foodGrams = food * 1000;

        String input = scanner.nextLine();

        while(!input.equals("Adopted")){
            int dailyFood = Integer.parseInt(input);

            totalFood += dailyFood;

            input = scanner.nextLine();

        }

        if(totalFood <= foodGrams){
            System.out.printf("Food is enough! Leftovers: %d grams.",foodGrams - totalFood);

        }else{
            System.out.printf("Food is not enough. You need %d grams more.",totalFood - foodGrams);
        }

    }
}
