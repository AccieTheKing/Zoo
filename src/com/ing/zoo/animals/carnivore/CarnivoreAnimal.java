package com.ing.zoo.animals.carnivore;

import com.ing.zoo.animals.Animal;

public abstract class CarnivoreAnimal extends Animal implements CarnivoreAnimalBehaviour {

    public CarnivoreAnimal(String name) {
        super(name);
    }

    @Override
    public void eatMeat() {

    }
}
