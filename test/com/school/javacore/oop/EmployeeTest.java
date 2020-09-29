package com.school.javacore.oop;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class EmployeeTest {

    @Test
    public void testRaiseSalary(){
        Employee employee = new Employee(1,"Name", "Surname", 200);
        int anualSalary = employee.getAnnualSalary();
        assertEquals(200, employee.getSalary());

        employee.raiseSalary(50);
        assertEquals(300, employee.getSalary());

        employee.raiseSalary(-50);
        assertEquals(450, employee.getSalary());
    }
}
