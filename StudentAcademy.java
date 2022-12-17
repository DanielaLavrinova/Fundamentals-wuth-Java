package mapsLabdaStreamAPI;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentsMap = new LinkedHashMap<>();

        for (int i = 1; i <= n ; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if(!studentsMap.containsKey(name)){
                studentsMap.put(name,new ArrayList<>());
            }
            studentsMap.get(name).add(grade);

        }

        Map<String,Double> averageGrade = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry : studentsMap.entrySet()) {
            List<Double> grades = entry.getValue();
            double average = getAverage(grades);

            averageGrade.put(entry.getKey(), average);

        }

        averageGrade.entrySet().stream().filter(entry -> entry.getValue() >= 4.50)
                .forEach(entry -> {
                    System.out.printf("%s -> %.2f%n",entry.getKey(),entry.getValue());
                });

    }

    private static double getAverage(List<Double> grades) {
        double sum = 0;
        for (double number:grades) {
            sum += number;
        }

        return  sum / grades.size();
    }
}
