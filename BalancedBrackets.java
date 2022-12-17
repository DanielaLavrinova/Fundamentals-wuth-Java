import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int countOpeming = 0;
        int countClosing = 0;
        boolean flag = false;

        for (int i = 1; i <= n ; i++) {
            String input = scanner.nextLine();

            if(input.equals("(") ){
                countOpeming++;

            }else if(input.equals(")")){
                countClosing ++;
            }

            if(countOpeming == countClosing ){
                flag = false;
            }

            if(countOpeming == 2 || (countClosing - countOpeming !=0 )){
                flag = true;

            }
            if(input.equals("((") || input.equals("))")){
                flag = true;
            }

        }

        if(flag){
            System.out.println("UNBALANCED");
        }else {
            System.out.println("BALANCED");
        }
    }
}
