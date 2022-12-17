import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberPeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());
        int numberElevators = 0;

        if(numberPeople <= capacity){
            numberElevators = 1;
        }else if(numberPeople % capacity == 0){
            numberElevators = numberPeople / capacity;
        }else if(numberPeople % capacity != 0){
            numberElevators = (numberPeople / capacity) + 1;
        }

        System.out.println(numberElevators);
    }
}
