import java.util.Scanner;

public class Bookshelve {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        String bookName = scanner.next();
        bookName += scanner.nextLine();
        String currentBook = scanner.next();
        currentBook += scanner.nextLine();
        int countBook = 0;

        while(!currentBook.equals("No More Books")){
            if(currentBook.equals(bookName)){
                System.out.printf("You checked %d books and found it.",countBook);
                break;
            }
            countBook ++;
            currentBook = scanner.next();
            currentBook += scanner.nextLine();
        }
        if(currentBook.equals("No More Books")){
        System.out.printf("The book you search is not here!%nYou checked %d books.",countBook);
        }
    }
}
