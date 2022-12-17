package PBExams;

import java.util.Scanner;

public class Everest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int beginPoint = 5364;
        int days = 1;
        boolean flag = false;

        String input = scanner.nextLine();

        while(!input.equals("END")){

            int meters = Integer.parseInt(scanner.nextLine());

            if(input.equals("Yes")){
                beginPoint += meters;
                days ++;
            }else if(input.equals("No")){
                beginPoint += meters;
            }



            if(beginPoint >= 8848){
                flag = true;
                break;
            }

            if(days > 5 ){
                beginPoint -= meters;
                break;
            }


            input = scanner.nextLine();

        }

        if(beginPoint >= 8848){
            System.out.printf("Goal reached for %d days!",days);
        }else {
            System.out.println("Failed!");
            System.out.printf("%d",beginPoint);
        }

    }
}
