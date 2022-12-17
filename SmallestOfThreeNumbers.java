package Methods;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fNumber = Integer.parseInt(scanner.nextLine());
        int sNumber = Integer.parseInt(scanner.nextLine());
        int tNumber = Integer.parseInt(scanner.nextLine());

        printMaxNumber(fNumber,sNumber,tNumber);


    }

    public static void printMaxNumber(int fNumber,int sNumber,int tNumber){

        if(fNumber <= sNumber && fNumber <= tNumber){
            System.out.println(fNumber);
        }else if(sNumber <= fNumber && sNumber <= tNumber){
            System.out.println(sNumber);
        }else if(tNumber <= fNumber && tNumber <= sNumber){
            System.out.println(tNumber);
        }

    }
}
