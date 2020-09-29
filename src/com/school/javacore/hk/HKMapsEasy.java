package com.school.javacore.hk;

import java.util.HashMap;
import java.util.Scanner;

public class HKMapsEasy {

    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        HashMap<String, Integer> phoneBook = new HashMap<>();
        int numberOfEntries = userInput.nextInt();
        userInput.nextLine();

        for (int i = 0; i< numberOfEntries; i++){
            String name = userInput.nextLine();
            int phoneNumber = userInput.nextInt();
            phoneBook.put(name, phoneNumber);
            userInput.nextLine();
        }

        while (userInput.hasNext()) {
            String query = userInput.nextLine();
            if (phoneBook.containsKey(query)) {
                System.out.println(query +"="+phoneBook.get(query));
            } else {
                System.out.println("Not Found");
            }
        }
    }
}
