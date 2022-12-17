package mapsLabdaStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String,String> dataMap = new LinkedHashMap<>();

        for (int i = 1; i <= n ; i++) {
            String inputLine = scanner.nextLine();
            String command = inputLine.split("\\s+")[0];
            String name = inputLine.split("\\s+")[1];

            if(command.equals("register")){
                String carNumber = inputLine.split("\\s+")[2];
                if(!dataMap.containsKey(name)){
                    dataMap.put(name,carNumber);
                    System.out.printf("%s registered %s successfully%n",name,carNumber);

                }else{
                    System.out.printf("ERROR: already registered with plate number %s%n",dataMap.get(name));
                }

            }else if(command.equals("unregister")){
                if(!dataMap.containsKey(name)){
                    System.out.printf("ERROR: user %s not found%n",name);

                }else{
                    System.out.printf("%s unregistered successfully%n",name);
                    dataMap.remove(name,dataMap.get(name));
                }

            }

        }

        dataMap.entrySet().forEach(e -> {
            System.out.printf("%s => %s%n",e.getKey(),e.getValue());
        });
    }
}
