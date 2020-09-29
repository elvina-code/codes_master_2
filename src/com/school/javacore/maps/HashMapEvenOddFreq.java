package com.school.javacore.maps;

import java.util.HashMap;

public class HashMapEvenOddFreq {


    public static void main(String[] args){

        HashMapEvenOddFreq hashMapEvenOddFreq = new HashMapEvenOddFreq();
        int[] array = {4,2,34,8,9,4,5,34,3,2,4,5,6,2,9,0,6,4,3};
        System.out.println(hashMapEvenOddFreq.calculateFreqOfOddEven(array).toString());
    }

    public HashMap<String, Integer> calculateFreqOfOddEven(int[] array){
        //1.create A hashmap
        //2.itereate through array of numbers and
        //  if the number is even, update value of map "even" +1
        //  if the number is odd, update value of map "odd" +1
        //3.return hashmap

        HashMap<String, Integer> resultMap = new HashMap<>();
        resultMap.put("even", 0);
        resultMap.put("odd", 0);

        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0) {
                resultMap.put("even", resultMap.get("even") + 1);
            } else {
                resultMap.put("odd", resultMap.get("odd") + 1);
            }
        }

        return resultMap;
    }
}
