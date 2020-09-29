package com.school.javacore.arrays;

public class ArraysExcrs1 {

    public static void main(String[] args){
        int[] numbersArray = new int[10];
        printIntArray(numbersArray);

        String[] studentNames = new String[100];
        studentNames[0] = "James";
        studentNames[1] = "Irina";
        final int NUMBER_OF_MONTHS = 12;
        String[] weekDays = new String[7];

        String[] namesOfMonths = new String[NUMBER_OF_MONTHS];

        int[] studentGrades = new int[20];
        studentGrades[0] = 50;
        studentGrades[4] = 89;
        studentGrades[4] = 100;

        System.out.println("the values in 4th index is "+ studentGrades[4]);

        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = i+1;
        }

        for (int j = 0; j < numbersArray.length; j++) {
            System.out.println(j+" "+numbersArray[j]);
        }

        String[] animals = {"dog", "cat", "horse", "sheep"};
        int[] daysOfWeek = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("The size of the array is "+ animals.length);
        for (int i=0; i< animals.length;i++){
            System.out.println("The index is "+i+ " the value inside is "+animals[i]);
        }

        int a = daysOfWeek[3] + daysOfWeek[2];
        System.out.println("Before increment "+daysOfWeek[1]);
        daysOfWeek[1]++;
        System.out.println("after increment "+daysOfWeek[1]);
        printIntArray(daysOfWeek);
    }

    public static void printIntArray(int[] numberArray){
        for (int i = 0; i < numberArray.length; i++){
            System.out.println("The index is "+i+ " the value inside is "+numberArray[i]);
        }
    }

}
