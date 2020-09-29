package com.school.javacore.arrays;

import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.*;

public class ArraysSortingExcsTest {

    ArraySortingExcs arraySortingExcs = new ArraySortingExcs();

    @Test
    public void testShuffle(){
        int[] array1 = {2, 3, 1, 7};
        int[] array2 = {2, 3, 1, 7};
        arraySortingExcs.shuffle(array1);
        assertFalse(Arrays.equals(array1, array2));

        // if not shuffled, they should be equal to each other
        int[] array3 = {2, 3, 1, 7};
        int[] array4 = {2, 3, 1, 7};
        //arraySortingExcs.shuffle(array1);
        assertArrayEquals(array3, array4);
    }

    @Test
    public void testSort(){
        int[] array1 = {7, 4, 10, 1, 3};
        int[] array2 = {1, 3, 4, 7, 10};
        arraySortingExcs.sort(array1);
        assertTrue("after sorting the order must be like in array2", Arrays.equals(array1, array2));

        int[] array3 = {10, 1, 4, 3, 7};
        assertFalse("after sorting the order must not be like in array3", Arrays.equals(array1, array3));

    }

}
