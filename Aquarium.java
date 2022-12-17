import java.util.Scanner;

public class Aquarium {

    public static void main(String[] args) {

        System.out.print("Please enter length: ");
        Scanner scanner = new Scanner(System.in);
        double length = scanner.nextDouble();;
        System.out.print("Please enter width: ");
        double width = scanner.nextDouble();
        System.out.print("Please enter height: ");
        double height = scanner.nextDouble();
        System.out.print("Please enter percent: ");
        double percent = scanner.nextDouble();
        double v = length * width * height;
        double totalV = v - (v * percent/100);
        System.out.print(totalV/1000);  //trqbva da razdelim na 1000 za da poluchim litrite


    }
}
