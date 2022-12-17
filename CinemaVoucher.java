package PBExams;

import java.util.Scanner;

public class CinemaVoucher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int voucher = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        boolean flag = false;
        int counterTickets = 0;
        int counterOther = 0;

        while(!input.equals("End")){
            double price = 0;
            int length = input.length();
            char symbol = input.charAt(0);
            char symbol1 = input.charAt(1);
            int first = symbol;
            int second = symbol1;

            if(length > 8){
                price = first + second;

            }else {
                price = first;

            }

            if(price > voucher){
                flag = true;
                break;
            }

            if(length > 8){
                counterTickets ++;
            }else{
                counterOther ++;
            }

            voucher -= price;


            input = scanner.nextLine();

        }

        System.out.printf("%d%n%d",counterTickets,counterOther);

    }
}
