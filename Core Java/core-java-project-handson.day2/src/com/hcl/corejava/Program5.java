package com.hcl.corejava;

public class Program5 {

    public static void main(String[] args) {
        B b = new B();
        b.child();
        b.inherits();

    }
}

class A {
    void inherits() {
        System.out.println("inheriting to B");
    }
}

class B extends A {
    void child() {
        System.out.println("child of A.");
    }

}
