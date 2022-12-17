package MidExam;

import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        String input = scanner.nextLine();
        double sumNoTaxes = 0;
        double totalTaxes = 0;
        double totalAmount = 0;

        while(!input.equals("special")){
            if(input.equals("regular")){
                break;
            }
            double partsPrice = Double.parseDouble(input);
            if(partsPrice < 0){
                System.out.println("Invalid price!");
                input = scanner.nextLine();
                continue;
            }
            sumNoTaxes += partsPrice;
            input = scanner.nextLine();

        }
        totalTaxes = sumNoTaxes * 0.20;
        totalAmount = sumNoTaxes + totalTaxes;

        if(input.equals("special")){
            totalAmount = totalAmount - totalAmount * 0.10;
        }

        if(totalAmount == 0){
            System.out.println("Invalid order!");

        }else{
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n",sumNoTaxes);
            System.out.printf("Taxes: %.2f$%n",totalTaxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$",totalAmount);
        }
    }
}
