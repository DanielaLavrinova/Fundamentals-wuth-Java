import java.util.Scanner;

public class FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNumber = Double.parseDouble(scanner.nextLine());
        double secondNumber = Double.parseDouble(scanner.nextLine());
        double epsilon = 0.000001;

        if(Math.abs(firstNumber - secondNumber) < epsilon){
            System.out.println("True");

        }else {
            System.out.println("False");

        }


    }
}
