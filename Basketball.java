import java.util.Scanner;

public class Basketball {
    public static void main(String[] args) {
        System.out.print("Please insert the the annual fee: ");
        Scanner scanner = new Scanner(System.in);
        double fee = scanner.nextDouble();
        double shoes = fee - (fee * 40/100);
        double cloths = shoes - (shoes * 20/100);
        double ball = cloths * 1/4;
        double accessories = ball * 1/5;
        double totalPrice = fee + shoes + cloths + ball + accessories;
        System.out.print("The total price is : " + totalPrice);
        // System.out.println();
        // System.out.print(ball);





    }
}
