package com.school.javacore.methods;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class HomeWork1Test {

    @Test
    public void testIsOdd(){
        HomeWork1 hw1 = new HomeWork1();
        boolean actualResult = hw1.isOdd(3);
        assertEquals("Should return true on odd numbers",true, actualResult);

       // assertThat(actualResult, is(equalTo(true)));

        boolean actualResultEven = hw1.isOdd(4);
        assertEquals("Should return false on even numbers: ", false, actualResultEven);

        boolean actualResultNegative = hw1.isOdd(-4);
        assertEquals("Should return false on even numbers: ", false, actualResultEven);
    }
}
