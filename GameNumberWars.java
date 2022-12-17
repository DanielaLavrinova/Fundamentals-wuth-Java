package PBExams;

import java.util.Scanner;

public class GameNumberWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pointsF = 0;
        int pointsS = 0;
        int totalF = 0;
        int totalS = 0;
        boolean flag = false;

        String nameFirst = scanner.nextLine();
        String nameSecond = scanner.nextLine();

        String input = scanner.nextLine();

        while(!input.equals("End of game")){
            int first = Integer.parseInt(input);
            int second = Integer.parseInt(scanner.nextLine());

            if(first > second){
                pointsF = first - second;
                totalF += pointsF;
            }else if(first < second){
                pointsS = second - first;
                totalS += pointsS;

            }else if(first == second){
                int firstAdd = scanner.nextInt();
                int secondAdd = scanner.nextInt();

                if(firstAdd > secondAdd){
                    System.out.println("Number wars!");
                    System.out.printf("%s is winner with %d points",nameFirst,totalF);
                }else {
                    System.out.println("Number wars!");
                    System.out.printf("%s is winner with %d points",nameSecond,totalS);

                }
                flag = true;
                break;

            }



            input = scanner.nextLine();

        }

        if(!flag){
            System.out.printf("%s has %d points%n",nameFirst,totalF);
            System.out.printf("%s has %d points%n",nameSecond,totalS);
        }

    }
}
