package PBExams;

import java.util.Scanner;

public class PaintingEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String size = scanner.nextLine();
        String color = scanner.nextLine();

        int quantity = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch(size){

            case "Large":
                if(color.equals("Red")){
                    price = quantity * 16;

                }else if(color.equals("Green")){
                    price = quantity * 12;

                }else if(color.equals("Yellow")){
                    price = quantity * 9;

                }
                break;
            case "Medium":
                if(color.equals("Red")){
                    price = quantity * 13;

                }else if(color.equals("Green")){
                    price = quantity * 9;

                }else if(color.equals("Yellow")){
                    price = quantity * 7;

                }
                break;
            case "Small":
                if(color.equals("Red")){
                    price = quantity * 9;

                }else if(color.equals("Green")){
                    price = quantity * 8;

                }else if(color.equals("Yellow")){
                    price = quantity * 5;

                }

        }

        price = price - price * 0.35;

        System.out.printf("%.2f leva.",price);

    }
}
