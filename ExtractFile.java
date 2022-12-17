package textProcessing;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] filePath = input.split("\\\\");

        String fileFull = filePath[filePath.length - 1];
        String fileName = fileFull.split("\\.")[0];
        String fileExtension = fileFull.split("\\.")[1];

        System.out.printf("File name: %s%nFile extension: %s",fileName,fileExtension);
    }
}
