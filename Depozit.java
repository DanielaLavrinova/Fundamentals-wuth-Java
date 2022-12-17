import java.util.Scanner;

public class Depozit {
    public static void main(String[] args) {

        System.out.print("Please insert deposit: ");
        Scanner scanner = new Scanner(System.in);
        double deposit = scanner.nextDouble();
        System.out.print("Please insert term: ");
        int srok = scanner.nextInt();
        System.out.print("Please insert lihven %: ");
        double lihvenProcent = scanner.nextDouble()/100;
        double total = deposit + srok *((deposit * lihvenProcent)/ 12);
        System.out.print(total);

    }
}
