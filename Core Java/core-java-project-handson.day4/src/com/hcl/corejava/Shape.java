package com.hcl.corejava;

public abstract class Shape {
    String name;


    public Shape(String name) {
        super();
        this.name = name;
    }


    public Shape() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract double CalculatedArea();


}

class Circle extends Shape {
    int radius;

    public Circle(String name, int radius) {

    }

    public double CalculatedArea() {
        return (float) (3.14 * radius * radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

class Square extends Shape {
    int side;

    public Square(String name, int side) {

    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public double CalculatedArea() {
        return side * side;

    }


}

class Rectangle extends Shape {
    int length;
    int breadth;

    public Rectangle(String name, int length, int breadth) {

    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public double CalculatedArea() {
        return length * breadth;
    }
}

