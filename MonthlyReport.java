package retakeFinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MonthlyReport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String,Double> distributorMap = new LinkedHashMap<>();
        Map<String,Double> clientsMap = new LinkedHashMap<>();

        double totalClientsSpent = 0;

        while(!input.equals("End")){
            String command = input.split(" ")[0];
            String name = input.split(" ")[1];
            double money = Double.parseDouble(input.split(" ")[2]);

            switch (command){
                case "Deliver":
                    if(!distributorMap.containsKey(name)){
                        distributorMap.put(name,money);

                    }else{
                        double currentMoney = distributorMap.get(name);
                        distributorMap.put(name,currentMoney + money);

                    }
                    break;
                case "Return":
                    if(distributorMap.containsKey(name)){
                        double spentMoney = distributorMap.get(name);
                        if(spentMoney >= money){
                            spentMoney -= money;
                            if(spentMoney <= 0){
                                distributorMap.remove(name);
                            }else{
                                distributorMap.put(name,spentMoney);
                            }

                        }
                    }
                    break;


                case "Sell":
                    totalClientsSpent += money;

                    if(!clientsMap.containsKey(name)){
                        clientsMap.put(name,money);

                    }else{
                        double moneyClient = clientsMap.get(name);
                        clientsMap.put(name,moneyClient + money);

                    }
                    break;
            }

            input = scanner.nextLine();

        }

        clientsMap.entrySet().forEach(e->{
            System.out.printf("%s: %.2f%n",e.getKey(),e.getValue());
        });
        System.out.println("-----------");
        distributorMap.entrySet().forEach(e->{
            System.out.printf("%s: %.2f%n",e.getKey(),e.getValue());
        });
        System.out.println("-----------");
        System.out.printf("Total Income: %.2f",totalClientsSpent);

    }
}
