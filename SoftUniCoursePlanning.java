package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> coursesList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while(!command.equals("course start")){
            String action = command.split(":")[0];
            String lesson = command.split(":")[1];


            switch (action){
                case "Add":
                    boolean isFound = false;
                    for (int i = 0; i < coursesList.size(); i++) {
                        String element = coursesList.get(i);
                        if(element.equals(lesson)){
                            isFound = true;
                            break;
                        }

                    }
                    if(!isFound){
                       coursesList.add(lesson);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(command.split(":")[2]);
                    boolean isExist = false;
                    for (int i = 0; i < coursesList.size(); i++) {
                        String element = coursesList.get(i);
                        if(element.equals(lesson)){
                            isExist = true;
                            break;
                        }

                    }
                    if(!isExist && index >= 0 && index <= coursesList.size() - 1){
                        coursesList.add(index,lesson);
                    }
                    break;
                case "Remove":
                    for (int i = 0; i < coursesList.size(); i++) {
                        String element = coursesList.get(i);

                        if(element.equals(lesson)){
                            coursesList.remove(i);
                        }

                    }
                    String exerciseToRemove = lesson + "-Exercise";
                    if(coursesList.contains(exerciseToRemove)){
                        coursesList.remove(exerciseToRemove);
                    }
                    break;
                case "Swap":
                    String lessonToSwap = command.split(":")[2];
                    int firstIndex = 0;
                    int secondIndex = 0;
                    boolean firstLesson = false;
                    boolean secondLesson = false;
                    for (int i = 0; i < coursesList.size(); i++) {
                        String element = coursesList.get(i);

                        if(element.equals(lesson)){
                            firstIndex = i;
                            firstLesson = true;
                        }
                        if(element.equals(lessonToSwap)){
                            secondIndex = i;
                            secondLesson = true;

                        }

                    }

                    String firstExercise = lesson + "-Exercise";
                    String secondExercise = lessonToSwap + "-Exercise";

                    if(secondLesson && firstLesson){
                        coursesList.set(firstIndex,lessonToSwap);
                        coursesList.set(secondIndex,lesson);

                        if(coursesList.contains(firstExercise)){
                            coursesList.remove(firstExercise);
                            coursesList.add(secondIndex + 1,firstExercise);
                        }
                        if(coursesList.contains(secondExercise)){
                            coursesList.remove(secondExercise);
                            coursesList.add(firstIndex + 1,secondExercise);
                        }

                    }
                    break;
                case "Exercise":
                    int lessonIndex = 0;
                    boolean isLessonFound = false;
                    for (int i = 0; i < coursesList.size(); i++) {
                        String element = coursesList.get(i);
                        if(lesson.equals(element)){
                            lessonIndex = i;
                            isLessonFound = true;
                        }

                    }
                    String exercise = lesson + "-Exercise";

                    if(isLessonFound){

                        if( lessonIndex <= coursesList.size() - 1 && !coursesList.contains(exercise)){
                            coursesList.add(lessonIndex + 1,exercise);
                        }
                    }else{
                        coursesList.add(lesson);
                        coursesList.add(exercise);

                    }
                    break;
            }


            command = scanner.nextLine();

        }

        int i = 1;
        for (String lesson:coursesList) {
            System.out.printf("%d.%s%n",i,lesson);
            i ++;
        }
    }
}
