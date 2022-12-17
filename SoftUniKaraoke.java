package finalExam;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;

public class SoftUniKaraoke {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> participantsList = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());
        List<String> songsList = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        Map<String,String> namesMap = new LinkedHashMap<>();
        Map<String,List<String>> awardsMap = new LinkedHashMap<>();

        String data = scanner.nextLine();

        while(!data.equals("dawn")){
            String name = data.split(",\\s+")[0];
            String song = data.split(",\\s+")[1];
            String award = data.split(",\\s+")[2];

            if(participantsList.contains(name) && songsList.contains(song)){
                if(!awardsMap.containsKey(name)){
                    List<String> tempList = new ArrayList<>();
                    tempList.add(award);
                    awardsMap.put(name,tempList);
                }else {
                    List<String> currentAwards = awardsMap.get(name);
                    if(!currentAwards.contains(award)){
                        currentAwards.add(award);
                        awardsMap.put(name,currentAwards);
                    }
                }
            }

            data = scanner.nextLine();

        }

        if(awardsMap.size() > 0){
            awardsMap.entrySet().stream().sorted((e1,e2)-> Integer.compare(e2.getValue().size(),e1.getValue().size())).forEach(e->{
                System.out.printf("%s: %d awards%n",e.getKey(),e.getValue().size());
                List<String> entry = e.getValue().stream().sorted().collect(Collectors.toList());
                entry.forEach(element ->{
                    System.out.printf("--%s%n",element);
                });
            });

        }else{
            System.out.println("No awards");
        }

    }
}
