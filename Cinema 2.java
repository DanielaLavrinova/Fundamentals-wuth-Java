package PBExams;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int seats = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        double totalSum = 0;
        double sum = 0;
        boolean flag = false;

        while(!input.equals("Movie time!")){
            int people = Integer.parseInt(input);
            if(people > seats){
                flag = true;
                break;
            }
            sum = people * 5;
            totalSum = totalSum + sum;

            if(people % 3 == 0){
                totalSum = totalSum - 5;
            }
            seats -= people;

            input = scanner.nextLine();

        }

        if(flag){
            System.out.println("The cinema is full.");
            System.out.printf("Cinema income - %.0f lv.",totalSum);
        }else {
            System.out.printf("There are %d seats left in the cinema.%n",seats);
            System.out.printf("Cinema income - %.0f lv.",totalSum);

        }

    }
}
