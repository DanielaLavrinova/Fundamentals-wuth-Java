import java.util.Scanner;

public class SwapMethod {
    public static void main(String[] args) {

        System.out.print("Please insert first number: ");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        System.out.print("Please insert second number: ");
        int number2 = scanner.nextInt();
        System.out.println("Before swapping number 1 is " + number1 + " and Number 2 is " + number2);

        swappingNumbers(number1,number2);
    }

    public static void swappingNumbers(int a,int b){
        int c = a;
        a = b;
        b = c;

        System.out.println("After swapping Number 1 is " + a + " and Number 2 is " + b);



    }
}
