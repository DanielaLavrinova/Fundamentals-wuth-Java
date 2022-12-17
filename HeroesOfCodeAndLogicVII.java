package finalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String,Integer> heroesMap = new LinkedHashMap<>();
        Map<String,Integer> pointsMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(" ");
            String name = data[0];
            int hitPoints = Integer.parseInt(data[1]);
            int manaPoints = Integer.parseInt(data[2]);
            if(hitPoints > 100){
                hitPoints = 100;
            }
            if(manaPoints > 200){
                manaPoints = 200;
            }
            heroesMap.put(name,hitPoints);
            pointsMap.put(name,manaPoints);


        }

        String input = scanner.nextLine();

        while(!input.equals("End")){
            String command = input.split(" - ")[0];
            String heroName = input.split(" - ")[1];


            if(command.equals("CastSpell")){
                int requiredMP = Integer.parseInt(input.split(" - ")[2]);
                String spellName = input.split(" - ")[3];
                int currentMP = pointsMap.get(heroName);

                if(currentMP >= requiredMP){
                    currentMP -= requiredMP;
                    pointsMap.put(heroName,currentMP);
                    System.out.printf("%s has successfully cast %s " +
                            "and now has %d MP!%n",heroName,spellName,currentMP);

                }else{
                    System.out.printf("%s does not have enough MP to cast %s!%n",heroName,spellName);
                }

            }else if(command.equals("TakeDamage")){
                int damage = Integer.parseInt(input.split(" - ")[2]);
                String attacker = input.split(" - ")[3];
                int currentHP = heroesMap.get(heroName);
                currentHP -= damage;
                if(currentHP <= 0){
                    heroesMap.remove(heroName);
                    System.out.printf("%s has been killed by %s!%n",heroName,attacker);
                }else {
                    System.out.printf("%s was hit for %d HP " +
                            "by %s and now has %d HP left!%n",heroName,damage,attacker,currentHP);
                    heroesMap.put(heroName,currentHP);

                }

            }else if(command.equals("Recharge")){
                int amount = Integer.parseInt(input.split(" - ")[2]);
                int currentMP = pointsMap.get(heroName);
                currentMP += amount;

                if(currentMP > 200){
                    System.out.printf("%s recharged for %d MP!%n",heroName,200- (currentMP - amount));
                    currentMP = 200;

                }else{
                    System.out.printf("%s recharged for %d MP!%n",heroName,amount);
                }
                pointsMap.put(heroName,currentMP);

            }else if(command.equals("Heal")){
                int amount = Integer.parseInt(input.split(" - ")[2]);
                int currentHP = heroesMap.get(heroName);
                currentHP += amount;

                if(currentHP > 100){
                    System.out.printf("%s healed for %d HP!%n",heroName,100 - (currentHP - amount));
                    currentHP = 100;
                }else{
                    System.out.printf("%s healed for %d HP!%n",heroName,amount);
                }

                heroesMap.put(heroName,currentHP);

            }


            input = scanner.nextLine();

        }

        heroesMap.entrySet().forEach(e->{
            System.out.printf("%s%n" +
                    "  HP: %d%n" +
                    "  MP: %d%n",e.getKey(),e.getValue(),pointsMap.get(e.getKey()));
        });
    }
}
