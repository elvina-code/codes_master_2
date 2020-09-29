package com.school.javacore.strings;

import java.util.stream.StreamSupport;

public class StringExcerises1 {
    public static void main(String[] args){
        int apples = 10;
        int bananas = 9;
        String appleName = "Apples";
        String bananaName = new String("Bananas");

        String sentence1 = "I have " + apples + " of " + appleName;
        String sentence2 = "I have " + bananas + " of " + bananaName;
        String sentence3 = "total of " + (apples + bananas) + " of "+appleName+" and " + bananaName;
        String sentence4 = "total of " + apples + bananas + " of "+appleName+" and " + bananaName;
        System.out.println(sentence1);
        System.out.println(sentence2);
        System.out.println(sentence3);
        System.out.println(sentence4);

        System.out.println("The length of sentence1 :" + sentence1.length());

        char someCharacter = bananaName.charAt(0);
        char lastChar = bananaName.charAt(bananaName.length() - 1 );

        System.out.println(someCharacter);
        System.out.println(lastChar);

        String bagOfWords = "balljkicountryiuyucakelllballllllcake";
        String cake = bagOfWords.substring(18);
        String country = bagOfWords.substring(7, 14);
        String ball = bagOfWords.substring(0, 4);
        System.out.println("The cake is "+cake);
        System.out.println("The country is "+country);
        System.out.println("The ball is "+ball);
        System.out.println(country.concat(ball.concat(cake))); // country+ball+cake
        System.out.println("The inde of c is "+bagOfWords.indexOf('c'));
        System.out.println("The index of word country is "+ bagOfWords.indexOf("country"));

        String someS = "June06July07August08";
            //0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
        //index of charactr 'a'
        int myindex = someS.indexOf('a');
        //extract word august
        String august = someS.substring(12, 18);
        System.out.println("August "+august);

        System.out.println("index of b "+bagOfWords.indexOf("ball", 3));
        System.out.println("index of cake "+bagOfWords.indexOf("cake", 25));
        System.out.println("last index of ball "+ bagOfWords.lastIndexOf("ball"));
        System.out.println("last index of l "+ bagOfWords.lastIndexOf('l'));

        String month09 = new String("September");
        String month09_1 = new String("September");

        String peach = "PEACh"; //peach
        String peachObject = new String("peach");
        String peach_2 = "Peach";

        System.out.println("September equals to september "+ (month09.equals(month09_1)));
        System.out.println("September == to september "+ (month09 == month09_1));

        System.out.println("peach is equals to peach object "+(peach.equals(peachObject)));
        System.out.println("peach == to peach object " +(peach == peachObject));
        System.out.println("peach == to peach_2  " +(peach == peach_2));
        System.out.println("Compare with ignoreing the case "+peach.equalsIgnoreCase("peach"));

        if (month09 == month09_1) {
            System.out.println("September is september");
        } else {
            System.out.println("September is not septeber");
        }

        System.out.println("some text in lower case".toUpperCase());
        System.out.println("SOME TEXT IN UPPER CASE".toLowerCase());

        String username = "        username ";
        String password = "password";

        System.out.println(username.length() +" --> length before trim");
        System.out.println(username.trim().length() +" --> length after trim");

        System.out.println("banana".replace('a', 'o'));

        System.out.println(bagOfWords);
        System.out.println(someS.trim().toLowerCase().substring(12,18).toUpperCase());

        int someVal = 65;
        char someChar = (char)someVal;
        int intvAlueOfB = (int)'B';

        System.out.println(someChar);
        System.out.println(someVal);
        System.out.println(intvAlueOfB);
        String appleBananas = appleName.concat(bananaName);
        System.out.println(">>>> I am an applename after concat "+appleName);
    }
}
