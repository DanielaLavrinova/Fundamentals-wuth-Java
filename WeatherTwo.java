package FirstStepsInCoding;

import java.util.Scanner;

public class WeatherTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         double celsius = Double.parseDouble(scanner.nextLine());

         if(celsius >= 5 && celsius < 12){
             System.out.println("Cold");
         } else if(celsius >= 12 && celsius < 15){
             System.out.println("Cool");
         }else if(celsius >= 15 && celsius <= 20){
             System.out.println("Mild");
         }else if(celsius >20 && celsius < 26){
             System.out.println("Warm");
         }else if(celsius >= 26 && celsius <= 35){
             System.out.println("Hot");
         }else {
             System.out.println("unknown");
         }
    }
}
