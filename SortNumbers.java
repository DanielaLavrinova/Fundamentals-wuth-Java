import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        int max = Math.max(a,Math.max(b,c));
        int min = Math.min(a,Math.min(b,c));
        int mid = a + b + c - max - min;

        System.out.printf("%d%n%d%n%d",max,mid,min);
    }
}
