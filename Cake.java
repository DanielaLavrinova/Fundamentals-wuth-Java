package WhileLoop;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int cakePieces = width * length;
        boolean noMoreLeft = false;

        String input = scanner.nextLine();

        while(!input.equals("STOP")){
            int pieces = Integer.parseInt(input);
            cakePieces -= pieces;

            if(cakePieces <= 0){
                noMoreLeft = true;
                break;
            }

            input = scanner.nextLine();

        }

        if(noMoreLeft){
            System.out.printf("No more cake left! You need %d pieces more.",Math.abs(cakePieces));
        }else {
            System.out.printf("%d pieces are left.",cakePieces);
        }

    }
}
