package com.school.javacore.decisionstatements;

public class AboutTruth {
    public static void main(String[] args){
        int apples = 10;
        int peaches = 16;
        boolean isEqual = apples == peaches;
        boolean isNotEqual = apples != peaches;

        boolean isAppleIsGreaterThanPeaches = apples > peaches;
        boolean isAppleIsLessTahnPeaches = apples < peaches;

        boolean isAppleIsGreaterThanOrEqualToPeaches = apples >= peaches;
        boolean isAppleIsLessTahnOrEqualToPeaches = apples <= peaches;

        System.out.println(apples + " is equal to "+peaches+" = "+isEqual);
        System.out.println(apples + " is not equal to "+peaches+" = "+isNotEqual);

        System.out.println(apples + " is greater than "+peaches+" = " + isAppleIsGreaterThanPeaches);
        System.out.println(apples + " is less than "+peaches+" = " + isAppleIsLessTahnPeaches);

        System.out.println(apples + " is greater than or equal to "+peaches +" = "+isAppleIsGreaterThanOrEqualToPeaches);
        System.out.println(apples + " is less than or equal to "+peaches+" = "+isAppleIsLessTahnOrEqualToPeaches);


    }
}
