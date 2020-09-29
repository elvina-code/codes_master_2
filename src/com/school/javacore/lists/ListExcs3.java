package com.school.javacore.lists;

import java.util.*;

public class ListExcs3 {

    /**Write a Java program to create a new array list,
     * add some colors (string) and print out the collection
     * **/

    public static void main(String[] args){
        ArrayList<String> colorList = new ArrayList<>();

        colorList.add("red");
        colorList.add("blue");
        colorList.add("white");
        colorList.add(null);

        String[] colorsArray = colorList.toArray(new String[0]);
        System.out.println(Arrays.toString(colorsArray));
       // colorList.add("purple");

        String salary = "3457";
        String tax = "10";

        double salaryParsed = Double.parseDouble(salary);
        int taxParsed = Integer.parseInt(tax);

        Integer convertedTaxWithValue = Integer.valueOf(tax);
        Double convertedSalaryWithValue = Double.valueOf(salary);

        Double convertedDouble1 = Double.valueOf("1");
        //Integer convertedInteger = Integer.valueOf("5.6");

        Double taxDeductedSalary = salaryParsed - (salaryParsed * taxParsed/100);

        System.out.println("Salary "+ salaryParsed+"\ntax "+taxParsed+"\nTaxDeductedSalary "+taxDeductedSalary);

        for (int i=0; i < colorList.size(); i++){
            if (colorList.get(i) != null)
                System.out.println(colorList.get(i).toUpperCase());
        }
        removeThirdElement(colorList);
        System.out.println(colorList.toString());

    }

    /**
     * Write a Java program to remove the third element from a array list
     * **/

    public static void removeThirdElement(ArrayList<String> list){
        if (list.size() >= 4){
            list.remove(3);
        } else {
            System.out.println("There is no third element!");
        }
    }
}
