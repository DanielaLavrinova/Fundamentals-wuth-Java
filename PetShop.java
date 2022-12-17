import java.util.Scanner;

public class PetShop {

        public static void main(String[] args) {

            //System.out.print("Please insert quantity of dog's food: ");
            Scanner scanner = new Scanner(System.in);
            int dogFood = scanner.nextInt();
            //System.out.print("Please insert quantity of cat's food: ");
            int catFood = scanner.nextInt();
            double sum = (dogFood * 2.50d ) + (catFood * 4.0d);
            System.out.print("{" + sum + "} lv.");

        }
    }


