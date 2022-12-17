import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headSetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyBoardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int headSet = 0;
        int mouse = 0;
        int keyboard = 0;
        int display = 0;

        for (int i = 1; i <= lostGames ; i++) {

            if(i % 2 == 0){
                headSet ++;

            }
            if(i % 3 == 0){
                mouse ++;

            }
            if(i % 6 == 0){
                keyboard ++;

                if(keyboard % 2 == 0){
                    display ++;
                }

            }

        }

        double totalPrice = headSet * headSetPrice + mouse * mousePrice + display * displayPrice + keyboard * keyBoardPrice;

        System.out.printf("Rage expenses: %.2f lv.",totalPrice);

    }
}
