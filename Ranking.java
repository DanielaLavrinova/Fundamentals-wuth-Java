package mapsLabdaStreamAPI;

import java.util.*;

public class Ranking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        Map<String,String> contestMap = new LinkedHashMap<>();
        Map<String,Map<String,Integer>> studentsMap = new TreeMap<>();



        while(!inputLine.equals("end of contests")){
            String contest = inputLine.split(":")[0];
            String password = inputLine.split(":")[1];

            contestMap.put(contest,password);

            inputLine = scanner.nextLine();

        }

        String data = scanner.nextLine();

        while(!data.equals("end of submissions")){
            //{contest}=>{password}=>{username}=>{points}

            String currentContest = data.split("=>")[0];
            String currentPassword = data.split("=>")[1];
            String username = data.split("=>")[2];
            int points = Integer.parseInt(data.split("=>")[3]);

            if(contestMap.containsKey(currentContest)){
                String pass = contestMap.get(currentContest);
                if(pass.equals(currentPassword)){
                    Map<String,Integer> coursesMap = new TreeMap<>();
                    coursesMap.put(currentContest,points);


                    if(studentsMap.containsKey(username)){
                        if(studentsMap.get(username).containsKey(currentContest)){
                            int currentPoints = studentsMap.get(username).get(currentContest);
                            if(points > currentPoints){

                                studentsMap.get(username).put(currentContest,points);

                            }
                        }else {
                            studentsMap.get(username).put(currentContest,points);
                        }

                    }else{

                        studentsMap.put(username,coursesMap);
                    }

                }

            }

            data = scanner.nextLine();

        }

        String bestStudent = "";
        int highScore = 0;

        for (Map.Entry<String, Map<String, Integer>> entry : studentsMap.entrySet()) {
            Map<String,Integer> pointsMap = entry.getValue();
            String student = entry.getKey();
            int sum = 0;
            for (Map.Entry<String, Integer> e : pointsMap.entrySet()) {
                sum += e.getValue();

            }

            if(sum > highScore){
                highScore = sum;
                bestStudent = student;
            }

        }

        System.out.printf("Best candidate is %s with total %d points.%n",bestStudent,highScore);
        System.out.println("Ranking:");

        studentsMap.entrySet().forEach(e->{
            System.out.printf("%s%n",e.getKey());
            e.getValue().entrySet().stream().sorted((a, b) -> b.getValue() - a.getValue()).forEach(entry ->{
                System.out.printf("#  %s -> %d%n",entry.getKey(),entry.getValue());
            });
        });


    }
}
