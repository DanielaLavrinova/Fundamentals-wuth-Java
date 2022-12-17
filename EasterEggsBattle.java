package PBExams;

import java.util.Scanner;

public class EasterEggsBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        int eggPlayer1 = Integer.parseInt(scanner.nextLine());
        int eggPlayer2 = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        while(!input.equals("End")){
            if(input.equals("one")){
                eggPlayer2 -= 1;

            }else if(input.equals("two")){
                eggPlayer1 -= 1;

            }

            if(eggPlayer1 == 0 || eggPlayer2 == 0){
                flag = false;
                break;
            }

            input = scanner.nextLine();

        }

        if(flag){
            System.out.printf("Player one has %d eggs left.%n",eggPlayer1);
            System.out.printf("Player two has %d eggs left.%n",eggPlayer2);

        }else if(eggPlayer1 == 0){
            System.out.print("Player one is out of eggs. ");
            System.out.printf("Player two has %d eggs left.",eggPlayer2);

        }else if(eggPlayer2 == 0){
            System.out.print("Player two is out of eggs. ");
            System.out.printf("Player one has %d eggs left.",eggPlayer1);

        }

    }
}
