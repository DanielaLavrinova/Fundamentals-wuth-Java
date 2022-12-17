package PBExams;

import java.util.Scanner;

public class SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        boolean flag = false;

        double capacity = Double.parseDouble(scanner.nextLine());

        String input = scanner.nextLine();

        while(!input.equals("End")){
            double suitcase = Double.parseDouble(input);

            counter ++;

            if(counter % 3 == 0){
                suitcase = suitcase + suitcase * 0.10;
            }


            if(capacity <= suitcase){
                System.out.println("No more space!");
                System.out.printf("Statistic: %d suitcases loaded.",counter - 1);
                flag = true;
                break;
            }

            capacity = capacity - suitcase;


            input = scanner.nextLine();

        }

        if(!flag){
            System.out.println("Congratulations! All suitcases are loaded!");
            System.out.printf("Statistic: %d suitcases loaded.",counter);
        }

    }
}
