package com.hcl.corejava;

public class Program7 {

    public static void main(String[] args) {
        Bike M = new Bike();

    }

}

class Cycle {
    String define_me() {
        return "a vehicle with pedals.";
    }
}

class Bike extends Cycle {
    Bike() {
        System.out.println("Hello I am a Motorcycle, I am " + define_me());
        String temp = super.define_me();
        System.out.println("My ancestor is a cycle who is " + temp);
    }

    String define_me() {
        return "a cycle  with an engine.";
    }

}

