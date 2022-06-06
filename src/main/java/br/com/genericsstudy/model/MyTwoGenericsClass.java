package br.com.genericsstudy.model;

/**
 * This is a generic class of one type T and V.
 * Both T and V are anything that you want to use.
 * @author reinaldo_neves@hotmail.com
 * @param <T, V>
 */
public class MyTwoGenericsClass<T,V>{

    private T thing1;
    private V thing2;

    public MyTwoGenericsClass(T thing1, V thing2) {
        this.thing1 = thing1;
        this.thing2 = thing2;
    }

    public T getThing1() {
        return thing1;
    }

    public V getThing2() {
        return thing2;
    }
}
