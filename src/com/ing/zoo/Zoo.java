package com.ing.zoo;

import com.ing.zoo.animals.*;
import com.ing.zoo.animals.carnivore.CarnivoreAnimal;
import com.ing.zoo.animals.herbivore.HerbivoreAnimal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<Animal> animalArrayList = new ArrayList<>();
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        animalArrayList.addAll(List.of(
                new Lion("henk"),
                new Hippo("elsa"),
                new Pig("dora"),
                new Tiger("dora"),
                new Zebra("marty")
        ));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");
        String input = scanner.nextLine();

        if (input.equals(commands[1])) {
            for (Animal animal : animalArrayList) {
                if (animal instanceof HerbivoreAnimal) {
                    ((HerbivoreAnimal) animal).eatLeaves();
                }
            }
        } else if (input.equals(commands[2])) {
            for (Animal animal : animalArrayList) {
                if (animal instanceof CarnivoreAnimal) {
                    ((CarnivoreAnimal) animal).eatMeat();
                }
            }
        } else if (input.equals(commands[3])) {
            for (Animal animal : animalArrayList) {
                if (animal.getTrick() != null) {
                    animal.getTrick();
                }
            }
        } else {
            for (Animal animal : animalArrayList) {
                if (input.equals(commands[0] + String.format(" %s", animal.getName()))) {
                    animal.sayHello();
                } else if (input.equals(commands[0])) {
                    animal.sayHello();
                } else {
                    System.out.println("Unknown command: " + input);
                    break;
                }
            }
        }


    }

}
