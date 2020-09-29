package com.school.javacore.methods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class MethodExcercisesTest {
    MethodsExcercises methodsExcercises = new MethodsExcercises();

    @Test
    public void testFindSmallest(){
        // test if given numbers 1 2 3 method is going to return 1
        int actualResult = methodsExcercises.findSmallest(1,2,3);
        assertEquals("Should return 1 on 1,2,3 ", 1, actualResult);
        assertNotNull("the result should not be null", actualResult);

        int actualResultNegative = methodsExcercises.findSmallest(-100, 9, -10);
        assertEquals("Should return -100 on -100,9,-10 ", -100, actualResultNegative);

        int actualResultEqualNumber = methodsExcercises.findSmallest(10, 10, 10);
        assertEquals("Should return any of given number ",10, actualResultEqualNumber);

    }

    @Test
    public void testLoneSum(){
        int result1 = methodsExcercises.loneSum(1,2,3);
        assertEquals("should be equal to 6", 6, result1);

        //1. if the given numbers are all equal it should return 0
        result1 = methodsExcercises.loneSum(10, 10 ,10);
        assertEquals(0, result1);

        //2. if the first two of given numbers are equal then should return 3rd number which is not equal to others
        result1 = methodsExcercises.loneSum(10, 10 ,11);
        assertEquals(11, result1);

        //3. if the any two of given numbers are equal then should return 3rd number which is not equal to others
        result1 = methodsExcercises.loneSum(10, 11 ,10);
        assertEquals(11, result1);

        //3. should return sum of all three number if all the number different from each other
        //2. if the first two of given numbers are equal then should return 3rd number which is not equal to others
        result1 = methodsExcercises.loneSum(10, 20 ,30);
        assertEquals(60, result1);
    }
}
