package com.school.javacore.lists;

import java.util.ArrayList;

public class ShiftLeftListFix {
    public static void shiftLeftOne(ArrayList<Integer> list)
    {
        Integer firstElement = list.remove(0);
        list.add(firstElement);
    }

    public static void main(String[] args)
    {
        //instantiate ArrayList and fill with Integers
        ArrayList<Integer> values = new ArrayList<Integer>();
        int[] nums = {1, 2, 3, 4, 5};
        for (int i = 0; i < nums.length; i ++)
        {
            values.add(nums[i]);
        }
        System.out.println(values.toString());
        shiftLeftOne(values);
        System.out.println(values.toString());
        shiftLeftOne(values);
        System.out.println(values.toString());
        shiftLeftOne(values);
        System.out.println(values.toString());
        //System.out.println("Expected Result:\t [2, 3, 4, 5, 1]");

        System.out.println("Your Result:\t\t " + values);
    }
}
