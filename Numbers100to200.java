import java.util.Scanner;

public class Numbers100to200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if(number < 100){
            System.out.println("Less than 100");
        }else if(number <= 200){
            System.out.println("Between 100 and 200");
        }else if(number >200){
            System.out.println("Greater than 200");
        }
    }
}
