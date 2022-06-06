package br.com.genericsstudy.model;

/**
 * This is a generic class of one type T, but not so generic.
 * This class are bounded to the limits of Number class,
 * since it extends the Number class.
 *
 * So you can use this class to receive any type of Number.
 * See {@link Number} doc to understand the limitations of Number class.
 * @author reinaldo_neves@hotmail.com
 */
public class MyBoundedType <N extends Number>{

    private N number;

    public MyBoundedType(N number){
        this.number = number;
    }

    public N getValue(){
        return number;
    }

}
