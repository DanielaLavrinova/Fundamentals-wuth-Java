package ConditionalStatements;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double commission = 0;
        boolean isValid = true;

        if(town.equals("Sofia")){
            if(sales >= 0 && sales <= 500){
                commission = sales * 5/100;
            }else if (sales > 500 && sales <= 1000){
                commission = sales * 7/100;
            }else if (sales > 1000 && sales <= 10000){
                commission = sales * 8/100;
            }else if (sales > 10000){
                commission = sales * 12/100;
            }else {
                isValid = false;
            }

        }else if(town.equals("Varna")){
            if(sales >= 0 && sales <= 500){
                commission = sales * 0.045;
            }else if (sales > 500 && sales <= 1000){
                commission = sales * 0.075;
            }else if (sales > 1000 && sales <= 10000){
                commission = sales * 10/100;
            }else if (sales > 10000){
                commission = sales * 13/100;
            }else {
                isValid = false;
            }

        } else if(town.equals("Plovdiv")){
            if(sales >= 0 && sales <= 500){
                commission = sales * 0.055;
            }else if (sales > 500 && sales <= 1000){
                commission = sales * 8/100;
            }else if (sales > 1000 && sales <= 10000){
                commission = sales * 12/100;
            }else if (sales > 10000){
                commission = sales * 0.145;
            }else {
                isValid = false;
            }

        } else{
            isValid = false;
        }

        if(isValid){
            System.out.printf("%.2f",commission);
        }else {
            System.out.println("error");
        }
    }
}
