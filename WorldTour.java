package finalExam;

import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stops = scanner.nextLine();
        String data = scanner.nextLine();
        StringBuilder manipulateStops = new StringBuilder(stops);

        while(!data.equals("Travel")){
            String command = data.split("\\:")[0];
            int index = 0;
            if(command.equals("Add Stop")){
                index = Integer.parseInt(data.split("\\:")[1]);
                String addStop = data.split("\\:")[2];
                if(isValidIndex(index,manipulateStops)){
                    manipulateStops.insert(index,addStop);

                }

            }else if(command.equals("Remove Stop")){
                index = Integer.parseInt(data.split("\\:")[1]);
                int endIndex = Integer.parseInt(data.split("\\:")[2]);
                if(isValidIndex(index,manipulateStops) && isValidIndex(endIndex,manipulateStops)){
                    manipulateStops.delete(index,endIndex + 1);


                }

            }else if(command.equals("Switch")){
                String oldStop = data.split("\\:")[1];
                String newStop = data.split("\\:")[2];

                String updatedStops = manipulateStops.toString().replaceAll(oldStop,newStop);
                manipulateStops = new StringBuilder(updatedStops);

            }

            System.out.println(manipulateStops);
            data = scanner.nextLine();

        }

        System.out.printf("Ready for world tour! Planned stops: %s",manipulateStops);
    }

    private static boolean isValidIndex(int index,StringBuilder manipulateStops) {
        int length = manipulateStops.length();
        if(index >= 0 && index <= manipulateStops.length()- 1){
            return  true;
        }
        return false;
    }
}
