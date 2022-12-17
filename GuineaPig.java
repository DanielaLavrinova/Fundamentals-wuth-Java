package MidExam;

import java.util.Scanner;



public class GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double foodQuantity = Double.parseDouble(scanner.nextLine());
        double hayQuantity = Double.parseDouble(scanner.nextLine());
        double coverQuantity = Double.parseDouble(scanner.nextLine());
        double pigWeight = Double.parseDouble(scanner.nextLine());
        double amountHay = 0;
        double cover = 0;
        boolean isNotEnough = false;
        foodQuantity *= 1000;
        hayQuantity *= 1000;
        coverQuantity *= 1000;
        pigWeight *= 1000;

        for (int i = 1; i <= 30 ; i++) {

            foodQuantity -= 300;
            if(i % 2 == 0){
                amountHay = foodQuantity * 0.05;
                hayQuantity -= amountHay;
            }
            if(i % 3 == 0){
                cover = pigWeight / 3;
                coverQuantity -= cover;

            }

            if(foodQuantity <= 0 || hayQuantity <= 0 || coverQuantity <= 0){
                isNotEnough = true;
                break;
            }
        }

        if(isNotEnough){
            System.out.println("Merry must go to the pet store!");
        }else{
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.",foodQuantity / 1000,hayQuantity / 1000,coverQuantity / 1000);

        }
    }
}
