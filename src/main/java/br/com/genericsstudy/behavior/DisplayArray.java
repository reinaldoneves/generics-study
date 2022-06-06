package br.com.genericsstudy.behavior;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class DisplayArray {

    public static void displayArray(Integer[] array) {
        for (Integer element : array) {
            System.out.print(element + " ");
        }
        System.out.println("\n");
    }

    public static void displayArray(Double[] array) {
        for (Double element : array) {
            System.out.print(element + " ");
        }
        System.out.println("\n");
    }

    public static void displayArray(Character[] array) {
        for (Character element : array) {
            System.out.print(element + " ");
        }
        System.out.println("\n");
    }

    public static void displayArray(String[] array) {
        for (String element : array) {
            System.out.print(element + " ");
        }
        System.out.println("\n");
    }

}
