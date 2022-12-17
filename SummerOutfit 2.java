import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();
        String name = scanner.next();
        name += scanner.nextLine();
        String outfit = "";
        String shoes = "";

        if(name.equals("Morning")){
            if(temperature >= 10 && temperature <= 18 ){
                outfit = "Sweatshirt";
                shoes = "Sneakers";
            }else if(temperature > 18 && temperature <= 24){
                outfit = "Shirt";
                shoes = "Moccasins";
            }else if(temperature>= 25 && temperature <= 42){
                outfit = "T-Shirt";
                shoes = "Sandals";
            }
        } if(name.equals("Afternoon")){
            if(temperature >= 10 && temperature <= 18 ){
                outfit = "Shirt";
                shoes = "Moccasins";
            }else if(temperature > 18 && temperature <= 24){
                outfit = "T-Shirt";
                shoes = "Sandals";
            }else if(temperature>= 25 && temperature <= 42){
                outfit = "Swim Suit";
                shoes = "Barefoot";
            }
        } if(name.equals("Evening")){
            if(temperature >= 10 && temperature <= 42 ){
                outfit = "Shirt";
                shoes = "Moccasins";
            }
        }

        System.out.printf("It's %s degrees, get your %s and %s.", temperature,outfit,shoes);
    }
}
