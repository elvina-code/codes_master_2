package com.school.javacore.oop;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class CircleTest {

    @Test
    public void emptyCircleConstructorTest(){
        Circle c1 = new Circle();
        assertNotNull(c1);
        assertEquals(c1.getColor(), "red");
        //assertEquals("", c1.getRadius(), 1.0);
        assertEquals(c1.getRadius(), 1.0, 0.0);
    }

    @Test
    public void oneParameterCircleConstructorTest(){
        Circle c1 = new Circle(3.1);
        assertNotNull(c1);
        assertEquals(c1.getColor(), "red");
        //assertEquals("", c1.getRadius(), 1.0);
        assertEquals(c1.getRadius(), 3.1, 0.0);
    }

    @Test
    public void setRaduisAndColorTest(){
        Circle c1 = new Circle();
        assertEquals(c1.getColor(), "red");
        assertEquals(c1.getRadius(), 1.0, 0.0);
        c1.setColor("pink");
        c1.setRadius(5.1);
        assertEquals(c1.getColor(), "pink");
        assertEquals(c1.getRadius(), 5.1, 0.0);
    }
}
