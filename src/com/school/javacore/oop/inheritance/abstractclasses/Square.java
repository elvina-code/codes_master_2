package com.school.javacore.oop.inheritance.abstractclasses;

public class Square extends Shape{

    private double side;

    public Square(){
        this.side = 1.0;
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, Boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    double getArea() {
        return side * side;
    }

    @Override
    double getPerimeter() {
        return 4*side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                "} " + super.toString();
    }
}
