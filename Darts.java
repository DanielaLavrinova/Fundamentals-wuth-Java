package PBExams;

import java.util.Scanner;

public class Darts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pointsBegin = 301;
        boolean flag = false;
        int counter = 0;
        int counterUn = 0;

        String namePlayer = scanner.nextLine();

        String input = scanner.nextLine();

        while(!input.equals("Retire")){
            int points = Integer.parseInt(scanner.nextLine());
            counter ++;
            int pointsMin = 0;


            switch (input){
                case "Single":
                    pointsMin = points;
                    break;

                case "Double":
                    pointsMin = points * 2;
                    break;
                case "Triple":
                    pointsMin =  points * 3;
                    break;

            }

            if( pointsMin > pointsBegin ){
                input = scanner.nextLine();
                counterUn ++;
                continue;
            }
            pointsBegin -= pointsMin;

            if(pointsBegin == 0){
                flag = true;
                break;
            }


            input = scanner.nextLine();

        }

        if(flag){
            System.out.printf("%s won the leg with %d shots.",namePlayer,counter - counterUn);
        }else {
            System.out.printf("%s retired after %d unsuccessful shots.",namePlayer,counterUn);
        }

    }
}
