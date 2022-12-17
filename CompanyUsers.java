package mapsLabdaStreamAPI;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        Map<String, List<String>> companyMap = new LinkedHashMap<>();
        List<String> listID = new ArrayList<>();

        while(!inputLine.equals("End")){
            String company = inputLine.split(" -> ")[0];
            String id = inputLine.split(" -> ")[1];

            if(!companyMap.containsKey(company)){
                companyMap.put(company,new ArrayList<>());
                companyMap.get(company).add(id);

            }else {
                listID = companyMap.get(company);
                if(!listID.contains(id)){
                    companyMap.get(company).add(id);
                }
            }

            inputLine = scanner.nextLine();

        }

        companyMap.entrySet().forEach(entry ->{
            System.out.printf("%s%n",entry.getKey());
            entry.getValue().forEach(id-> System.out.printf("-- %s%n",id));
        });
    }
}
