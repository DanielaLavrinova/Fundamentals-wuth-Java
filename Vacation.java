import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double moneyTrip = scanner.nextDouble();
        double moneyPresent = scanner.nextDouble();
        int counterDays = 0;
        int spendCounter = 0;

        while(moneyPresent < moneyTrip && spendCounter < 5){
            String action = scanner.next();
            action += scanner.nextLine();
            double money = scanner.nextDouble();
            counterDays ++;

            if(action.equals("save")){
                moneyPresent += money;
                spendCounter = 0;

            }else if (action.equals("spend")){
                moneyPresent -= money;
                spendCounter ++;
                if(moneyPresent < 0){
                    moneyPresent = 0;
                }
            }
        }
        if(moneyPresent >= moneyTrip){
            System.out.printf("You saved the money for %d days.",counterDays);
        }else if(spendCounter == 5){
            System.out.println("You can't save the money.");
            System.out.println(spendCounter);
        }
    }
}
