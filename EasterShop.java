package PBExams;

import java.util.Scanner;

public class EasterShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counterEggs = 0;
        boolean flag = false;

        int eggs = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        while(!input.equals("Close")){
            int currentEggs = Integer.parseInt(scanner.nextLine());

            if(currentEggs > eggs && input.equals("Buy")){
                flag = true;
                break;
            }


            if(input.equals("Buy")){
                eggs -= currentEggs;
                counterEggs += currentEggs;

            }else if(input.equals("Fill")){
                eggs += currentEggs;

            }


            input = scanner.nextLine();

        }

        if(flag){
            System.out.println("Not enough eggs in store!");
            System.out.printf("You can buy only %d.",eggs);
        }else {
            System.out.println("Store is closed!");
            System.out.printf("%d eggs sold.",counterEggs);

        }

    }
}
