package com.ing.zoo.animals;

import com.ing.zoo.animals.carnivore.CarnivoreAnimal;
import com.ing.zoo.animals.herbivore.HerbivoreAnimalBehaviour;

import java.util.Random;

public class Pig extends CarnivoreAnimal implements HerbivoreAnimalBehaviour {
    private static final String HELLO_TEXT = "splash";
    private static final String EAT_LEAVES_TEXT = "munch munch oink";
    private static final String EAT_MEAT_TEXT = "munch munch oink";

    public Pig(String name) {
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

    public void eatMeat() {
        setEatText(EAT_MEAT_TEXT);
        System.out.println(getEatText());
    }

    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            setTrick("rolls in the mud");
        } else {
            setTrick("runs in circles");
        }
        System.out.println(getTrick());
    }
}
