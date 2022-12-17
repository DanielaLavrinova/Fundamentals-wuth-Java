import java.util.Scanner;

public class ForeignLanguages {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String language = "";

        switch (country){

            case "England":
            case "USA":
                language = "English";
                break;
            case "Spain":
            case "Mexico":
            case "Argentina":
                language = "Spanish";
                break;
            default:
                language = "unknown";

        }

        System.out.println(language);
    }
}
