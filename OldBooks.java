import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bookName = scanner.next();
        bookName += scanner.nextLine();
        int totalBooks = 0;

        while(true){
            String nextBook = scanner.next();
            nextBook += scanner.nextLine();
            if (nextBook.equals(bookName)){
                System.out.printf("You checked %d books and found it!",totalBooks);

            }else if(nextBook.equals("No More Books")){
                break;
            }
            totalBooks ++;
        }
        System.out.println("The book you search is not here!");
        System.out.printf("You checked %d books.",totalBooks);

    }
}
