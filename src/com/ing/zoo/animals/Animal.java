package com.ing.zoo.animals;

/**
 * This class is an Abstraction of all the animals, this class contains the
 * main attributes and behaviours
 *
 * @author Acdaling Edusei
 */
public abstract class Animal implements GenericAnimalBehaviour {
    private String name;
    private String helloText;
    private String eatText;
    private String trick;

    /**
     * Constructor
     *
     * @param name the given name of the animal
     */
    public Animal(String name) {
        this.name = name;
    }

    public void sayHello() {
        helloText = "zebra zebra";
        System.out.println(helloText);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHelloText() {
        return helloText;
    }

    public void setHelloText(String helloText) {
        this.helloText = helloText;
    }

    public String getEatText() {
        return eatText;
    }

    public void setEatText(String eatText) {
        this.eatText = eatText;
    }

    public String getTrick() {
        return trick;
    }

    public void setTrick(String trick) {
        this.trick = trick;
    }
}
