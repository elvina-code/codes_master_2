package com.school.javacore.oop.inheritance;

public class EmployeeDemo {

    public static void main(String[] args){

        Developer d = new Developer("John", "Smith");
        Testers t = new Testers("Elon", "Musk");
        System.out.println(d);
        System.out.println(t);
        System.out.println("Develeper salary " + d.getBaseSalary());
        System.out.println("Tester slary " + t.getBaseSalary());
        System.out.println(t.getSeleniumVersion());
    }
}
