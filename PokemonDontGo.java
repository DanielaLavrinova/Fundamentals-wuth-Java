package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> pokemonList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int sumRemovedElements = 0;

        while(pokemonList.size() > 0){
            int index = Integer.parseInt(scanner.nextLine());
            int firstElement = 0;
            int lastElement = 0;
            int removedElement = 0;

            if(index < 0){
                firstElement = pokemonList.get(0);
                lastElement = pokemonList.get(pokemonList.size()-1);
                pokemonList.set(0,lastElement);
                removedElement = firstElement;

            }else if(index > pokemonList.size() -1){
                firstElement = pokemonList.get(0);
                lastElement = pokemonList.get(pokemonList.size()-1);
                pokemonList.set(pokemonList.size() - 1,firstElement);
                removedElement = lastElement;

            }else{
                removedElement = pokemonList.get(index);
                pokemonList.remove(index);

            }

            for (int i = 0; i < pokemonList.size(); i++) {
                int currentElement = pokemonList.get(i);
                if(currentElement <= removedElement){
                    currentElement += removedElement;
                }else{
                    currentElement -= removedElement;

                }
                pokemonList.set(i,currentElement);
            }

            sumRemovedElements += removedElement;

        }

        System.out.println(sumRemovedElements);
    }
}
