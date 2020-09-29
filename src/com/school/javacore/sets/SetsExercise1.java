package com.school.javacore.sets;

import java.util.*;

public class SetsExercise1 {

    public static void main(String[] args){
        Set<Integer> setOfNumbers = new HashSet<>();
        setOfNumbers.add(1);
        setOfNumbers.add(2);
        setOfNumbers.add(3);
        System.out.println("!!!!" + setOfNumbers.add(2));

        Set<String> setOfCities = new LinkedHashSet<>();
        setOfCities.add("Istanbul");
        setOfCities.add("Ashgabat");
        setOfCities.add("Moscow");
        setOfCities.add("Chicago");
        setOfCities.add("NY");



        for (Integer number: setOfNumbers){
            System.out.println(number);
        }

        System.out.println(setOfCities.remove("Ashgabat"));
        System.out.println(setOfCities.toString());


        System.out.println(setOfNumbers.remove(2));
        System.out.println(setOfNumbers.remove(5));
        System.out.println(setOfNumbers.toString());


        List<Integer> numberList = Arrays.asList(1,2,2,3,8,9,10,10,10,1,2,5,6);
        Set<Integer> noDuplicatesNumbersList = new HashSet<>(numberList);

        Set<Integer> noDupNumListLinkedHah = new LinkedHashSet<>(numberList);
        System.out.println(numberList.toString());
        System.out.println(noDuplicatesNumbersList.toString());

        System.out.println(noDupNumListLinkedHah);

        System.out.println("hashcode " + noDuplicatesNumbersList.hashCode());


        System.out.println(setOfCities.size() +" is size");
        //setOfCities.clear();
        System.out.println("isEmpty "+setOfCities.isEmpty());
        System.out.println(setOfCities.size() +" is size");

        List<String> usCities = Arrays.asList("NY", "Chicago");
        System.out.println(setOfCities.toString());
        setOfCities.removeAll(usCities);
        System.out.println(setOfCities.toString());

        Iterator<String> citiesIterator = setOfCities.iterator();
        while (citiesIterator.hasNext()){
            System.out.println(citiesIterator.next());
        }

        List<Integer> numberList1 = Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer> numberList2 = Arrays.asList(2,3,4,5,10,11);
        Set<Integer> numberSet1 = new HashSet<>(numberList1);
        Set<Integer> numberSet2 = new HashSet<>(numberList2);

        //numberSet1.removeAll(numberList2);
        numberSet1.retainAll(numberList2);
        System.out.println(numberSet1.toString());
    }
}
