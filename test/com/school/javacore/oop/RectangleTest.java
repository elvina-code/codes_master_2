package com.school.javacore.oop;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class RectangleTest {

    @Test
    public void testCalculateArea(){
        Rectangle r1 = new Rectangle();
        float area = r1.calculateArea();
        assertNotNull(r1);
        assertEquals(1.0, area, 0.0);
    }
}
