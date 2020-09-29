package com.school.javacore.decisionstatements;

public class TruthTable {
    public static void main(String[] args){
        int ageOfAnn = 18;
        int ageOfBob = 15;

        char maritalStatus ='u';
        int age = 33;
        int height = 181;
        int weight = 71;

        int y, m, d;

        boolean isEligible = (maritalStatus == 'u') && (age > 21 && age <= 35) && (height > 180) && (weight > 70 && weight < 80);

        boolean experiment1 = (ageOfAnn < ageOfBob) && (ageOfAnn >= ageOfBob) || (ageOfBob != ageOfBob);

        boolean experiment2 = !((ageOfAnn > ageOfBob) && (ageOfAnn <= ageOfBob) || !(ageOfAnn == ageOfBob));

        y = 2011;
        m = 9;
        d = 14;

        boolean isDateInRange = (y <= 2010) && (d >= 1 && d <= 15) && (m <= 10 && m >= 1);

        String experiment3 = (y <= 2010) ? "Yes" : "No";

        int experiment4 = (d > 15) ? 15 : 5;


        System.out.println("Experiment 3, :"+ experiment3);

        System.out.println("Experiment 4 " + experiment4);

        System.out.println(y +" Year, "+ m +" Month, "+ d+" Day, isIn Range = " + isDateInRange);
        System.out.println(experiment1);
        System.out.println(experiment2);

        boolean experiment5 = true || false && false;

        System.out.println("Experiment5 " +experiment5);
    }
}
