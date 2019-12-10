package com.ing.zoo.animals;

import com.ing.zoo.animals.herbivore.HerbivoreAnimal;

public class Zebra extends HerbivoreAnimal {
    private static final String HELLO_TEXT = "zebra zebra";
    private static final String EAT_LEAVES_TEXT = "munch munch zank yee bra";
    public String trick;

    public Zebra(String name) {
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
