package com.school.javacore.strings;

public class DetectDuplicates {

    public static void main(String[] args){
        String arrString = "adhfhfhhhhhhhhasjfjfjaaaaaaa";
        StringBuilder strB = new StringBuilder(arrString);
        int duplicateCounter = 0;
        for (int i = 0; i < strB.length(); i++ ){
            duplicateCounter = 0;
            for (int j = i + 1; j < strB.length(); j++){
                if (strB.charAt(i) == strB.charAt(j)){
                    duplicateCounter++;
                    strB.deleteCharAt(j);
                }
            }
            System.out.println(strB.charAt(i)+ " has "+ duplicateCounter + "of duplicates");

        }
    }
}
