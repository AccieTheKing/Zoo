package com.ing.zoo.animals.herbivore;

import com.ing.zoo.animals.Animal;

public class HerbivoreAnimal extends Animal implements HerbivoreAnimalBehaviour {

    public HerbivoreAnimal(String name) {
        super(name);
    }

    @Override
    public void eatLeaves() {

    }
}
