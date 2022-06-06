package br.com.genericsstudy.model;

/**
 * This is a generic class of one type T.
 * T is anything that you want to use.
 * @author reinaldo_neves@hotmail.com
 * @param <T>
 */
public class MyGenericClass <T>{

    private T element;
    public MyGenericClass(T element){
        this.element = element;
    }

    public T getValue(){
        return element;
    }

}
