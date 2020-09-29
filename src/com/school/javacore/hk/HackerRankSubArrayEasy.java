package com.school.javacore.hk;

import java.util.Arrays;

public class HackerRankSubArrayEasy {

    //1. calculate the sub arrays :Done
    //2. calculate the sum of sub arrays: Done
    //3. decide if the sum is negative or positive

    public static void main(String[] args){
        int[] a = {1,2,3,4};
        int[] arr2 = {1,2,3,5};

        int counter = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = i; j < a.length; j++){
                printSubArray(a, i, j);
                System.out.println();
                int subArraySum = calculate1DArraySum(a, i, j);
                if (subArraySum < 0){
                   counter++;
                }
              //  System.out.println("The sum of sub array starts at "+i+" ends at "+j+"="+subArraySum);
               // System.out.println();
            }
            System.out.println();
        }
       // System.out.println("The number of sub arrays with negative sum is "+counter);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(arr2));
        System.out.println("a is equal to a " + isEqualArrays(a,a));
        System.out.println("a is equal to arr2 " + isEqualArrays(a,arr2));

    }

    public static void printSubArray(int[] array, int start, int end){
        for (int i = start; i<= end; i++){
            System.out.print(array[i]+" ");
        }
    }

    public static int calculate1DArraySum(int[] array, int start, int end){
        int sum = 0;
        for (int i = start; i <= end; i++)
            sum += array[i];

        return sum;
    }


    public static Boolean isEqualArrays(int[] arr1, int[] arr2){
        Boolean result = false;
        if (arr1.length == arr2.length){
            for (int i = 0; i < arr1.length; i++){
                if (arr1[i] == arr2[i]) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
        }

        return result;
    }
}

