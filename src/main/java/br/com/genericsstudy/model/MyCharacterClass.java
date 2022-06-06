package br.com.genericsstudy.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class MyCharacterClass {

    Character c;

    public char getValue(){
        return c;
    }

}
