import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        double washingMachine = scanner.nextDouble();
        int toysPrice = scanner.nextInt();
        double money = 0;
        double allMoney = 0;
        int brother = 0;
        int numberToys = 0;
        double savedMoney = 0;

        for (int i = 1; i <= age; i++) {

            if( i % 2 == 0){
                money += 10;
                allMoney = allMoney + money;
                brother ++;

            }else{
                numberToys += 1;
            }
        }
        savedMoney = (allMoney - brother) + (toysPrice * numberToys);

        if(savedMoney >= washingMachine){
            System.out.printf("Yes! %.2f", (savedMoney - washingMachine));
        }else {
            System.out.printf("No! %.2f", (washingMachine - savedMoney));
        }
    }
}
