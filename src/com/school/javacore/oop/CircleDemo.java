package com.school.javacore.oop;

public class CircleDemo {

    public static void main(String[] args){
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(3.0);
        Circle circle3 = new Circle(1.2, "blue");
        System.out.println("color "+circle3.getColor()+" radius "+circle3.getRadius());

        circle3.setRadius(4.0);
        circle3.setColor("cyan");

        System.out.println("color "+circle3.getColor()+" radius "+circle3.getRadius());

        System.out.println("radus "+circle1.getRadius()+" area "+circle1.getArea());
        System.out.println("radus "+circle2.getRadius()+" area "+circle2.getArea());


    }
}
