package com.school.javacore.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExcs2 {

    public static void main(String[] args){
        String[] cities = {"Chicago", "NY", "SF", "London", "Johannesburg", "Bishkek", "Almaty","NY", "Almaty","London"};

        ArrayList<String> listOfCities = new ArrayList<>();
        for (int i = 0; i <cities.length; i++ ) {
            listOfCities.add(cities[i]);
        }

        ArrayList listOfObjects = new ArrayList();

        listOfObjects.add("city");
        listOfObjects.add("country");
        listOfObjects.add(5);

        Object[] arrayOfObjects = listOfObjects.toArray();

        String[] citiesConverted = listOfCities.toArray(new String[0]);

        List<String> listOfCities2 = Arrays.asList(cities);

        System.out.println(listOfCities.toString());

        removeDuplicates(listOfCities);

        System.out.println(listOfCities.toString());

        if (listOfCities.contains("London")){
            System.out.println("London is capital city of GB!");
        }

        if (listOfCities.contains("Moscow")){
            System.out.println("Moscow is capital city of Russia!");
        } else {
            System.out.println("Sorry no Moscow!");
        }

    }

    public static void removeDuplicates(ArrayList<String> listOfCities){
        for (int i = 0; i < listOfCities.size(); i++){
            for (int j = i + 1; j < listOfCities.size(); j++){
                if (listOfCities.get(i).equals(listOfCities.get(j))){
                    listOfCities.remove(j);
                }
            }
        }
    }

}
