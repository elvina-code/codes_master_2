package com.school.javacore.arrays;

import java.util.Random;

public class ArraySortingExcs {

    public static void main(String[] args){
        ArraySortingExcs ase = new ArraySortingExcs();

        int[] array = { 10, 11 ,7, 1, 0, 9, 2};
        System.out.println("Array before the soring!");
        ase.printIntArray(array);
        System.out.println("Array after the soring!");
        ase.sort(array);
        ase.printIntArray(array);
        ase.shuffle(array);
        System.out.println("Array after shuffle");
        ase.printIntArray(array);
        System.out.println("\n");
        ase.overwrite(array,11);
        ase.printIntArray(array);
    }

    public void sort(int[] array){
        for (int i=0; i < array.length; i++){
            for(int j = i; j < array.length; j++){
                if (array[i] > array[j]) {
                    swap(array, i, j);
                }
            }
        }
    }

    public void swap(int[] array, int srcIndex, int destIndex){
        int temp = array[srcIndex];
        array[srcIndex] = array[destIndex];
        array[destIndex] = temp;
    }
    public void printIntArray(int[] numberArray){
        for (int i = 0; i < numberArray.length; i++){
            System.out.println("["+i+ "]  = "+numberArray[i]);
        }
    }

    //Write a Java program to shuffle a given array of integers. [1,2,3,4] -> [2,1,4,3]
    public void shuffle(int[] array){
        Random random= new Random();

        for(int i = 0; i < array.length; i++){
            int a = random.nextInt(array.length);
            int b = random.nextInt(array.length);
            swap(array, a, b);
        }
    }

    // Write a Java program to insert 0 into some specific value
    public void overwrite(int[] array, int element){
        for(int i = 0; i < array.length; i++){
            if(array[i] == element){
                array[i] = 0;
            }
        }
    }

}
