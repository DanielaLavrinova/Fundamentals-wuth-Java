package finalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NeedForSpeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String,Integer> carsMap = new LinkedHashMap<>();
        Map<String,Integer> fuelsMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\|");
            String car = data[0];
            int mileage = Integer.parseInt(data[1]);
            int fuel = Integer.parseInt(data[2]);

            carsMap.put(car,mileage);
            fuelsMap.put(car,fuel);

        }

        String input = scanner.nextLine();

        while(!input.equals("Stop")){
            String command = input.split(" : ")[0];
            String car = input.split(" : ")[1];

            if(command.equals("Drive")){
                int distance = Integer.parseInt(input.split(" : ")[2]);
                int fuel = Integer.parseInt(input.split(" : ")[3]);

                int currentFuel = fuelsMap.get(car);
                int currentDistance = carsMap.get(car);

                if(currentFuel < fuel){
                    System.out.println("Not enough fuel to make that ride");
                }else{
                    System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n"
                            ,car,distance,fuel);
                    currentFuel -= fuel;
                    fuelsMap.put(car,currentFuel);
                    currentDistance += distance;
                    carsMap.put(car,currentDistance);

                    if(currentDistance >= 100000){
                        carsMap.remove(car);
                        fuelsMap.remove(car);
                        System.out.printf("Time to sell the %s!%n",car);
                    }

                }

            }else if(command.equals("Refuel")){
                int fuelToRefill = Integer.parseInt(input.split(" : ")[2]);
                int currentFuel = fuelsMap.get(car);
                if(currentFuel + fuelToRefill > 75){
                    fuelToRefill = 75 - currentFuel;
                    currentFuel = 75;

                }else{
                    currentFuel += fuelToRefill;
                }

                fuelsMap.put(car,currentFuel);

                System.out.printf("%s refueled with %d liters%n",car,fuelToRefill);

            }else if(command.equals("Revert")){
                int kilometers = Integer.parseInt(input.split(" : ")[2]);
                int currentMileage = carsMap.get(car);
                currentMileage -= kilometers;

                if(currentMileage < 10000){
                    currentMileage = 10000;
                }else{
                    System.out.printf("%s mileage decreased by %d kilometers%n",car,kilometers);
                }

                carsMap.put(car,currentMileage);

            }

            input = scanner.nextLine();

        }

        carsMap.entrySet().forEach(e->{
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n",e.getKey(),e.getValue(),fuelsMap.get(e.getKey()));
        });
    }
}
