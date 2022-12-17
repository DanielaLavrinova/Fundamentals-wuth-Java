import java.util.Scanner;

public class ValidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean isValid = number >= 100 && number <= 200 || number == 0;

        if(!isValid){
            System.out.println("invalid");
        }//else{
       //     System.out.println("Valid");
       // }
    }
}
