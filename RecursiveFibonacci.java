package Arrays;

import java.util.Scanner;

public class RecursiveFibonacci {
    public int fibonacci(int number ){
        if(number == 0){
           return 0;
        }else if(number == 1){
            return 1;
        }else{
            return fibonacci(number - 1)+ fibonacci(number - 2);
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        RecursiveFibonacci result = new RecursiveFibonacci();
        result.fibonacci(number);
        System.out.println(result.fibonacci(number));

    }
}
