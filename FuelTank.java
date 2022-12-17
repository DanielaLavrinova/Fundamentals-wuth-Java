package FirstStepsInCoding;

import java.util.Scanner;

public class FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double fuel = Double.parseDouble(scanner.nextLine());

        if(name.equals("Diesel")){
            if(fuel < 25 ){
                System.out.printf("Fill your tank with %s!",name.toLowerCase());
            }else if(fuel >= 25){
                System.out.printf("You have enough %s.",name.toLowerCase());
            }

        }else if(name.equals("Gasoline")){
            if(fuel < 25 ){
                System.out.printf("Fill your tank with %s!",name.toLowerCase());
            }else if(fuel >= 25){
                System.out.printf("You have enough %s.",name.toLowerCase());
            }

        }else if(name.equals("Gas")){
            if(fuel < 25 ){
                System.out.printf("Fill your tank with %s!",name.toLowerCase());
            }else if(fuel >= 25){
                System.out.printf("You have enough %s.",name.toLowerCase());
            }
        }else {
            System.out.println("Invalid fuel!");
        }

    }
}
