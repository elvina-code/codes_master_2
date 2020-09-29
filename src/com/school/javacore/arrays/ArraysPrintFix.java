package com.school.javacore.arrays;

import java.util.Arrays;

public class ArraysPrintFix {
    public static void main(String[] args)
    {
        int[] arr1 = {1, 3, 7, 9, 15, 17};
        for (int index = 0; index < arr1.length; index+=2)
        {
            System.out.print(index + ", " + arr1[index]+"\n");
        }

        int[] a1 = {1, 3, 7, 9, 15};
        for (int i = a1.length - 1; i >= 0; i--)
            System.out.print(a1[i] + ", ");

        System.out.println("Largest of "+ Arrays.toString(arr1) + " "+ largest(arr1));

        String[] strArr = {"hi", "bye", "hola"};
        System.out.println("sum of charatcters "+ Arrays.toString(strArr)+" is "+ getSumChars(strArr));

        int[] a2 = {1, 2, 5, 3, -1, -20};
        System.out.println("The code should print 11 " +
                "and your answer is: " + getSumNonNeg(a2));

        for (int i = 5; i >= 1; i--){
            for (int j = 0; j < i; j++){
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println("--------------------------");
        int[] arr = {20, 3, 18, 55, 4};
        System.out.println(getAverage(arr));;
    }

    public static int getSum(int[] arr)
    {
        int sum = 0;
        int counter = 0;
        while (counter < arr.length) {
            sum += arr[counter];
            counter++;
        }
        /*** for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        */

        return sum;
    }

    private static int largest(int[] arr){
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            } //end conditional

        } //end for loop

        return largest;
    }

    public static int getSumChars(String[] strArr)
    {
        int sumOfChars = 0;
        for (int i=0; i< strArr.length; i++){
            sumOfChars += strArr[i].length();
        }
        return sumOfChars;
    }

    public static int getSumNonNeg(int[] arr)
    {
        int sum = 0;
        for (int value : arr){
            if (value >= 0)
                sum += value;
        }
        return sum;
    }

    public static double getAverage(int[] arr)
    {
        int sum = 0;
        for (int i=0; i< arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }


}
