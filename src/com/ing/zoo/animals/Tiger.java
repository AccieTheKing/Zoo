package com.ing.zoo.animals;

import com.ing.zoo.animals.carnivore.CarnivoreAnimal;

import java.util.Random;

public class Tiger extends CarnivoreAnimal {
    private static final String HELLO_TEXT = "rraaarww";
    private static final String EAT_MEAT_TEXT = "nomnomnom oink wubalubadubdub";

    public Tiger(String name) {
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

    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            setTrick("jumps in tree");
        } else {
            setTrick("scratches ears");
        }
        System.out.println(getTrick());
    }
}
