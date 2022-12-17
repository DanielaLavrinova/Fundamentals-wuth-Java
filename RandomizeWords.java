import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordsArray = scanner.nextLine().split("\\s+");

        Random random = new Random();

        for (int i = 0; i < wordsArray.length; i++) {
            int indexX = random.nextInt(wordsArray.length);
            int indexY = random.nextInt(wordsArray.length);

            String oldElement = wordsArray[indexX];
            wordsArray[indexX] = wordsArray[indexY];
            wordsArray[indexY] = oldElement;
        }

        for (String word:wordsArray) {
            System.out.println(word);
        }
    }
}
