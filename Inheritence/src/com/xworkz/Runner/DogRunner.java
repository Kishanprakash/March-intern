package com.xworkz.Runner;

import com.xworkz.Super.Animal;
import com.xworkz.sub.*;

public class DogRunner {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();
        myDog.sleep();
        myDog.sound();


        Animal animal = new Animal();
        animal.eat();
        animal.sleep();
        animal.sound();

        Elephant elephant =new Elephant();
        elephant.eat();
        elephant.sleep();
        elephant.sound();

        Cat cat =new Cat();
        cat.eat();
        cat.sleep();
        cat.sound();

        Tiger tiger =new Tiger();
        tiger.eat();
        tiger.sleep();
        tiger.sound();

        Lion lion =new Lion();
        lion.eat();
        lion.sleep();
        lion.sound();


    }
}
