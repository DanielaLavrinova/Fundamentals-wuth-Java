import java.util.Scanner;

public class TradeCommission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String townName = scanner.next();
        townName += scanner.nextLine();
        double sells = scanner.nextDouble();

        if(townName.equals("Sofia")){
            if(sells >= 0 && sells <= 500){
                System.out.printf("%.2f", (sells * 5/100));
            }else if(sells > 500 && sells <= 1000){
                System.out.printf("%.2f", (sells * 7/100));
            }else if(sells > 1000 && sells <= 10000){
                System.out.printf("%.2f", (sells * 8/100));
            }else if(sells > 10000){
                System.out.printf("%.2f", (sells * 12/100));
            }else if (sells < 0){
                System.out.println("error");
            }
        } if(townName.equals("Varna")){
            if(sells >= 0 && sells <= 500){
                System.out.printf("%.2f", (sells * 0.045));
            }else if(sells > 500 && sells <= 1000){
                System.out.printf("%.2f", (sells * 0.075));
            }else if(sells > 1000 && sells <= 10000){
                System.out.printf("%.2f", (sells * 0.10));
            }else if(sells > 10000){
                System.out.printf("%.2f", (sells * 0.13));
            }else if (sells < 0){
                System.out.println("error");
            }
        } if(townName.equals("Plovdiv")){
            if(sells >= 0 && sells <= 500){
                System.out.printf("%.2f", (sells * 0.055));
            }else if(sells > 500 && sells <= 1000){
                System.out.printf("%.2f", (sells * 0.08));
            }else if(sells > 1000 && sells <= 10000){
                System.out.printf("%.2f", (sells * 0.12));
            }else if(sells > 10000){
                System.out.printf("%.2f", (sells * 0.145));
            }else if (sells < 0){
                System.out.println("error");
            }
        }else if (!(townName.equals("Sofia") || townName.equals("Varna") || townName.equals("Plovdiv"))){
            System.out.println("error");
        }
    }
}
