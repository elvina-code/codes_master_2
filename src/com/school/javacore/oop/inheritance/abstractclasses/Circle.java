package com.school.javacore.oop.inheritance.abstractclasses;

public class Circle extends Shape {

    private double raduis;

    public Circle(){
        this.raduis = 1.0;
    }

    public Circle(double radius){
        this.raduis = radius;
    }

    public Circle(String color, Boolean filled, double radius) {
        super(color, filled);
        this.raduis = radius;
    }

    public double getRaduis() {
        return raduis;
    }

    public void setRaduis(double raduis) {
        this.raduis = raduis;
    }

    @Override
    double getArea() {
        return Math.PI * raduis * raduis;
    }

    @Override
    double getPerimeter() {
        return 2* Math.PI * raduis;
    }


}
