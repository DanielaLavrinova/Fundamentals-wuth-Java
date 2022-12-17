import java.util.Scanner;

public class Convert {

    public static void main(String[] args) {

        System.out.print("Please insert USD: ");
        Scanner scanner = new Scanner(System.in);
        double usd = scanner.nextDouble();
        double bgn = usd * 1.79549;
        System.out.print(bgn);



    }
}
