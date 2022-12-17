package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CarRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> carRace = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int middleIndex = carRace.size()/ 2;

        double firstCar = 0;
        double secondCar = 0;

        for (int i = 0; i < middleIndex; i++) {
            int element = carRace.get(i);
            if(element != 0){
                firstCar += element;
            }else{
                firstCar = firstCar - firstCar * 0.20;
            }

        }

        for (int i = carRace.size() - 1; i > middleIndex ; i--) {
            int element = carRace.get(i);
            if(element != 0){
                secondCar += element;
            }else{
                secondCar = secondCar - secondCar * 0.20;
            }
        }

        if(firstCar < secondCar){
            System.out.printf("The winner is left with total time: %.1f",firstCar);
        }else if(secondCar < firstCar){
            System.out.printf("The winner is right with total time: %.1f",secondCar);
        }
    }
}
