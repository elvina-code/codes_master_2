package com.school.javacore.sets;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetSolution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        Set<String> namesSet = new HashSet<>();
        for (int i = 0; i < t; i++){
           String myValues = pair_left[i] + " " + pair_right[i];
           namesSet.add(myValues);
           System.out.println(namesSet.size());
        }
//Write your code here

    }
}
