package br.com.genericsstudy;

import br.com.genericsstudy.behavior.Draw;
import br.com.genericsstudy.model.*;

import java.util.ArrayList;
import java.util.HashMap;

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

        /***
         * Working with generic classes
         * Bellow, we have four classes that work the same way.
         * Instead, you can use a generic class to receive any type of data.
         */

        MyIntegerClass myIntegerClass = new MyIntegerClass(10);
        MyDoubleClass myDoubleClass = new MyDoubleClass(10.0);
        MyCharacterClass myCharClass = new MyCharacterClass('A');
        MyStringClass myStringClass = new MyStringClass("MILES DAVIS");

        System.out.println(myIntegerClass.getValue());
        System.out.println(myDoubleClass.getValue());
        System.out.println(myCharClass.getValue());
        System.out.println(myStringClass.getValue());

        /**
         * The same thing above, but with generic class
         */
        MyGenericClass<Integer> myInt = new MyGenericClass<>(10);
        MyGenericClass<Double> myDouble = new MyGenericClass<>(10.0);
        MyGenericClass<Character> myChar = new MyGenericClass<>('A');
        MyGenericClass<String> myString = new MyGenericClass<>("MILES DAVIS");

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());

        /**
         * Take a look at Array list.
         * You see that is exactly how we instantiate a generic class above.
         * A ArrayList is a implementation of a list of any type of data. :)
         */
        ArrayList<String> jazzLegends = new ArrayList<>();
        jazzLegends.add("Miles Davis");
        jazzLegends.add("John Coltrane");
        jazzLegends.add("Ron Carter");
        jazzLegends.add("Bill Evans");

        /**
         * Instead of one generic type to receive any type of data,
         * your class can receive TWO types of any data type.
         */
        MyTwoGenericsClass<Integer,Integer> myTwoIntegers = new MyTwoGenericsClass<>(10,20);
        MyTwoGenericsClass<Integer,String> myIntString = new MyTwoGenericsClass<>(10,"MILES DAVIS");
        MyTwoGenericsClass<String,Character> myStringChar = new MyTwoGenericsClass<>("Bill Evans",'P');
        MyTwoGenericsClass<String,String> myTwoStrings = new MyTwoGenericsClass<>("Miles Davis","Trumpet");


        /**
         * The same thing to a Hasmap.
         * Symply a class that has a key and a value.
         * key and value are generic types of data.
         */
        HashMap<String, String> choroLegends = new HashMap<>();
        choroLegends.put("Pixinguinha", "Flauta");
        choroLegends.put("Jacob do Bandolim", "Bandolim");
        choroLegends.put("Altamiro Carrilho", "Flauta");
        choroLegends.put("Garoto","Violão");



    }

}
