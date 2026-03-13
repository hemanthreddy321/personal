package com.hcl.corejava;

public class Program8 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.walk();
        dog.eat();
        dog.bark();
    }
}

class Animal {
    void walk() {
        System.out.println("I am walking\n");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("I am eating\n");
    }

    void bark() {
        System.out.println("I am barking\n");
    }
}


