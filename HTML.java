package textProcessing;

import java.util.Scanner;

public class HTML {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String header = scanner.nextLine();
        String article = scanner.nextLine();
        String content = scanner.nextLine();
        System.out.println("<h1>");
        System.out.println("\t" + header);
        System.out.println("</h1>");
        System.out.println("<article>");
        System.out.println("\t" + article);
        System.out.println("</article>");


        while(!content.equals("end of comments")){
            System.out.println("<div>");
            System.out.println("\t" + content);
            System.out.println("</div>");

            content = scanner.nextLine();

        }
    }
}
