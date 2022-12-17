import java.util.Scanner;

public class OperationBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        String operation = scanner.next();
        int result = 0;
        double result1 = 0.00;

        if((number1 >= 0 && number1 <= 40000) && (number2 >= 0 && number2 <= 40000)
                &&(operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/") || operation.equals("%")) ){

            if(operation.equals("+")){
                result = number1 + number2;
                if(result % 2 == 0){
                   System.out.printf("%d %s %d = %d - even",number1,operation,number2,result);
                }else{
                    System.out.printf("%d %s %d = %d - odd",number1,operation,number2,result);
                }
            }else if(operation.equals("-")){
                result =number1 - number2;
                if(result % 2 == 0){
                    System.out.printf("%d %s %d = %d - even",number1,operation,number2,result);
                }else {
                    System.out.printf("%d %s %d = %d - odd",number1,operation,number2,result);
                }
            }else if(operation.equals("*")){
                result = number1 * number2;
                if(result % 2 == 0){
                    System.out.printf("%d %s %d = %d - even",number1,operation,number2,result);
                }else {
                    System.out.printf("%d %s %d = %d - odd", number1,operation,number2,result);
                }
            }else if(operation.equals("/")){
                if (!(number2 == 0)){
                result1 = number1 * 1.0/ number2;
                System.out.printf("%d %s %d = %.2f",number1,operation,number2,result1);
                }else{
                    System.out.printf("Cannot divide %d by zero",number1);
                }

            }else if(operation.equals("%")){
                if(!(number2 == 0)){
                result = number1 % number2;
                System.out.printf("%d %s %d = %d",number1,operation,number2,result);
                }else{
                    System.out.printf("Cannot divide %d by zero",number1);
                }
            }

        }
    }
}
