package com.school.javacore.oop.inheritance;

public class Cylinder extends Circle {

    private int height;

    public Cylinder(int radius, String color, int height) {
        super(radius, color);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Double getVolume(){
        return height * super.getArea();
    }

    @Override
    public Double getArea() {
        return (2*Math.PI*getRadius()*height) + (2 * Math.PI * getRadius()*getRadius());
    }
}
