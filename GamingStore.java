import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentBalance = Double.parseDouble(scanner.nextLine());
        String games = scanner.nextLine();
        boolean flag = false;
        double totalSpent = 0;

        while(!games.equals("Game Time")){
            double price = 0;
            switch (games){

                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    price = 39.99;
                    break;
                case "CS: OG":
                    price = 15.99;
                    break;
                case "Zplinter Zell":
                    price = 19.99;
                    break;
                case "Honored 2":
                    price = 59.99;
                    break;
                case "RoverWatch":
                    price = 29.99;
                    break;
                default:
                    System.out.println("Not Found");
                    games = scanner.nextLine();
                    continue;

            }
            if(price > currentBalance){
                System.out.println("Too Expensive");
                games = scanner.nextLine();
                continue;
            }

            currentBalance -= price;
            totalSpent += price;

            System.out.printf("Bought %s%n",games);

            if(currentBalance <= 0){
                System.out.println("Out of money!");
                flag = true;
                break;
            }


            games = scanner.nextLine();

        }

        if(!flag){
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f",totalSpent,currentBalance);
        }


    }
}
