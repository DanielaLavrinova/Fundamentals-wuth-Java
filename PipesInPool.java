package FirstStepsInCoding;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       int vVolumePool = Integer.parseInt(scanner.nextLine());
       int pFirstPipe = Integer.parseInt(scanner.nextLine());
       int pSecondPipe = Integer.parseInt(scanner.nextLine());
       double hTime = Double.parseDouble(scanner.nextLine());

       double volumeFirstPipe = pFirstPipe * hTime;
       double volumeSecondPipe = pSecondPipe * hTime;
       double volumePipes = volumeFirstPipe + volumeSecondPipe;
       double volumePercent = (volumePipes / vVolumePool) * 100;
       double volumePipe1 = (volumeFirstPipe / volumePipes) * 100;
       double volumePipe2 = (volumeSecondPipe / volumePipes) * 100;

       if(volumePipes <= vVolumePool){
           System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.",volumePercent,volumePipe1,volumePipe2);
       }else {
           System.out.printf("For %.2f hours the pool overflows with %.2f liters.",hTime,volumePipes - vVolumePool);
       }
    }
}
