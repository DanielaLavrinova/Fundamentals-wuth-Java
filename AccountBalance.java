import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        input += scanner.nextLine();
        double totalBalance = 0;

        while(!input.equals("NoMoreMoney")){
            double accountBalance = Double.parseDouble(input);
            if(accountBalance < 0){
                System.out.println("Invalid operation!");
                break;
            }
            System.out.printf("Increase: %.2f%n",accountBalance);
            totalBalance += accountBalance;
            input = scanner.next();
            input+= scanner.nextLine();
        }
        System.out.printf("Total: %.2f%n",totalBalance);
    }
}
