import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 2;
        for( int i = 0 ; i <= n; i ++){
            if(i == 0){
               System.out.println(1);
            }else if(i == 2){
                sum *= 2 ;
                System.out.println(sum);
            } else if(i % 2 == 0){
                sum *= 4;
                System.out.println(sum);
            }
        }
    }
}
