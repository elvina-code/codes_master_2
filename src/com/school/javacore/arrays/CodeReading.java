package com.school.javacore.arrays;

public class CodeReading {

    public static void main(String[] args){
        CodeReading cd = new CodeReading();
        double[] array = {1.0, 2.0, 3.0, 4.0};

        System.out.println("something "+ cd.calculateAverage(array));
    }

    public double calculateAverage(double[] array){

        return calculateSum(array) / array.length;
    }

    public double calculateSum(double[] array){
        double s = 0.0;

        for (int i = 0; i < array.length; i++){
            s += array[i];
        }
        return s;
    }
}
