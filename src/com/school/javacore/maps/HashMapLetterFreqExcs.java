package com.school.javacore.maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMapLetterFreqExcs {

  public static void main(String[] args) {
        HashMapLetterFreqExcs hashMapLetterFreqExcs = new HashMapLetterFreqExcs();
        String s = "When news broke in April that the drug remdesivir had been shown to speed recovery in patients hospitalized with COVID-19, Anthony Fauci, director of the U.S. National Institute of Allergy and Infectious Diseases, hailed the finding as “an important proof of concept” in the race to bring the pandemic to heel." +
                "Unlike a vaccine, which prompts the body to mount a defense against invading viruses, remdesivir is an antiviral drug, which hampers the ability of a virus to replicate and spread. For now, results related to remdesivir are mixed, although some studies continue to suggest the drug can improve outcomes for patients with severe forms of COVID-19. Still, only a few decades ago, most scientists doubted such a thing was even possible—that a tiny, parasitic particle wholly reliant on a host cell to reproduce could be inhibited without harm to the cell itself." +
                "Now, antivirals are used to treat herpes, hepatitis, HIV, Ebola, and more. And arguably, none would exist today were it not for Gertrude “Trudy” Elion." +
                "Born in 1918 in Manhattan, Elion overcame early financial hardship and outright sexism to win the 1988 Nobel Prize in Physiology or Medicine, becoming only the fifth woman to do so. She shared the award with her longtime collaborator George Hitchings, who hired her in 1944 to join his biochemistry lab at the pharmaceutical company Burroughs Wellcome (now part of GlaxoSmithKline)." +
                "It was only after Hitchings’ retirement from active research in 1967 that Elion embarked on what she would later describe as her “antiviral odyssey.” By then, Elion “had had enough already of being junior” and seized the opportunity, at last, “to show what I could do on my own,” she told writer Sharon Bertsch McGrayne, author of the 2001 book Nobel Prize Women in Science.";
        System.out.println(hashMapLetterFreqExcs.calculateWordFrequencies(s).toString());
        System.out.println(hashMapLetterFreqExcs.caculateLetterFrequency(s).toString());
  }

  public HashMap<String, Integer> calculateWordFrequencies(String text){
    HashMap<String, Integer> resultMap = new HashMap<>();
    //"we are learning programming language java . java is good programming language"
    String[] words = text.split(" ");
    System.out.println(Arrays.toString(words));
    for (String word: words) {
      if (!resultMap.containsKey(word))
        resultMap.put(word, 1);
      else
        resultMap.put(word, resultMap.get(word) + 1);
    }
    return resultMap;
  }

  public HashMap<Character, Integer> caculateLetterFrequency(String text){
    HashMap<Character, Integer> frequencyMap = new HashMap<>();
    char[] strArray = text.toCharArray();

    for (int i=0; i < strArray.length; i++ ){
      if (!frequencyMap.containsKey(strArray[i])){
        frequencyMap.put(strArray[i], 1);
      } else {
        frequencyMap.put(strArray[i], frequencyMap.get(strArray[i])+1);
      }
    }
    return  frequencyMap;
  }
}
