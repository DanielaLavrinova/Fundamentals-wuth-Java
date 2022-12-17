import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.next();
        fruit += scanner.nextLine();
        String weekDay = scanner.next();
        weekDay += scanner.nextLine();
        double quantity = scanner.nextDouble();

        if(weekDay.equals("Monday") || weekDay.equals("Tuesday") || weekDay.equals("Wednesday") || weekDay.equals("Thursday") || weekDay.equals("Friday")){
            switch (fruit){
                case "banana":
                    System.out.printf("%.2f",(quantity * 2.50));
                    break;
                case "apple":
                    System.out.printf("%.2f",(quantity * 1.20));
                    break;
                case "orange":
                    System.out.printf("%.2f",(quantity * 0.85));
                    break;
                case "grapefruit":
                    System.out.printf("%.2f",(quantity * 1.45));
                    break;
                case "kiwi":
                    System.out.printf("%.2f",(quantity * 2.70));
                    break;
                case "pineapple":
                    System.out.printf("%.2f",(quantity * 5.50));
                    break;
                case "grapes":
                    System.out.printf("%.2f",(quantity * 3.85));
                    break;
                default:
                    System.out.println("error");
            }
        }else if(weekDay.equals("Saturday") || weekDay.equals("Sunday")){
            switch (fruit){
                case "banana":
                    System.out.printf("%.2f",(quantity * 2.70));
                    break;
                case "apple":
                    System.out.printf("%.2f",(quantity * 1.25));
                    break;
                case"orange":
                    System.out.printf("%.2f",(quantity * 0.90));
                    break;
                case "grapefruit":
                    System.out.printf("%.2f",(quantity * 1.60));
                    break;
                case "kiwi":
                    System.out.printf("%.2f",(quantity * 3.00));
                    break;
                case "pineapple":
                    System.out.printf("%.2f",(quantity * 5.60));
                    break;
                case "grapes":
                    System.out.printf("%.2f",(quantity * 4.20));
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        }else{
            System.out.println("error");
        }

    }
}
