package com.school.javacore.oop;

public class RationalDemo {

    //4. Write a main method that creates a new object with type Rational, sets
    //    its instance variables to some values, and displays the object.
    public static void main(String[] args){
        Rational rational1 = new Rational();

        rational1.printRational();

        rational1.setNumerator(2);
        rational1.setDenominator(3);

        rational1.printRational();

        rational1.setDenominator(-7);

        System.out.println(rational1.toString());
        System.out.println("sign check "+ rational1.getNumerator()/rational1.getDenominator()+ " "+rational1.calculateSign());
    }
}
