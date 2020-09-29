package com.school.javacore.decisionstatements;

import java.util.Scanner;

public class AboutSwitch {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int a;
        System.out.println("Please enter day of week in number and I will convert to text!");
        int dayOfWeekInNumber = userInput.nextInt();
        String dayOfWeekInText = "";

        switch (dayOfWeekInNumber) {
            case 1:
                dayOfWeekInText = "Monday";
                break;
            case 2:
                dayOfWeekInText = "Tuesday";
                break;
            case 3:
                dayOfWeekInText = "Wednesday";
                break;
            case 4:
                dayOfWeekInText = "Thursday";
                break;
            case 5:
                dayOfWeekInText = "Friday";
                break;
            case 6:
                dayOfWeekInText = "Saturday";
                break;
            case 7:
                dayOfWeekInText = "Sunday";
                break;
            default:
                System.out.println("You entered wrong number");
                break;
        }

        if (dayOfWeekInText != "") {
            System.out.println("The day of week in text is " + dayOfWeekInText);
        }



    }
}
