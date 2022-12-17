package finalExam;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String,Map<String,String>> pieceMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String data = scanner.nextLine();
            String piece = data.split("\\|")[0];
            String composer = data.split("\\|")[1];
            String key = data.split("\\|")[2];

            Map<String,String> tempMap = new LinkedHashMap<>();
            tempMap.put(composer,key);
            pieceMap.put(piece,tempMap);

        }

        String input = scanner.nextLine();

        while(!input.equals("Stop")){
            String command = input.split("\\|")[0];
            String pieceToManipulate = input.split("\\|")[1];

            if(command.equals("Add")){
                String composerToManipulate = input.split("\\|")[2];
                String keyToManipulate = input.split("\\|")[3];

                if(pieceMap.containsKey(pieceToManipulate)){
                    System.out.printf("%s is already in the collection!%n",pieceToManipulate);
                }else{
                    Map<String,String> mapToAdd = new LinkedHashMap<>();
                    mapToAdd.put(composerToManipulate,keyToManipulate);
                    pieceMap.put(pieceToManipulate,mapToAdd);

                    System.out.printf("%s by %s in %s added to the collection!%n",pieceToManipulate,composerToManipulate
                    ,keyToManipulate);
                }

            }else if(command.equals("Remove")){
                if(pieceMap.containsKey(pieceToManipulate)){
                    pieceMap.remove(pieceToManipulate);
                    System.out.printf("Successfully removed %s!%n",pieceToManipulate);
                }else{
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n",pieceToManipulate);
                }

            }else if(command.equals("ChangeKey")){
                String keyToChange = input.split("\\|")[2];
                if(pieceMap.containsKey(pieceToManipulate)){
                    Map<String,String> mapToChange = new HashMap<>();
                    mapToChange = pieceMap.get(pieceToManipulate);
                    String[] keys = mapToChange.keySet().toArray(new String[0]);
                    String composerName = keys[0];
                    pieceMap.get(pieceToManipulate).put(composerName,keyToChange);

                    System.out.printf("Changed the key of %s to %s!%n",pieceToManipulate,keyToChange);
                }else{
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n",pieceToManipulate);
                }

            }

            input = scanner.nextLine();

        }

        pieceMap.entrySet().forEach(e->{
            System.out.printf("%s -> ",e.getKey());
            e.getValue().entrySet().forEach(element ->
            {System.out.printf("Composer: %s, Key: %s%n",element.getKey(),element.getValue());
            });
        });

        System.out.println();
    }
}
