package PBExams;

import java.util.Scanner;

public class MaidenParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double partyPrice = Double.parseDouble(scanner.nextLine());
        int loveLetters = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int keyHolders = Integer.parseInt(scanner.nextLine());
        int funnyPictures = Integer.parseInt(scanner.nextLine());
        int lucky = Integer.parseInt(scanner.nextLine());

        double totalEarns = loveLetters * 0.60 + roses * 7.20 + keyHolders * 3.60 + funnyPictures * 18.20 + lucky * 22;

        int items = loveLetters + roses + keyHolders + funnyPictures + lucky;


        if(items >= 25){

            totalEarns = totalEarns - (totalEarns * 0.35);

        }

        double hosting = totalEarns * 0.10;

        totalEarns = totalEarns - hosting;

        if(totalEarns >= partyPrice){
            System.out.printf("Yes! %.2f lv left.",totalEarns - partyPrice);
        }else {
            System.out.printf("Not enough money! %.2f lv needed.",partyPrice - totalEarns);
        }

    }
}
