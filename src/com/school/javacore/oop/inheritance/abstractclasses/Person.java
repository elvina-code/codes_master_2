package com.school.javacore.oop.inheritance.abstractclasses;

public abstract class Person extends Human{

    abstract String getFirstName();

    abstract int getAge();

    public String sayHello(){
        return "Hey!";
    }
}
