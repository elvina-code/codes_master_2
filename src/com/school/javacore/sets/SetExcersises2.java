package com.school.javacore.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetExcersises2 {

    public static void main(String[] args){

        int[] array = {1,2,2,3,5,6,7,3,7,8,10,10};
        Integer[] array1 = {1,2,2,3,5,6,7,3,7,8,10,10};
        Integer[] array2 = {1,100,2,200};
        SetExcersises2 setExcersises2 = new SetExcersises2();
        Integer[] result = setExcersises2.removeDuplicatesUpdated(array1);
        System.out.println("before "+ setExcersises2.toStringU(array1));
        System.out.println("after "+ Arrays.toString(result));

        System.out.println("array1 "+Arrays.toString(array1));
        System.out.println("array2 "+Arrays.toString(array2));
        System.out.println("Common elements are "+Arrays.toString(
                setExcersises2.findCommonElements(array1, array2)));
        System.out.println("Difference are "+Arrays.toString(
                setExcersises2.findDifferentElements(array1, array2)));
        System.out.println("Union are "+Arrays.toString(
                setExcersises2.findUnionElements(array1, array2)));
    }

    /*
    * 1. method accepts array of int and returns array of int
    * 2. define hashset add elements of array into it to remove duplicates
    * 3. define an array to contain final result(numbers duplicates removed)
    * 4. populate it with the elements from hashset
    * 5. return it
    * */


    public int[] removeDuplicates(int[] arr){
        Set<Integer> noDupSet = new HashSet<>();

        for (int i = 0; i< arr.length; i++){
            noDupSet.add(arr[i]);
        }

        int[] finalArray = new int[noDupSet.size()];

        int counter = 0;
        for (Integer element: noDupSet){
            finalArray[counter++] = element;
        }

        return finalArray;
     }

    public Integer[] removeDuplicatesUpdated(Integer[] arr){
        HashSet<Integer> noDupSet = new HashSet<>(Arrays.asList(arr));
        return noDupSet.toArray(new Integer[0]);
    }

    public String toStringU(Integer[] array){
        String result="[";
        for (Integer element: array)
            result += ", "+element;
        return result+"]";
    }

 /*   1. method which returns difference of two arrays  -->  [1,2,3,1,2,5,7]  [2,3,7,8,1,1,10]  result should be [8,10,5]
      2. method which returns common elements of two arrays -->  [1,2,3,1,2,5,7]  [2,3,7,8,1,1,10]  result should be [1,2,3,7]
      3. method which return union of elements of two arrays  --> [1,2,3,1,2,5,7]  [2,3,7,8,1,1,10]  result should be [1,2,3,5,7,8,10]
*/
    public Integer[] findCommonElements(Integer[] arr1, Integer[] arr2){
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(arr1));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(arr2));
        set1.retainAll(set2);
        return set1.toArray(new Integer[set1.size()]);
    }

    public Integer[] findDifferentElements(Integer[] arr1, Integer[] arr2){
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(arr1));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(arr2));
        HashSet<Integer> tempSet = (HashSet<Integer>) set1.clone();

        set1.removeAll(set2);
        set2.removeAll(tempSet);

        set1.addAll(set2);
        System.out.println("---"+set2.toString());
        System.out.println("---"+set1.toString());
        return set1.toArray(new Integer[0]);
    }

    public Integer[] findUnionElements(Integer[] arr1, Integer[] arr2){
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(arr1));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(arr2));
        set1.addAll(set2);
        return set1.toArray(new Integer[set1.size()]);
    }



}
