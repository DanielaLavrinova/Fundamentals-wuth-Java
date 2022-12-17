package PBExams;

import java.util.Scanner;

public class HighJump {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int desireHigh = Integer.parseInt(scanner.nextLine());
        int begin = desireHigh - 30;
        int counter = 0;
        boolean flag = false;
        int jumps = 0;

        while (!flag){

            int currentHigh = scanner.nextInt();
            jumps ++;

            if(currentHigh <= begin){
                counter ++;
                if(counter == 3){
                    flag = true;
                }
            }else {
                if(begin >= desireHigh){
                   break;
                }
                begin += 5;
                counter = 0;
            }

        }

        if(flag){

            System.out.printf("Tihomir failed at %dcm after %d jumps.",begin,jumps);

        }else {

            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.",desireHigh,jumps);

        }
    }
}
