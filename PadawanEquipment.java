import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceLightSaber = Double.parseDouble(scanner.nextLine());
        double priceRobe = Double.parseDouble(scanner.nextLine());
        double priceBelt = Double.parseDouble(scanner.nextLine());

        double quantityLightSaber = Math.ceil(students + students * 0.10);
        int sixBelt = students / 6;

        double totalPrice = students * priceRobe + students * priceBelt + priceLightSaber * quantityLightSaber - sixBelt * priceBelt;

        if(money >= totalPrice){
            System.out.printf("The money is enough - it would cost %.2flv.",totalPrice);

        }else {
            System.out.printf("George Lucas will need %.2flv more.",totalPrice - money);

        }

    }
}
