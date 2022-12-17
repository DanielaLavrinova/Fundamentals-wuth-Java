package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String message = scanner.nextLine();
        List<Character> messageList = new ArrayList<>();
        List<Character> lettersResult = new ArrayList<>();

        for (char letter:message.toCharArray()) {
            messageList.add(letter);

        }

        System.out.println();

        for (int i = 0; i < numbersList.size(); i++) {
            int number = numbersList.get(i);
            int index = 0;
            int length = messageList.size();


            while(number > 0){
                int digit = number % 10;
                index += digit;
                number/= 10;
            }

            if(index >= 0 && index < messageList.size()){
                char element = messageList.get(index);
                messageList.remove(index);
                lettersResult.add(element);
            }else {
                index = index - length ;
                char element = messageList.get(index);
                messageList.remove(index);
                lettersResult.add(element);
            }


        }

        for (char letter:lettersResult) {
            System.out.print(letter);
        }
    }

}
