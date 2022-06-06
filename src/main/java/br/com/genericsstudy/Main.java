package br.com.genericsstudy;

import br.com.genericsstudy.behavior.Draw;
import br.com.genericsstudy.model.*;

import static br.com.genericsstudy.behavior.DisplayGeneric.displayArrayOfAnything;
import static br.com.genericsstudy.behavior.DisplayArray.displayArray;

public class Main {

    public static void main(String[] args) {

        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {5.0, 4.0, 3.0, 2.0, 1.0};
        Character[] charArray = {'F','O','R','A','_','B','O','L','S','O','N','A','R','O'};
        String[] stringArray = {"FORA_BOLSONARO", "BOLSONARO_ESCÓRIA_DA_HUMANIDADE", "SAI_ZIKA_MILICIANA"};

        MyArray myArray = new MyArray(intArray, doubleArray, charArray, stringArray);

        /**
         * Display the array but in a Dumb way
         * We have four methods to do the same thing.
         * It doesn't make sense to use the same method since we have the generics.
         */
        displayArray(myArray.getIntArray());
        displayArray(myArray.getDoubleArray());
        displayArray(myArray.getCharArray());
        displayArray(myArray.getStringArray());

        /**
         * Display the array but in a Smarter way
         * Instead of calling the method four times to do the same thing,
         * we can use the same method with generics:
         */
        displayArrayOfAnything(myArray.getIntArray());
        displayArrayOfAnything(myArray.getDoubleArray());
        displayArrayOfAnything(myArray.getCharArray());
        displayArrayOfAnything(myArray.getStringArray());

        /**
         * Display the element of a game.
         * We can use the same method with generics to display
         * any element of the game: Player, NPC, Tree, Item, etc.
         */
        Draw.draw(new Tree());
        Draw.draw(new Item());
        Draw.draw(new Player());
        Draw.draw(new NonPlayerCharacter());

    }

}
