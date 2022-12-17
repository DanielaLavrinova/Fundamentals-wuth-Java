package mapsLabdaStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        Map<String,Integer> studentsMap = new LinkedHashMap<>();
        Map<String,Integer> languageMap = new LinkedHashMap<>();

        while(!inputLine.equals("exam finished")){
            String nameStudent = inputLine.split("-")[0];
            String language = inputLine.split("-")[1];


            if(language.equals("banned")){
                if(studentsMap.containsKey(nameStudent)){
                    studentsMap.remove(nameStudent);
                }

            }else{
                int points = Integer.parseInt(inputLine.split("-")[2]);
                if(!languageMap.containsKey(language)){
                    languageMap.put(language,1);
                }else{
                    int currentValue = languageMap.get(language);
                    languageMap.put(language,currentValue + 1);
                }

                if(!studentsMap.containsKey(nameStudent)){
                    studentsMap.put(nameStudent,points);
                }else{
                    int currentPoints = studentsMap.get(nameStudent);
                    if(points > currentPoints){
                        studentsMap.put(nameStudent,points);
                    }
                }
            }


            inputLine = scanner.nextLine();

        }

        System.out.println("Results:");

        studentsMap.entrySet().forEach(entry -> {
            System.out.printf("%s | %d%n",entry.getKey(),entry.getValue());
        });

        System.out.println("Submissions:");

        languageMap.entrySet().forEach(entry -> {
            System.out.printf("%s - %d%n",entry.getKey(),entry.getValue());
        });
    }
}
