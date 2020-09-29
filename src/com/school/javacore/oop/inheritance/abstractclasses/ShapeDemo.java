package com.school.javacore.oop.inheritance.abstractclasses;

public class ShapeDemo {

    public static void main(String[] args){
        Shape[] shapes = new Shape[4];

        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square();
        shapes[3] = new Circle("blue", false, 5.7);

        for (Shape s: shapes) {
            System.out.println(s);
            System.out.println("area: "+s.getArea());
            System.out.println("perimeter: "+s.getPerimeter());
        }

    }
}
