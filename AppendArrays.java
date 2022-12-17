package Lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbersList = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        Collections.reverse(numbersList);
       // String noSpaces = numbersList.toString().replaceAll("[\\[\\], \\s+]","");
        String noSpaces = numbersList.toString().replaceAll("[\\[\\],]","");
        noSpaces = noSpaces.replaceAll("\\s+","");
        char[] numbers= noSpaces.toCharArray();

        for (char element:numbers) {
            System.out.print(element + " ");
        }

    }
}
