package br.com.genericsstudy.behavior;

public class DisplayGeneric {

    /**
     * This is a method to display a generic type of data.
     * You can use this method to display any type of data.
     * Every time you have repetition of code, certainly,
     * something is wrong.
     * @param array - {T[] array} is a generic type of
     * array of any data you want to display.
     */
    public static <T> void displayArrayOfAnything(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println("\n");
    }

    /**
     * Method with generics to get the first
     * element of an array of any type of data.
     * @param array of anything
     * @return a data of Anything
     * @param <T>[]
     */
    public static <T> T getFirstElement(T[] array){
        return array[0];
    }

}
