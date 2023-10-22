package com.internshala.javaapp.rectangle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<dog> dogList = new ArrayList();

        dogList.add(new dog());
        dogList.add(new dog());

        for(dog d: dogList){
            d.setName("e333");
            System.out.println(d.getName());
            d.run();

        }

//        puppy d1 = new puppy();
//        d1.setName("Tommy");
//        d1.setColor("Black");
//        d1.setBreed("labrador");
//
//        d1.run();
//        d1.bark();
//        System.out.println(d1.getColor());
//        d1.cute();
//        System.out.println();
//
//        cat c1 = new cat();
//        c1.setName("Alexa");
//        c1.setPattern("white with black spots.");
//        c1.run();                                   // method overriding(runtime polymorphism
//        c1.meow();
//        System.out.println(c1.getPattern());
    }
}
