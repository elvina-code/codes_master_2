package com.school.javacore.oop.inheritance;

public class Testers extends Employee{

    public String getSeleniumVersion() {
        return SeleniumVersion;
    }

    public void setSeleniumVersion(String seleniumVersion) {
        SeleniumVersion = seleniumVersion;
    }

    private String SeleniumVersion = "2.3.x";

    public Testers(String firstName, String lastName) {
        super(firstName, lastName, new String[]{"testing", "unit testing", "integration testing"}, 25);
    }

    @Override
    public Double getBaseSalary() {
        Double devSalary = super.getBaseSalary() + (super.getBaseSalary() * getPercentage()/100);
        return devSalary;
    }

    //salary = salary + (25%)
}
