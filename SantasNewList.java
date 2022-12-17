package finalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SantasNewList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,Integer> kidsMap = new TreeMap<>();
        Map<String,Integer> presentsMap = new LinkedHashMap<>();

        String data = scanner.nextLine();

        while(!data.equals("END")){
            String name = data.split("->")[0];

            if(!name.equals("Remove")){
                String present = data.split("->")[1];
                int amount = Integer.parseInt(data.split("->")[2]);
                if(kidsMap.containsKey(name)){
                    int currentAmount = kidsMap.get(name);
                    kidsMap.put(name,currentAmount + amount);
                }else{
                    kidsMap.put(name,amount);
                }

                if(!presentsMap.containsKey(present)){
                    presentsMap.put(present,amount);
                }else{
                    int currentQuantity = presentsMap.get(present);
                    presentsMap.put(present,currentQuantity + amount);
                }

            }else {
                String nameToRemove = data.split("->")[1];
                if(kidsMap.containsKey(nameToRemove)){
                    kidsMap.remove(nameToRemove);
                }

            }

            data = scanner.nextLine();

        }

        System.out.println("Children:");
        kidsMap.entrySet().stream().sorted((e1,e2)-> Integer.compare(e2.getValue(),e1.getValue())).forEach(e->{
            System.out.printf("%s -> %d%n",e.getKey(),e.getValue());
        });

        System.out.println("Presents:");

        presentsMap.entrySet().forEach(e->{
            System.out.printf("%s -> %d%n",e.getKey(),e.getValue());
        });
    }
}
