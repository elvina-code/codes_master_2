package com.school.javacore;//package com.mycompany;

import java.util.Random;
import java.util.Scanner;

public class DevxPicker {

    public static void main(String[] args) {
        final int NUMBER_OF_STUDENTS = 19;

        Scanner userInput = new Scanner(System.in);
        boolean isValidInput = false;
        int appMode = 1;
        do {
            System.out.println("Please select mode (1 - QA_StudsOnly, 2 - Game_ALL )");
            if (userInput.hasNextInt()){
                isValidInput = true;
                appMode = userInput.nextInt();
            } else {
                isValidInput = false;
            }

            Random picker = new Random();
            int pickedNumber = picker.nextInt(NUMBER_OF_STUDENTS);

            switch (pickedNumber) {
                case 0:
                    System.out.println("Baktygul");
                    break;
                case 1:
                    System.out.println("Irina B");
                    break;
                case 2:
                    System.out.println("Jiyde");
                    break;
                case 3:
                    System.out.println("Aiana");
                    break;
                case 4:
                    System.out.println("Zalkar");
                    break;
                case 5:
                    System.out.println("Azamat");
                    break;
                case 6:
                    System.out.println("Irina R");
                    break;
                case 7:
                    System.out.println("Ram");
                    break;
                case 8:
                    System.out.println("Meruert");
                    break;
                case 9:
                    System.out.println("Mirgul");
                    break;
                case 10:
                    System.out.println("Elvina");
                    break;
                case 11:
                    System.out.println("Almaz");
                    break;
                case 12:
                    System.out.println("Kubah");
                    break;
                case 13:
                    System.out.println("Luis");
                    break;
                case 14:
                    if (appMode == 2) {
                        System.out.println("Nuta");
                        break;
                    }
                case 15:
                    System.out.println("Gauhar");
                    break;
                case 16:
                    if (appMode == 2) {
                        System.out.println("Mirlan");
                        break;
                    }
                case 17:
                    System.out.println("Oksana");
                    break;
                case 18:
                    System.out.println("Gulnaz");
                    break;
                default:
                    System.out.println("Please try again!");
                    break;
            }
        } while (isValidInput);
    }
}
