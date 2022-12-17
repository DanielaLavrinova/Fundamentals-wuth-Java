import java.util.Scanner;

public class Greening {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int backyard = scanner.nextInt();
        double totalPrice = backyard * 7.61;
        double discount =  totalPrice * 0.18 ;
        double finalPrice = totalPrice - discount;
        System.out.println("The final price is: " + finalPrice + " lv.");
        System.out.println("The discount is: " + discount + " lv. ");

    }
}
