package com.school.javacore.arrays;

public class CodeReading1 {

    public static void main(String[] args){

        CodeReading1 cr1 = new CodeReading1();
        int[] array = {1,2,3,5,4,10};
        System.out.println("first try "+cr1.search(array, -1));
        System.out.println("second try "+cr1.search(array,  7));
        System.out.println("the minumum value of "+cr1.findMinimum(array));
        System.out.println("the maximum values is : " +cr1.findMaximum(array));
        System.out.println("array before swap!");
        cr1.printIntArray(array);
        System.out.println("array after swap");
        cr1.swap(array, 3, 4);
        cr1.printIntArray(array);
    }

    public int search(int[] array, int element){
        int a = -1;
        for (int i=0; i< array.length; i++) {
            if (array[i] == element) {
                a = i;
                break;
            }
        }
        return a;
    }

    public int findMinimum(int[] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }

    public int findMaximum(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] > max)
                max = array[i];
        }

        return max;
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
}

