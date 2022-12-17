package finalExam;

import java.util.*;

public class HeroRecruitment04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> heroesMap = new LinkedHashMap<>();


        while(!input.equals("End")){
            String command = input.split(" ")[0];
            String heroName = input.split(" ")[1];

            switch (command){
                case "Enroll":
                    if(!heroesMap.containsKey(heroName)){
                        heroesMap.put(heroName,new ArrayList<>());

                    }else {
                        System.out.printf("%s is already enrolled.%n",heroName);
                    }
                    break;
                case "Learn":
                    String spellName = input.split(" ")[2];
                    if(!heroesMap.containsKey(heroName)){
                        System.out.printf("%s doesn't exist.%n",heroName);
                    }else {
                        List<String> currentList = heroesMap.get(heroName);
                        if(currentList.contains(spellName)){
                            System.out.printf("%s has already learnt %s.%n",heroName,spellName);
                        }else{
                            currentList.add(spellName);
                            heroesMap.put(heroName,currentList);
                        }
                    }
                    break;
                case "Unlearn":
                    String spellToRemove = input.split(" ")[2];

                    if(!heroesMap.containsKey(heroName)){

                        System.out.printf("%s doesn't exist.%n",heroName);

                    }else{
                        List<String> spellCollection = heroesMap.get(heroName);
                        if(!spellCollection.contains(spellToRemove)){

                            System.out.printf("%s doesn't know %s.%n",heroName,spellToRemove);

                        }else{
                            spellCollection.remove(spellToRemove);

                        }
                    }

            }


            input = scanner.nextLine();

        }

        System.out.println("Heroes:");

        heroesMap.entrySet().forEach(e->{
            System.out.printf("== %s: ",e.getKey());
            e.getValue().forEach(entry->{
                System.out.print(String.join(", ",entry));
            });
            System.out.println();
        });
    }
}
