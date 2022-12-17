package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SchoolLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> books = Arrays.stream(scanner.nextLine().split("\\&")).collect(Collectors.toList());

        String inputLine = scanner.nextLine();

        while(!inputLine.equals("Done")){
            String bookToAdd = inputLine.split("\\|")[0];
            String command = bookToAdd.split(" ")[0];

            switch (command){
                case "Add":
                    String addBook = inputLine.split("\\| ")[1];
                    if(!books.contains(addBook)){
                        books.add(0,addBook);
                    }
                    break;
                case "Take":
                    String takeBook = inputLine.split("\\| ")[1];

                    for (int i = 0; i < books.size(); i++) {
                        if(takeBook.equals(books.get(i))){
                            books.remove(i);
                        }
                    }



                    break;
                case "Swap":
                    String bookOne = inputLine.split(" \\| ")[1];
                    String bookTwo = inputLine.split(" \\| ")[2];

                    int firstBookIndex = 0;
                    int secondBookIndex = 0;
                    boolean flagOne = false;
                    boolean flagTwo = false;


                        for (int i = 0; i < books.size(); i++) {
                            String element = books.get(i);

                            if(bookOne.equals(element)){
                                firstBookIndex = i;
                                flagOne = true;
                            }
                            if(bookTwo.equals(element)){
                                secondBookIndex = i;
                                flagTwo = true;
                            }
                        }
                        if(flagOne && flagTwo){
                            books.set(firstBookIndex,bookTwo);
                            books.set(secondBookIndex,bookOne);
                        }


                    break;
                case "Insert":
                    String insertBook = inputLine.split("\\| ")[1];
                    if(!books.contains(insertBook)){
                        books.add(insertBook);
                    }
                    break;
                case "Check":
                    int index = Integer.parseInt(inputLine.split("\\| ")[1]);

                    if(index >= 0 && index < books.size()){
                        System.out.println(books.get(index));

                    }
                    break;

            }



            inputLine = scanner.nextLine();

        }

        System.out.println(String.join(", ",books));


    }
}
