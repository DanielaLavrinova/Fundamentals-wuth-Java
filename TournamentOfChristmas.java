package PBExams;

import java.util.Scanner;

public class TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double charity = 0;
        int daysWin = 0;
        int daysLose = 0;

        int days = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= days ; i++) {
            double money = 0;
            int counterW = 0;
            int counterL = 0;

            String sport = scanner.nextLine();

            while(!sport.equals("Finish")){
                String game = scanner.nextLine();

                switch (game){
                    case "win":
                        counterW ++;
                        break;
                    case "lose":
                        counterL ++;

                }

                sport = scanner.nextLine();

            }

            if(counterW > counterL){
                money = counterW * 20;
                money = money + (money * 0.10);
                daysWin ++;

            }else {
                money = counterW * 20;
                daysLose ++;
            }

            charity += money;
            
        }

        if(daysWin > daysLose){
            charity = charity + charity * 0.20;
            System.out.printf("You won the tournament! Total raised money: %.2f",charity);

        }else{
            System.out.printf("You lost the tournament! Total raised money: %.2f",charity);

        }


    }
}
