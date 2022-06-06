package br.com.genericsstudy.behavior;

/***
 * This is a class to draw objects of a game of any type.
 * @author reinaldo_neves@hotmail.com
 *
 */
public class Draw {

    public static <T> void draw(T element) {
        System.out.println(element.toString());
    }

}
