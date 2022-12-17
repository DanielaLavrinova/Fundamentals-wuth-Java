package mapsLabdaStreamAPI;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        Map<String, List<String>> studentsMap = new LinkedHashMap<>();

        while(!inputLine.equals("end")){
            String course = inputLine.split(" : ")[0];
            String nameStudent = inputLine.split(" : ")[1];

            if(!studentsMap.containsKey(course)){
                studentsMap.put(course,new ArrayList<>());
            }

            studentsMap.get(course).add(nameStudent);

            inputLine = scanner.nextLine();

        }

        studentsMap.entrySet().forEach(e ->{
            System.out.printf("%s: %d%n",e.getKey(),e.getValue().size());
            e.getValue().forEach(student -> System.out.printf("-- %s%n",student));
        });
    }
}
