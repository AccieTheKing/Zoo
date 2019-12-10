package com.ing.zoo.animals;

import com.ing.zoo.animals.carnivore.CarnivoreAnimal;

public class Lion extends CarnivoreAnimal {
    private static final String HELLO_TEXT = "roooaoaaaaar";
    private static final String EAT_MEAT_TEXT = "nomnomnom thx mate";

    public Lion(String name) {
        super(name);
    }

    public void sayHello() {
        setHelloText(HELLO_TEXT);
        System.out.println(getHelloText());
    }

    public void eatMeat() {
        setEatText(EAT_MEAT_TEXT);
        System.out.println(getEatText());
    }
}
