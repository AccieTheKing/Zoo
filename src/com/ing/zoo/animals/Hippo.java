package com.ing.zoo.animals;

import com.ing.zoo.animals.herbivore.HerbivoreAnimal;

public class Hippo extends HerbivoreAnimal {
    private static final String HELLO_TEXT = "splash";
    private static final String EAT_LEAVES_TEXT = "munch munch lovely";

    public Hippo(String name) {
        super(name);
    }

    public void sayHello() {
        setHelloText(HELLO_TEXT);
        System.out.println(getHelloText());
    }

    public void eatLeaves() {
        setEatText(EAT_LEAVES_TEXT);
        System.out.println(getEatText());
    }
}
